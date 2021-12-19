package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public interface IFetchEffectListListener extends IEffectPlatformBaseListener<List<Effect>> {
    static {
        Covode.recordClassIndex(95376);
    }

    void onFail(ExceptionResult exceptionResult);
}
