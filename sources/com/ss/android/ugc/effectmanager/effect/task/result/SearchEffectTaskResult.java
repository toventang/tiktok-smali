package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;

public class SearchEffectTaskResult extends BaseTaskResult {
    private ExceptionResult exception;
    private SearchEffectResponse response;

    static {
        Covode.recordClassIndex(95502);
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public SearchEffectResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(SearchEffectResponse searchEffectResponse) {
        this.response = searchEffectResponse;
    }

    public SearchEffectTaskResult(SearchEffectResponse searchEffectResponse, ExceptionResult exceptionResult) {
        this.response = searchEffectResponse;
        this.exception = exceptionResult;
    }
}
