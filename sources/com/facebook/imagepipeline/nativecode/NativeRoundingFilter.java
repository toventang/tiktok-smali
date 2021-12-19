package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.imageutils.b;

public class NativeRoundingFilter {
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i2, int i3, boolean z);

    static {
        Covode.recordClassIndex(29199);
        b.a("native-filters");
    }

    public static void toCircle(Bitmap bitmap) {
        toCircle(bitmap, false);
    }

    public static void toCircle(Bitmap bitmap, boolean z) {
        MethodCollector.i(1703);
        i.a(bitmap);
        nativeToCircleFilter(bitmap, z);
        MethodCollector.o(1703);
    }

    public static void toCircleWithBorder(Bitmap bitmap, int i2, int i3, boolean z) {
        MethodCollector.i(1704);
        i.a(bitmap);
        nativeToCircleWithBorderFilter(bitmap, i2, i3, z);
        MethodCollector.o(1704);
    }
}
