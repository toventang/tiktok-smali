package com.ss.android.ugc.effectmanager.effect.listener;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;

public interface IFetchFavoriteList extends IEffectPlatformBaseListener<FetchFavoriteListResponse> {
    static {
        Covode.recordClassIndex(95379);
    }

    void onFailed(ExceptionResult exceptionResult);
}
