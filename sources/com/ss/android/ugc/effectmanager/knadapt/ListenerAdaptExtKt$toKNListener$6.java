package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$6 implements e<SearchEffectResponse> {
    final /* synthetic */ ISearchEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95579);
    }

    ListenerAdaptExtKt$toKNListener$6(ISearchEffectListener iSearchEffectListener) {
        this.$oldListener = iSearchEffectListener;
    }

    public final void onSuccess(SearchEffectResponse searchEffectResponse) {
        l.c(searchEffectResponse, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse(searchEffectResponse));
    }

    public final void onFail(SearchEffectResponse searchEffectResponse, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
