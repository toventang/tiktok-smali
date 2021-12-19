package com.ss.android.vesdk.runtime.oauth;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.d;

public class TEOAuth {
    private static native int nativeActivate(String str, String str2, String str3, String str4, String str5, String str6);

    private static native String nativeGetActivationCode();

    static {
        Covode.recordClassIndex(99586);
        d.a();
    }
}
