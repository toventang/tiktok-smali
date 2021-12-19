package com.lynx.tasm.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ColorUtils {
    static {
        Covode.recordClassIndex(35466);
    }

    private static native int nativeParse(String str);

    private static native boolean nativeValidate(String str);

    public static int a(String str) {
        MethodCollector.i(12926);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(12926);
            return 0;
        }
        int nativeParse = nativeParse(str);
        MethodCollector.o(12926);
        return nativeParse;
    }
}
