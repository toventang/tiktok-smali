package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.HashMap;

public interface IReadUpdateTagListener extends IEffectPlatformBaseListener<HashMap<String, String>> {
    static {
        Covode.recordClassIndex(95386);
    }

    void onFailed(ExceptionResult exceptionResult);
}
