package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.b;

public final class AndroidResourceFilterBackupPreferences_CukaieClosetFactory implements b {
    static {
        Covode.recordClassIndex(60610);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return "VideoRecord";
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        return new AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(eVar);
    }
}
