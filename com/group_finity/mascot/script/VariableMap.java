package com.group_finity.mascot.script;

import com.group_finity.mascot.Main;
import com.group_finity.mascot.exception.VariableException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import javax.script.Bindings;

public class VariableMap extends AbstractMap<String, Object> implements Bindings {
   private final Map<String, Variable> rawMap = new LinkedHashMap();
   private final Set<Entry<String, Object>> entrySet = new AbstractSet<Entry<String, Object>>() {
      public Iterator<Entry<String, Object>> iterator() {
         return new Iterator<Entry<String, Object>>() {
            private Iterator<Entry<String, Variable>> rawIterator = VariableMap.this.getRawMap().entrySet().iterator();

            public boolean hasNext() {
               return this.rawIterator.hasNext();
            }

            public Entry<String, Object> next() {
               final Entry<String, Variable> rawKeyValue = (Entry)this.rawIterator.next();
               final Object value = rawKeyValue.getValue();
               return new Entry<String, Object>() {
                  public String getKey() {
                     return (String)rawKeyValue.getKey();
                  }

                  public Object getValue() {
                     try {
                        return ((Variable)value).get(VariableMap.this);
                     } catch (VariableException var2) {
                        throw new RuntimeException(var2);
                     }
                  }

                  public Object setValue(Object valuex) {
                     throw new UnsupportedOperationException(Main.getInstance().getLanguageBundle().getString("SetValueNotSupportedErrorMessage"));
                  }
               };
            }

            public void remove() {
               this.rawIterator.remove();
            }
         };
      }

      public int size() {
         return VariableMap.this.getRawMap().size();
      }
   };

   public Map<String, Variable> getRawMap() {
      return this.rawMap;
   }

   public void init() {
      Iterator var1 = this.getRawMap().values().iterator();

      while(var1.hasNext()) {
         Variable o = (Variable)var1.next();
         o.init();
      }

   }

   public void initFrame() {
      Iterator var1 = this.getRawMap().values().iterator();

      while(var1.hasNext()) {
         Variable o = (Variable)var1.next();
         o.initFrame();
      }

   }

   public Set<Entry<String, Object>> entrySet() {
      return this.entrySet;
   }

   public Object put(String key, Object value) {
      Object result;
      if (value instanceof Variable) {
         result = this.getRawMap().put(key, (Variable)value);
      } else {
         result = this.getRawMap().put(key, new Constant(value));
      }

      return result;
   }
}
