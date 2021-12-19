package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class IAudioEffectPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(83166);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "AudioEffect";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new IAudioEffectPreferences_CukaieClosetAdapter(eVar);
    }
}
