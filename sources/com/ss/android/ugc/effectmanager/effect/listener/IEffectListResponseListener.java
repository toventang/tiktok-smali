package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

public interface IEffectListResponseListener extends IEffectPlatformBaseListener<EffectListResponse> {
    static {
        Covode.recordClassIndex(95372);
    }

    void onFail(ExceptionResult exceptionResult);
}
