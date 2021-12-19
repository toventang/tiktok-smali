package com.ss.android.ugc.effectmanager.effect.task.result;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseTaskResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

public class FetchFavoriteListTaskResult extends BaseTaskResult {
    private ExceptionResult mException;
    private FetchFavoriteListResponse result;

    static {
        Covode.recordClassIndex(95494);
    }

    public ExceptionResult getException() {
        return this.mException;
    }

    public FetchFavoriteListResponse getResult() {
        return this.result;
    }

    public void setResult(FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.result = fetchFavoriteListResponse;
    }

    public FetchFavoriteListTaskResult(ExceptionResult exceptionResult) {
        this.mException = exceptionResult;
    }

    public FetchFavoriteListTaskResult(FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.result = fetchFavoriteListResponse;
    }
}
