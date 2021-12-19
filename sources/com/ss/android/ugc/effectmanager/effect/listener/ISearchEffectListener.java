package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;

public interface ISearchEffectListener extends IEffectPlatformBaseListener<SearchEffectResponse> {
    static {
        Covode.recordClassIndex(95388);
    }

    void onFail(ExceptionResult exceptionResult);
}
