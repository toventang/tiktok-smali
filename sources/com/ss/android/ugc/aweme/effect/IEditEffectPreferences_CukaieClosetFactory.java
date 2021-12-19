package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class IEditEffectPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(55837);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "EditEffectConfig";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new IEditEffectPreferences_CukaieClosetAdapter(eVar);
    }
}
