package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;

public interface ISearchEffectListenerV2 extends IEffectPlatformBaseListener<SearchEffectResponseV2> {
    static {
        Covode.recordClassIndex(95389);
    }

    void onFail(ExceptionResult exceptionResult);
}
