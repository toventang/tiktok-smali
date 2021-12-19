package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;

public class NativeConnect {
    static {
        Covode.recordClassIndex(101190);
    }

    public native int connect(String str, String str2);
}
