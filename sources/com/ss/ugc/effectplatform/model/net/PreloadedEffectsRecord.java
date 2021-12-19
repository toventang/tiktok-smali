package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class PreloadedEffectsRecord {
    private List<PreloadEffectModel> effect_list;

    static {
        Covode.recordClassIndex(102510);
    }

    public final List<PreloadEffectModel> getEffect_list() {
        return this.effect_list;
    }

    public final void setEffect_list(List<PreloadEffectModel> list) {
        this.effect_list = list;
    }

    public PreloadedEffectsRecord(List<PreloadEffectModel> list) {
        this.effect_list = list;
    }
}
