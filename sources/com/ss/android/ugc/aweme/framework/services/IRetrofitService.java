package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;

public interface IRetrofitService {
    static {
        Covode.recordClassIndex(61360);
    }

    IRetrofit createNewRetrofit(String str);
}
