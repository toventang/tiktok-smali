package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

public interface IIsTagNeedUpdatedListener {
    static {
        Covode.recordClassIndex(95384);
    }

    void onTagNeedNotUpdate();

    void onTagNeedUpdate();
}
