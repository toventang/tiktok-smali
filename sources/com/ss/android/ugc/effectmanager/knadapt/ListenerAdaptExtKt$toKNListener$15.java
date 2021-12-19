package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$15 implements e<FetchFavoriteListResponse> {
    final /* synthetic */ IFetchFavoriteList $oldListener;

    static {
        Covode.recordClassIndex(95569);
    }

    ListenerAdaptExtKt$toKNListener$15(IFetchFavoriteList iFetchFavoriteList) {
        this.$oldListener = iFetchFavoriteList;
    }

    public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
        l.c(fetchFavoriteListResponse, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse(fetchFavoriteListResponse));
    }

    public final void onFail(FetchFavoriteListResponse fetchFavoriteListResponse, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
