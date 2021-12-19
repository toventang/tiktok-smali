package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;

public interface IModFavoriteList extends IEffectPlatformBaseListener<List<String>> {
    static {
        Covode.recordClassIndex(95385);
    }

    void onFail(ExceptionResult exceptionResult);
}
