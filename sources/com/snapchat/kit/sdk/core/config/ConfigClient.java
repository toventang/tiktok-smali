package com.snapchat.kit.sdk.core.config;

import com.bytedance.covode.number.Covode;
import l.b;
import l.b.a;
import l.b.o;

public interface ConfigClient {
    static {
        Covode.recordClassIndex(35572);
    }

    @o(a = "/v1/config")
    b<d<b>> fetchConfig(@a a aVar);
}
