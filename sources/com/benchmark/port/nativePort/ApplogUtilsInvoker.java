package com.benchmark.port.nativePort;

import com.benchmark.tools.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ApplogUtilsInvoker {
    public static native void nativeInit();

    static {
        Covode.recordClassIndex(3031);
        a.a();
        if (!a.f6364a) {
            a.a();
        }
    }

    public static void Init() {
        MethodCollector.i(1163);
        if (a.f6364a) {
            nativeInit();
        }
        MethodCollector.o(1163);
    }

    public static void onNativeCallback_onAppLogJson(String str, String str2) {
        com.benchmark.a.a.a(str, str2);
    }
}
