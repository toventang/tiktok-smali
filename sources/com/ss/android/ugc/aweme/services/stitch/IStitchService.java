package com.ss.android.ugc.aweme.services.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IStitchService {
    static {
        Covode.recordClassIndex(79809);
    }

    boolean canUseEffectInStitch(Effect effect);
}
