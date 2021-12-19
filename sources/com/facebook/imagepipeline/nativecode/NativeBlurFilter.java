package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imageutils.b;

public class NativeBlurFilter {
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i2, int i3);

    static {
        Covode.recordClassIndex(29197);
        b.a("native-filters");
    }

    public static void iterativeBoxBlur(Bitmap bitmap, int i2, int i3) {
        boolean z;
        MethodCollector.i(3070);
        i.a(bitmap);
        boolean z2 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i3 <= 0) {
            z2 = false;
        }
        i.a(z2);
        nativeIterativeBoxBlur(bitmap, i2, i3);
        MethodCollector.o(3070);
    }
}
