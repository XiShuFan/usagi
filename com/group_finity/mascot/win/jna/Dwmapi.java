package com.group_finity.mascot.win.jna;

import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.LongByReference;
import com.sun.jna.win32.StdCallLibrary;

public interface Dwmapi extends StdCallLibrary {
   Dwmapi INSTANCE = (Dwmapi)Native.loadLibrary("Dwmapi", Dwmapi.class);
   int DWMWA_CLOAKED = 14;

   NativeLong DwmGetWindowAttribute(Pointer var1, int var2, LongByReference var3, int var4);
}
