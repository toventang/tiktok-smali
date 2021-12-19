package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public interface IFetchProviderEffect extends IEffectPlatformBaseListener<ProviderEffectModel> {
    static {
        Covode.recordClassIndex(95382);
    }

    void onFail(ExceptionResult exceptionResult);
}
