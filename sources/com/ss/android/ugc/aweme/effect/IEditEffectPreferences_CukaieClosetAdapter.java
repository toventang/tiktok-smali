package com.ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.a;

public final class IEditEffectPreferences_CukaieClosetAdapter extends a implements IEditEffectPreferences {
    static {
        Covode.recordClassIndex(55836);
    }

    public IEditEffectPreferences_CukaieClosetAdapter(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.effect.IEditEffectPreferences
    public final int getResourceVersion(int i2) {
        return super.getStore().a("fallback_resource_version", i2);
    }

    @Override // com.ss.android.ugc.aweme.effect.IEditEffectPreferences
    public final void setResourceVersion(int i2) {
        super.getStore().b("fallback_resource_version", i2);
    }
}
