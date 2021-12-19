package com.twitter.sdk.android.core.services;

import com.bytedance.covode.number.Covode;
import l.b;
import l.b.f;

public interface ConfigurationService {
    static {
        Covode.recordClassIndex(103730);
    }

    @f(a = "/1.1/help/configuration.json")
    b<Object> configuration();
}
