package com.ss.android.ugc.aweme.services.sticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface OnUnlockShareFinishListener {
    static {
        Covode.recordClassIndex(79805);
    }

    void onShareAppFailed();

    void onShareAppSucceed(Effect effect);

    void onVKShareSucceed(Effect effect);
}
