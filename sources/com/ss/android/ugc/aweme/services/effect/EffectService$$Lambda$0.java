package com.ss.android.ugc.aweme.services.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class EffectService$$Lambda$0 implements b {
    private final String arg$1;

    static {
        Covode.recordClassIndex(79611);
    }

    EffectService$$Lambda$0(String str) {
        this.arg$1 = str;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        return ((EffectPlatformBuilder) obj).setRegion(this.arg$1);
    }
}
