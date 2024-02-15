package com.group_finity.mascot;

import com.group_finity.mascot.config.Configuration;
import com.group_finity.mascot.exception.BehaviorInstantiationException;
import com.group_finity.mascot.exception.CantBeAliveException;
import java.awt.Point;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager {
   private static final Logger log = Logger.getLogger(Manager.class.getName());
   public static final int TICK_INTERVAL = 40;
   private final List<Mascot> mascots = new ArrayList();
   private final Set<Mascot> added = new LinkedHashSet();
   private final Set<Mascot> removed = new LinkedHashSet();
   private boolean exitOnLastRemoved = true;
   private Thread thread;

   public void setExitOnLastRemoved(boolean exitOnLastRemoved) {
      this.exitOnLastRemoved = exitOnLastRemoved;
   }

   public boolean isExitOnLastRemoved() {
      return this.exitOnLastRemoved;
   }

   public Manager() {
      // 守护线程
      Thread var10001 = new Thread() {
         {
            this.setDaemon(true);
            this.start();
         }

         public void run() {
            while(true) {
               try {
                  // 睡眠时间24天
                  Thread.sleep(2147483647L);
               } catch (InterruptedException var2) {
               }
            }
         }
      };
   }

   public void start() {
      if (this.thread == null || !this.thread.isAlive()) {
         this.thread = new Thread() {
            public void run() {
               long prev = System.nanoTime() / 1000000L;

               try {
                  while(true) {
                     while(true) {
                        long cur = System.nanoTime() / 1000000L;
                        if (cur - prev >= 40L) {
                           if (cur > prev + 80L) {
                              prev = cur;
                           } else {
                              prev += 40L;
                           }
                           // TODO: 每40毫秒前进一个时间步长
                           Manager.this.tick();
                        } else {
                           Thread.sleep(1L, 0);
                        }
                     }
                  }
               } catch (InterruptedException var5) {
               }
            }
         };
         this.thread.setDaemon(false);
         this.thread.start();
      }
   }

   public void stop() {
      if (this.thread != null && this.thread.isAlive()) {
         this.thread.interrupt();

         try {
            this.thread.join();
         } catch (InterruptedException var2) {
         }

      }
   }

   private void tick() {
      NativeFactory.getInstance().getEnvironment().tick();
      synchronized(this.getMascots()) {
         Iterator var2 = this.getAdded().iterator();

         Mascot mascot;
         // TODO: 新增的pet
         while(var2.hasNext()) {
            mascot = (Mascot)var2.next();
            this.getMascots().add(mascot);
         }

         this.getAdded().clear();
         var2 = this.getRemoved().iterator();

         // TODO: 移除的pet
         while(var2.hasNext()) {
            mascot = (Mascot)var2.next();
            this.getMascots().remove(mascot);
         }

         this.getRemoved().clear();
         var2 = this.getMascots().iterator();

         // TODO: 每个pet前进一个时间步长
         while(var2.hasNext()) {
            mascot = (Mascot)var2.next();
            mascot.tick();
         }

         var2 = this.getMascots().iterator();

         // TODO: 每个pet完成一次动作
         while(true) {
            if (!var2.hasNext()) {
               break;
            }

            mascot = (Mascot)var2.next();
            mascot.apply();
         }
      }

      // 没有pet之后退出
      if (this.isExitOnLastRemoved() && this.getMascots().size() == 0) {
         Main.getInstance().exit();
      }

   }

   public void add(Mascot mascot) {
      synchronized(this.getAdded()) {
         this.getAdded().add(mascot);
         this.getRemoved().remove(mascot);
      }

      mascot.setManager(this);
   }

   public void remove(Mascot mascot) {
      synchronized(this.getAdded()) {
         this.getAdded().remove(mascot);
         this.getRemoved().add(mascot);
      }

      mascot.setManager((Manager)null);
   }

   public void setBehaviorAll(String name) {
      synchronized(this.getMascots()) {
         Iterator var3 = this.getMascots().iterator();

         while(var3.hasNext()) {
            Mascot mascot = (Mascot)var3.next();

            try {
               Configuration configuration = Main.getInstance().getConfiguration(mascot.getImageSet());
               mascot.setBehavior(configuration.buildBehavior(configuration.getSchema().getString(name)));
            } catch (BehaviorInstantiationException var7) {
               log.log(Level.SEVERE, "Failed to initialize the following actions", var7);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var7.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
               mascot.dispose();
            } catch (CantBeAliveException var8) {
               log.log(Level.SEVERE, "Fatal Error", var8);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var8.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
               mascot.dispose();
            }
         }

      }
   }

   public void setBehaviorAll(Configuration configuration, String name, String imageSet) {
      synchronized(this.getMascots()) {
         Iterator var5 = this.getMascots().iterator();

         while(var5.hasNext()) {
            Mascot mascot = (Mascot)var5.next();

            try {
               if (mascot.getImageSet().equals(imageSet)) {
                  mascot.setBehavior(configuration.buildBehavior(configuration.getSchema().getString(name)));
               }
            } catch (BehaviorInstantiationException var9) {
               log.log(Level.SEVERE, "Failed to initialize the following actions", var9);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var9.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
               mascot.dispose();
            } catch (CantBeAliveException var10) {
               log.log(Level.SEVERE, "Fatal Error", var10);
               Main.showError(Main.getInstance().getLanguageBundle().getString("FailedSetBehaviourErrorMessage") + "\n" + var10.getMessage() + "\n" + Main.getInstance().getLanguageBundle().getString("SeeLogForDetails"));
               mascot.dispose();
            }
         }

      }
   }

   public int getCount() {
      return this.getCount((String)null);
   }

   public int getCount(String imageSet) {
      synchronized(this.getMascots()) {
         if (imageSet == null) {
            return this.getMascots().size();
         } else {
            int count = 0;

            for(int index = 0; index < this.getMascots().size(); ++index) {
               Mascot m = (Mascot)this.getMascots().get(index);
               if (m.getImageSet().equals(imageSet)) {
                  ++count;
               }
            }

            return count;
         }
      }
   }

   private List<Mascot> getMascots() {
      return this.mascots;
   }

   private Set<Mascot> getAdded() {
      return this.added;
   }

   private Set<Mascot> getRemoved() {
      return this.removed;
   }

   public WeakReference<Mascot> getMascotWithAffordance(String affordance) {
      synchronized(this.getMascots()) {
         Iterator var3 = this.getMascots().iterator();

         Mascot mascot;
         do {
            if (!var3.hasNext()) {
               return null;
            }

            mascot = (Mascot)var3.next();
         } while(!mascot.getAffordances().contains(affordance));

         return new WeakReference(mascot);
      }
   }

   public boolean hasOverlappingMascotsAtPoint(Point anchor) {
      int count = 0;
      synchronized(this.getMascots()) {
         Iterator var4 = this.getMascots().iterator();

         do {
            if (!var4.hasNext()) {
               return false;
            }

            Mascot mascot = (Mascot)var4.next();
            if (mascot.getAnchor().equals(anchor)) {
               ++count;
            }
         } while(count <= 1);

         return true;
      }
   }

   public void disposeAll() {
      synchronized(this.getMascots()) {
         for(int i = this.getMascots().size() - 1; i >= 0; --i) {
            ((Mascot)this.getMascots().get(i)).dispose();
         }

      }
   }
}
