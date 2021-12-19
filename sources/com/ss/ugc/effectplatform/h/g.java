package com.ss.ugc.effectplatform.h;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;

public interface g extends e<Effect> {
    static {
        Covode.recordClassIndex(102414);
    }

    void onProgress(Effect effect, int i2, long j2);

    void onStart(Effect effect);
}
