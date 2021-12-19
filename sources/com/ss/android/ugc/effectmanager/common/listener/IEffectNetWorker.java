package com.ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import java.io.InputStream;

public interface IEffectNetWorker {
    static {
        Covode.recordClassIndex(95296);
    }

    InputStream execute(EffectRequest effectRequest);
}
