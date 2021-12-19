package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.ugc.effectplatform.h.e;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$19 implements e<Effect> {
    final /* synthetic */ IScanQRCodeListener $oldListener;

    static {
        Covode.recordClassIndex(95573);
    }

    ListenerAdaptExtKt$toKNListener$19(IScanQRCodeListener iScanQRCodeListener) {
        this.$oldListener = iScanQRCodeListener;
    }

    public final void onSuccess(Effect effect) {
        l.c(effect, "");
        this.$oldListener.onSuccess(new com.ss.android.ugc.effectmanager.effect.model.Effect(effect));
    }

    public final void onFail(Effect effect, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
