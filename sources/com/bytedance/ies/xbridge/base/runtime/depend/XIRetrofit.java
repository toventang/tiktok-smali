package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface XIRetrofit {
    static {
        Covode.recordClassIndex(21439);
    }

    <T> T create(Class<T> cls);
}
