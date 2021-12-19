package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

public class FetchCategoryEffectTaskResult extends BaseTaskResult {
    private CategoryPageModel categoryEffectModel;
    private ExceptionResult exception;

    static {
        Covode.recordClassIndex(95492);
    }

    public CategoryPageModel getEffectChannels() {
        return this.categoryEffectModel;
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public void setEffectChannels(CategoryPageModel categoryPageModel) {
        this.categoryEffectModel = categoryPageModel;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public FetchCategoryEffectTaskResult(CategoryPageModel categoryPageModel, ExceptionResult exceptionResult) {
        this.categoryEffectModel = categoryPageModel;
        this.exception = exceptionResult;
    }
}
