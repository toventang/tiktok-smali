package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

/* access modifiers changed from: package-private */
public final class ListenerAdaptExtKt$preProcess$1 extends m implements b<EffectChannelResponse, com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse> {
    public static final ListenerAdaptExtKt$preProcess$1 INSTANCE = new ListenerAdaptExtKt$preProcess$1();

    static {
        Covode.recordClassIndex(95558);
    }

    ListenerAdaptExtKt$preProcess$1() {
        super(1);
    }

    public final com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse invoke(EffectChannelResponse effectChannelResponse) {
        l.c(effectChannelResponse, "");
        com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse effectChannelResponse2 = new com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(effectChannelResponse);
        ListenerAdaptExtKt.preProcess(effectChannelResponse2.getAllCategoryEffects());
        ListenerAdaptExtKt.preProcess(effectChannelResponse2.getCollections());
        for (T t : effectChannelResponse2.getCategoryResponseList()) {
            ListenerAdaptExtKt.preProcess(t.getCollectionEffect());
            ListenerAdaptExtKt.preProcess(t.getTotalEffects());
        }
        return effectChannelResponse2;
    }
}
