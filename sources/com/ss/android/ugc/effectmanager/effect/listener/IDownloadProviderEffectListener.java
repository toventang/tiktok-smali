package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public interface IDownloadProviderEffectListener extends IEffectPlatformBaseListener<ProviderEffect> {
    static {
        Covode.recordClassIndex(95368);
    }

    void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult);
}
