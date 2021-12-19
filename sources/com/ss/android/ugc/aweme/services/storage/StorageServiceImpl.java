package com.ss.android.ugc.aweme.services.storage;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.q;
import java.util.Set;

public final class StorageServiceImpl implements IAVStorageService {
    static {
        Covode.recordClassIndex(79816);
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public final void checkStorageClean() {
        if (a.a().getBoolean("key_is_effect_storage_cleaning", false)) {
            q.d("av storage clean not finished last time!!!! effect resources maybe not intact");
            i.b(StorageServiceImpl$checkStorageClean$1.INSTANCE, i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public final Set<String> getPrefixAllowList() {
        return g.a().g().b().a();
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public final boolean isMonitorEnabled() {
        return g.a().g().a().a();
    }

    @Override // com.ss.android.ugc.aweme.services.storage.IAVStorageService
    public final void setMonitorLocalSwitch(boolean z) {
        g.a().g().a().a(z);
    }
}
