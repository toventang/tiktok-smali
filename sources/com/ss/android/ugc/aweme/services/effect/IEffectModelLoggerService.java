package com.ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IEffectModelLoggerService {
    static {
        Covode.recordClassIndex(79615);
    }

    void endDownloadEffectModelAlog(Effect effect, Object obj, long j2, int i2, Exception exc, String str);

    void reportModelListAlog(boolean z, String str, long j2, String str2);

    void startDownloadEffectModelAlog(Effect effect, Object obj, String str);
}
