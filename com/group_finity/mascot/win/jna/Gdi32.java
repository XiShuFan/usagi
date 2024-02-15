package com.group_finity.mascot.win.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface Gdi32 extends StdCallLibrary {
   Gdi32 INSTANCE = (Gdi32)Native.loadLibrary("Gdi32", Gdi32.class);
   int DIB_RGB_COLORS = 0;

   Pointer CreateCompatibleDC(Pointer var1);

   Pointer SelectObject(Pointer var1, Pointer var2);

   int DeleteDC(Pointer var1);

   Pointer CreateDIBSection(Pointer var1, BITMAPINFOHEADER var2, int var3, Pointer var4, Pointer var5, int var6);

   int GetObjectW(Pointer var1, int var2, BITMAP var3);

   int DeleteObject(Pointer var1);

   Pointer CreateRectRgn(int var1, int var2, int var3, int var4);

   int GetRgnBox(Pointer var1, RECT var2);
}
