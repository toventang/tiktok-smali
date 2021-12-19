package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class IVideoRecordPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(74619);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "VideoRecord";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new IVideoRecordPreferences_CukaieClosetAdapter(eVar);
    }
}
