package com.ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.nativePort.d;

public class BitmapJni {
    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i2);

    static {
        Covode.recordClassIndex(36885);
        d.c();
    }

    public static int compressBitmap(Bitmap bitmap, String str, int i2) {
        MethodCollector.i(3950);
        int nativeCompressBitmap = nativeCompressBitmap(bitmap, str, i2);
        MethodCollector.o(3950);
        return nativeCompressBitmap;
    }
}
