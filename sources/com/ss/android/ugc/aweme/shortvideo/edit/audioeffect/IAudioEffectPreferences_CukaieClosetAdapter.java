package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.a;

public final class IAudioEffectPreferences_CukaieClosetAdapter extends a implements IAudioEffectPreferences {
    static {
        Covode.recordClassIndex(83165);
    }

    public IAudioEffectPreferences_CukaieClosetAdapter(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public final int getResourceVersion(int i2) {
        return super.getStore().a("resource_version", i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.IAudioEffectPreferences
    public final void setResourceVersion(int i2) {
        super.getStore().b("resource_version", i2);
    }
}
