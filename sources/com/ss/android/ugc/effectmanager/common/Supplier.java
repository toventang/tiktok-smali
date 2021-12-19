package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;

public interface Supplier<T> {
    static {
        Covode.recordClassIndex(95257);
    }

    T get(int i2);
}
