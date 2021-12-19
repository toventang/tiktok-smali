package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.ugc.effectplatform.h.e;
import h.f.b.l;

public final class ListenerAdaptExtKt$toKNListener$5 implements e<Boolean> {
    final /* synthetic */ ICheckChannelListener $oldListener;

    static {
        Covode.recordClassIndex(95578);
    }

    ListenerAdaptExtKt$toKNListener$5(ICheckChannelListener iCheckChannelListener) {
        this.$oldListener = iCheckChannelListener;
    }

    public final void onSuccess(boolean z) {
        this.$oldListener.checkChannelSuccess(z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.ugc.effectplatform.h.e
    public final /* synthetic */ void onSuccess(Boolean bool) {
        onSuccess(bool.booleanValue());
    }

    public final void onFail(Boolean bool, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        this.$oldListener.checkChannelFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
