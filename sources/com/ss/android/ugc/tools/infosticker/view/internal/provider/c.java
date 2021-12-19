package com.ss.android.ugc.tools.infosticker.view.internal.provider;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

public final class c {
    static {
        Covode.recordClassIndex(98698);
    }

    public static final String a(Object obj) {
        String subtitle;
        if (!(obj instanceof ProviderEffectModel)) {
            obj = null;
        }
        com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel = (com.ss.ugc.effectplatform.model.ProviderEffectModel) obj;
        if (providerEffectModel == null || (subtitle = providerEffectModel.getSubtitle()) == null) {
            return "";
        }
        return subtitle;
    }
}
