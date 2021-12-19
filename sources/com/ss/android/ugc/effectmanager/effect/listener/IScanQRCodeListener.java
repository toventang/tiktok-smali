package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IScanQRCodeListener extends IEffectPlatformBaseListener<Effect> {
    static {
        Covode.recordClassIndex(95387);
    }

    void onFail(ExceptionResult exceptionResult);
}
