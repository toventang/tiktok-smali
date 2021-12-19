package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

public interface IFetchResourceListener extends IEffectPlatformBaseListener<ResourceListModel> {
    static {
        Covode.recordClassIndex(95383);
    }

    void onFail(ExceptionResult exceptionResult);
}
