package com.ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;

public final class FetchSingleAlgorithmModelTaskResult extends BaseTaskResult {
    private final ExceptionResult exceptionResult;
    private final SingleAlgorithmModelResponse response;

    static {
        Covode.recordClassIndex(95595);
    }

    public final ExceptionResult getExceptionResult() {
        return this.exceptionResult;
    }

    public final SingleAlgorithmModelResponse getResponse() {
        return this.response;
    }

    public FetchSingleAlgorithmModelTaskResult(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ExceptionResult exceptionResult2) {
        this.response = singleAlgorithmModelResponse;
        this.exceptionResult = exceptionResult2;
    }
}
