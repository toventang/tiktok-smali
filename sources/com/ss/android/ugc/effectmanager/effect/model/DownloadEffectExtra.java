package com.ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate;
import com.ss.ugc.effectplatform.model.c;
import h.f.b.g;
import java.io.Serializable;

public final class DownloadEffectExtra extends DownloadEffectExtraTemplate implements Serializable {
    private final transient c kDownloadEffect;

    static {
        Covode.recordClassIndex(95398);
    }

    public DownloadEffectExtra() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate
    public final c getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    @Override // com.ss.ugc.effectplatform.model.c
    public final String getPanel() {
        String panel;
        c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 == null || (panel = kDownloadEffect2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.ss.ugc.effectplatform.model.c
    public final void setPanel(String str) {
        c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null) {
            kDownloadEffect2.setPanel(str);
        }
        super.setPanel(str);
    }

    public DownloadEffectExtra(c cVar) {
        super(cVar);
        String panel;
        this.kDownloadEffect = cVar;
        c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null && (panel = kDownloadEffect2.getPanel()) != null) {
            super.setPanel(panel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtra(c cVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : cVar);
    }
}
