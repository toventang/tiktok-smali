package com.ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.ugc.effectplatform.j.a;
import h.f.a.a;
import h.f.b.l;
import h.f.b.m;

/* access modifiers changed from: package-private */
public final class AlgorithmModelManager$knAlgorithmRepository$2 extends m implements a<com.ss.ugc.effectplatform.j.a> {
    final /* synthetic */ DownloadableModelConfig $config;

    static {
        Covode.recordClassIndex(95208);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlgorithmModelManager$knAlgorithmRepository$2(DownloadableModelConfig downloadableModelConfig) {
        super(0);
        this.$config = downloadableModelConfig;
    }

    @Override // h.f.a.a
    public final com.ss.ugc.effectplatform.j.a invoke() {
        if (!a.C4089a.b()) {
            com.ss.ugc.effectplatform.a kNEffectConfig = this.$config.getKNEffectConfig();
            l.a((Object) kNEffectConfig, "");
            a.C4089a.a(kNEffectConfig);
        }
        return a.C4089a.a();
    }
}
