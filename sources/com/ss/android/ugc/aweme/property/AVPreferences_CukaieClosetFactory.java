package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class AVPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(76835);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "av_settings.xml";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new AVPreferences_CukaieClosetAdapter(eVar);
    }
}
