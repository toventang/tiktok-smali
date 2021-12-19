package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;

public interface Promise {
    static {
        Covode.recordClassIndex(34753);
    }

    void reject(String str);

    void reject(String str, String str2);

    void resolve(Object obj);
}
