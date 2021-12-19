package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

public interface IRetrofit {
    static {
        Covode.recordClassIndex(61359);
    }

    <T> T create(Class<T> cls);
}
