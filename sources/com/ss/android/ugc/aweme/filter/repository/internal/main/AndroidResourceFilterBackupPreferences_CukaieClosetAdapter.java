package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.a;

public final class AndroidResourceFilterBackupPreferences_CukaieClosetAdapter extends a implements AndroidResourceFilterBackupPreferences {
    static {
        Covode.recordClassIndex(60609);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public final int getResourcesVersion() {
        return super.getStore().a("resources_version", 0);
    }

    public AndroidResourceFilterBackupPreferences_CukaieClosetAdapter(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences
    public final void setResourcesVersion(int i2) {
        super.getStore().b("resources_version", i2);
    }
}
