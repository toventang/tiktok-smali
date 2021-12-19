package com.lynx.tasm.utils;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;

public class BlurUtils {
    static {
        Covode.recordClassIndex(35465);
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i2, int i3);

    public static void iterativeBoxBlur(Bitmap bitmap, int i2) {
        MethodCollector.i(13750);
        if (bitmap == null) {
            LLog.a(5, "Blur", "bitmap is null");
            MethodCollector.o(13750);
        } else if (i2 <= 0) {
            LLog.a(5, "Blur", "radius <= 0");
            MethodCollector.o(13750);
        } else {
            try {
                nativeIterativeBoxBlur(bitmap, 3, i2);
                MethodCollector.o(13750);
            } catch (RuntimeException e2) {
                LLog.a(5, "Blur", e2.getMessage());
                MethodCollector.o(13750);
            }
        }
    }
}
