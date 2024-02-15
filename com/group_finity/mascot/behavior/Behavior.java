package com.group_finity.mascot.behavior;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.exception.CantBeAliveException;
import java.awt.event.MouseEvent;

public interface Behavior {
   void init(Mascot var1) throws CantBeAliveException;

   void next() throws CantBeAliveException;

   void mousePressed(MouseEvent var1) throws CantBeAliveException;

   void mouseReleased(MouseEvent var1) throws CantBeAliveException;

   boolean isHidden();
}
