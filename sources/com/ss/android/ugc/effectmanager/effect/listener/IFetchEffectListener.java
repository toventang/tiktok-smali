package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IFetchEffectListener extends IEffectPlatformBaseListener<Effect> {
    static {
        Covode.recordClassIndex(95378);
    }

    void onFail(Effect effect, ExceptionResult exceptionResult);

    void onStart(Effect effect);
}
