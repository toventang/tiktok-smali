package com.bef.effectsdk;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ImgporcUtils {

    public static class InterpolationFlags {
        static {
            Covode.recordClassIndex(2855);
        }
    }

    static {
        Covode.recordClassIndex(2854);
    }

    private static native float nativeCalculateAspectRatio(PointF[] pointFArr, int i2, int i3);

    private static native Bitmap nativeCorrectPerspective(Bitmap bitmap, PointF[] pointFArr, int i2, int i3, int i4);

    public static float calculateAspectRatio(PointF[] pointFArr, int i2, int i3) {
        MethodCollector.i(1553);
        float nativeCalculateAspectRatio = nativeCalculateAspectRatio(pointFArr, i2, i3);
        MethodCollector.o(1553);
        return nativeCalculateAspectRatio;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i2, int i3) {
        MethodCollector.i(1551);
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i2, i3, 1);
        MethodCollector.o(1551);
        return nativeCorrectPerspective;
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i2, int i3, int i4) {
        MethodCollector.i(1549);
        Bitmap nativeCorrectPerspective = nativeCorrectPerspective(bitmap, pointFArr, i2, i3, i4);
        MethodCollector.o(1549);
        return nativeCorrectPerspective;
    }
}
