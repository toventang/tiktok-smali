package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.task.al;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$2 implements e<EffectChannelResponse> {
    final /* synthetic */ IFetchEffectChannelListener $oldListener;
    final /* synthetic */ al $taskManager;

    static {
        Covode.recordClassIndex(95574);
    }

    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        l.c(effectChannelResponse, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(effectChannelResponse, this.$taskManager, new ListenerAdaptExtKt$toKNListener$2$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(effectChannelResponse));
        }
    }

    ListenerAdaptExtKt$toKNListener$2(al alVar, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchEffectChannelListener;
    }

    public final void onFail(EffectChannelResponse effectChannelResponse, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
