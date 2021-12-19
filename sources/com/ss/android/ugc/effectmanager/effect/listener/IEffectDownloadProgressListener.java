package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IEffectDownloadProgressListener extends IFetchEffectListener {
    static {
        Covode.recordClassIndex(95371);
    }

    void onProgress(Effect effect, int i2, long j2);
}
