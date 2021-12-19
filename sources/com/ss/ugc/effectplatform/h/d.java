package com.ss.ugc.effectplatform.h;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.ProviderEffect;

public interface d extends e<ProviderEffect> {
    static {
        Covode.recordClassIndex(102411);
    }

    void onProgress(ProviderEffect providerEffect, int i2, long j2);
}
