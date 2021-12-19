package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.c;
import h.f.b.g;

public class DownloadEffectExtraTemplate extends c {
    private final transient c kDownloadEffect;

    static {
        Covode.recordClassIndex(95441);
    }

    public DownloadEffectExtraTemplate() {
        this(null, 1, null);
    }

    public c getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    public DownloadEffectExtraTemplate(c cVar) {
        super(null, 1, null);
        this.kDownloadEffect = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtraTemplate(c cVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : cVar);
    }
}
