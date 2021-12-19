package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import h.f.b.g;

public class EffectPanelModelTemplate extends EffectPanelModel {
    private final transient EffectPanelModel kPanelModel;

    static {
        Covode.recordClassIndex(95447);
    }

    public EffectPanelModelTemplate() {
        this(null, 1, null);
    }

    public EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    public EffectPanelModelTemplate(EffectPanelModel effectPanelModel) {
        super(null, null, null, null, null, null, 63, null);
        this.kPanelModel = effectPanelModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModelTemplate(EffectPanelModel effectPanelModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effectPanelModel);
    }
}
