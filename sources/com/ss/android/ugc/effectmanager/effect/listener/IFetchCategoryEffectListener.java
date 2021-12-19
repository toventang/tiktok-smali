package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

public interface IFetchCategoryEffectListener extends IEffectPlatformBaseListener<CategoryPageModel> {
    static {
        Covode.recordClassIndex(95373);
    }

    void onFail(ExceptionResult exceptionResult);
}
