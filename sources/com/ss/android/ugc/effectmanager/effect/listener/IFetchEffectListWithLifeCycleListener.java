package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;

public interface IFetchEffectListWithLifeCycleListener extends IFetchEffectListListener {
    static {
        Covode.recordClassIndex(95377);
    }

    void onFinally();

    void onStart();
}
