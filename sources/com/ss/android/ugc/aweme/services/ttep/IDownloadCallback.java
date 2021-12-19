package com.ss.android.ugc.aweme.services.ttep;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IDownloadCallback {
    static {
        Covode.recordClassIndex(79836);
    }

    void onFail(int i2, Exception exc);

    void onSuccess(Effect effect);
}
