package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

public interface IFetchPanelInfoListener extends IEffectPlatformBaseListener<PanelInfoModel> {
    static {
        Covode.recordClassIndex(95381);
    }

    void onFail(ExceptionResult exceptionResult);
}
