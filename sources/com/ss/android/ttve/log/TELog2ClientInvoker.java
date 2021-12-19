package com.ss.android.ttve.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class TELog2ClientInvoker {
    public static native void nativeInit();

    public static native void nativeSetIsToLogcat(boolean z);

    static {
        Covode.recordClassIndex(37624);
        d.b();
    }

    public static void onNativeCallback_logToLocal(int i2, String str) {
        a.a(i2, str);
    }
}
