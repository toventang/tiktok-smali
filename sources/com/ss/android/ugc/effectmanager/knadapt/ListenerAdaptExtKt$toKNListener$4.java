package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$4 implements e<EffectListResponse> {
    final /* synthetic */ IFetchEffectListByIdsListener $oldListener;

    static {
        Covode.recordClassIndex(95577);
    }

    ListenerAdaptExtKt$toKNListener$4(IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        this.$oldListener = iFetchEffectListByIdsListener;
    }

    public final void onSuccess(EffectListResponse effectListResponse) {
        l.c(effectListResponse, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse(effectListResponse));
    }

    public final void onFail(EffectListResponse effectListResponse, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
