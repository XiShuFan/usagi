package com.group_finity.mascot.action;

import com.group_finity.mascot.Mascot;
import com.group_finity.mascot.exception.LostGroundException;
import com.group_finity.mascot.exception.VariableException;

public interface Action {
   void init(Mascot var1) throws VariableException;

   boolean hasNext() throws VariableException;

   void next() throws LostGroundException, VariableException;
}
