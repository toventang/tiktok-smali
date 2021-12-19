package com.ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EffectService$$Lambda$1 implements b {
    private final EffectService arg$1;
    private final String arg$2;

    static {
        Covode.recordClassIndex(79612);
    }

    EffectService$$Lambda$1(EffectService effectService, String str) {
        this.arg$1 = effectService;
        this.arg$2 = str;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return this.arg$1.lambda$createMvEffectPlatform$1$EffectService(this.arg$2, (EffectPlatformBuilder) obj);
    }
}
