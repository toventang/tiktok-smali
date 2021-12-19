package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public class GeneralParam {
    static {
        Covode.recordClassIndex(2853);
    }

    private static native String nativeGetParamByKey(String str);

    private static native void nativeSetParamWithKey(String str, String str2);

    private static native void nativeSetParams(HashMap<String, String> hashMap);

    public static String getParamByKey(String str) {
        MethodCollector.i(1555);
        String nativeGetParamByKey = nativeGetParamByKey(str);
        MethodCollector.o(1555);
        return nativeGetParamByKey;
    }

    public static void setParams(HashMap<String, String> hashMap) {
        MethodCollector.i(1552);
        nativeSetParams(hashMap);
        MethodCollector.o(1552);
    }

    public static void setParamWithKey(String str, String str2) {
        MethodCollector.i(1554);
        nativeSetParamWithKey(str, str2);
        MethodCollector.o(1554);
    }
}
