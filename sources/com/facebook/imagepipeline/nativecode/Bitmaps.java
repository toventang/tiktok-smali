package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imageutils.b;

public class Bitmaps {
    private static native void nativeCopyBitmap(Bitmap bitmap, int i2, Bitmap bitmap2, int i3, int i4);

    static {
        Covode.recordClassIndex(29195);
        b.a("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        MethodCollector.i(14394);
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        i.a(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        i.a(z2);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        i.a(z3);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
        MethodCollector.o(14394);
    }
}
