package com.ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.service.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface ICommerceService {
    static {
        Covode.recordClassIndex(45238);
    }

    Aweme getAwemeById(String str);

    void logCommerceEvents(String str, a aVar);
}
