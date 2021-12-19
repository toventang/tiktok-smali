package com.ss.android.ugc.aweme.infoSticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public final class f implements com.google.c.a.f<ProviderEffect, Effect> {
    static {
        Covode.recordClassIndex(67081);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* bridge */ /* synthetic */ Effect a(ProviderEffect providerEffect) {
        return a(providerEffect);
    }

    public static Effect a(ProviderEffect providerEffect) {
        Effect effect = new Effect();
        effect.setEffectId(providerEffect.getId());
        effect.setName(providerEffect.getTitle());
        effect.setUnzipPath(providerEffect.getPath());
        effect.setEffectType(10);
        return effect;
    }
}
