package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$17 implements e<FetchHotEffectResponse> {
    final /* synthetic */ IFetchHotEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95571);
    }

    ListenerAdaptExtKt$toKNListener$17(IFetchHotEffectListener iFetchHotEffectListener) {
        this.$oldListener = iFetchHotEffectListener;
    }

    public final void onSuccess(FetchHotEffectResponse fetchHotEffectResponse) {
        l.c(fetchHotEffectResponse, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse(fetchHotEffectResponse));
    }

    public final void onFail(FetchHotEffectResponse fetchHotEffectResponse, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
