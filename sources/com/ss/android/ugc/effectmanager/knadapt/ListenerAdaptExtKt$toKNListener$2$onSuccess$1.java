package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

/* access modifiers changed from: package-private */
public final class ListenerAdaptExtKt$toKNListener$2$onSuccess$1 extends m implements b<EffectChannelResponse, z> {
    final /* synthetic */ ListenerAdaptExtKt$toKNListener$2 this$0;

    static {
        Covode.recordClassIndex(95575);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListenerAdaptExtKt$toKNListener$2$onSuccess$1(ListenerAdaptExtKt$toKNListener$2 listenerAdaptExtKt$toKNListener$2) {
        super(1);
        this.this$0 = listenerAdaptExtKt$toKNListener$2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(EffectChannelResponse effectChannelResponse) {
        invoke(effectChannelResponse);
        return z.f158842a;
    }

    public final void invoke(EffectChannelResponse effectChannelResponse) {
        l.c(effectChannelResponse, "");
        this.this$0.$oldListener.onSuccess(effectChannelResponse);
    }
}
