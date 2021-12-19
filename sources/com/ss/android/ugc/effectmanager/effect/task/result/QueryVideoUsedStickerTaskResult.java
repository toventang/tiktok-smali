package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

public class QueryVideoUsedStickerTaskResult extends BaseTaskResult {
    private ExceptionResult exception;
    private EffectListResponse response;

    static {
        Covode.recordClassIndex(95499);
    }

    public ExceptionResult getException() {
        return this.exception;
    }

    public EffectListResponse getResponse() {
        return this.response;
    }

    public void setException(ExceptionResult exceptionResult) {
        this.exception = exceptionResult;
    }

    public void setResponse(EffectListResponse effectListResponse) {
        this.response = effectListResponse;
    }

    public QueryVideoUsedStickerTaskResult(EffectListResponse effectListResponse, ExceptionResult exceptionResult) {
        this.response = effectListResponse;
        this.exception = exceptionResult;
    }
}
