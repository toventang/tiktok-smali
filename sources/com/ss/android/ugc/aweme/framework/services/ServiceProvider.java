package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

public interface ServiceProvider<T> {
    static {
        Covode.recordClassIndex(61368);
    }

    T get();
}
