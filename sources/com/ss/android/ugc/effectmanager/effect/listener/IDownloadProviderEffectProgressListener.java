package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public interface IDownloadProviderEffectProgressListener extends IDownloadProviderEffectListener {
    static {
        Covode.recordClassIndex(95369);
    }

    void onProgress(ProviderEffect providerEffect, int i2, long j2);
}
