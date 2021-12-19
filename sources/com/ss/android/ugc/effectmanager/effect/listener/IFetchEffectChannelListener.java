package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

public interface IFetchEffectChannelListener extends IEffectPlatformBaseListener<EffectChannelResponse> {
    static {
        Covode.recordClassIndex(95374);
    }

    void onFail(ExceptionResult exceptionResult);
}
