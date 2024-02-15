package com.group_finity.mascot.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Entry {
   private Element element;
   private Map<String, String> attributes;
   private List<Entry> children;
   private Map<String, List<Entry>> selected = new HashMap();

   public Entry(Element element) {
      this.element = element;
   }

   public String getName() {
      return this.element.getTagName();
   }

   public Map<String, String> getAttributes() {
      if (this.attributes != null) {
         return this.attributes;
      } else {
         this.attributes = new LinkedHashMap();
         NamedNodeMap attrs = this.element.getAttributes();

         for(int i = 0; i < attrs.getLength(); ++i) {
            Attr attr = (Attr)attrs.item(i);
            this.attributes.put(attr.getName(), attr.getValue());
         }

         return this.attributes;
      }
   }

   public String getAttribute(String attributeName) {
      Attr attribute = this.element.getAttributeNode(attributeName);
      return attribute == null ? null : attribute.getValue();
   }

   public boolean hasChild(String tagName) {
      Iterator var2 = this.getChildren().iterator();

      Entry child;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         child = (Entry)var2.next();
      } while(!child.getName().equals(tagName));

      return true;
   }

   public List<Entry> selectChildren(String tagName) {
      List<Entry> children = (List)this.selected.get(tagName);
      if (children != null) {
         return children;
      } else {
         children = new ArrayList();
         Iterator var3 = this.getChildren().iterator();

         while(var3.hasNext()) {
            Entry child = (Entry)var3.next();
            if (child.getName().equals(tagName)) {
               children.add(child);
            }
         }

         this.selected.put(tagName, children);
         return children;
      }
   }

   public List<Entry> getChildren() {
      if (this.children != null) {
         return this.children;
      } else {
         this.children = new ArrayList();
         NodeList childNodes = this.element.getChildNodes();

         for(int i = 0; i < childNodes.getLength(); ++i) {
            Node childNode = childNodes.item(i);
            if (childNode instanceof Element) {
               this.children.add(new Entry((Element)childNode));
            }
         }

         return this.children;
      }
   }
}
