package com.bytedance.geckox;

import com.bytedance.covode.number.Covode;

public interface IGeckoGlobalInit {
    static {
        Covode.recordClassIndex(17249);
    }

    GeckoGlobalConfig a();
}
