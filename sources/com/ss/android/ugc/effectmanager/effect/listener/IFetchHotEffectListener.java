package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse;

public interface IFetchHotEffectListener extends IEffectPlatformBaseListener<FetchHotEffectResponse> {
    static {
        Covode.recordClassIndex(95380);
    }

    void onFailed(ExceptionResult exceptionResult);
}
