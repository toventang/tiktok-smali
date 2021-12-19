package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public interface IntStringCallback {
    static {
        Covode.recordClassIndex(103262);
    }

    void onResult(int i2, String str);
}
