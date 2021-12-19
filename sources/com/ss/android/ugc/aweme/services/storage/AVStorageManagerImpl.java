package com.ss.android.ugc.aweme.services.storage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.h.a;
import com.ss.android.ugc.aweme.cs.h.b;
import com.ss.android.ugc.aweme.cs.h.c;
import com.ss.android.ugc.aweme.cs.h.d;
import com.ss.android.ugc.aweme.cs.h.e;
import h.h;
import h.i;

public final class AVStorageManagerImpl implements a {
    private final h allowListService$delegate = i.a((h.f.a.a) AVStorageManagerImpl$allowListService$2.INSTANCE);
    private final h fileProvider$delegate = i.a((h.f.a.a) AVStorageManagerImpl$fileProvider$2.INSTANCE);
    private final h monitor$delegate = i.a((h.f.a.a) AVStorageManagerImpl$monitor$2.INSTANCE);
    private final h persistedAllowListManager$delegate = i.a((h.f.a.a) AVStorageManagerImpl$persistedAllowListManager$2.INSTANCE);

    static {
        Covode.recordClassIndex(79810);
    }

    @Override // com.ss.android.ugc.aweme.cs.h.a
    public final e getAllowListService() {
        return (e) this.allowListService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.a
    public final c getFileProvider() {
        return (c) this.fileProvider$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.a
    public final b getMonitor() {
        return (b) this.monitor$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.cs.h.a
    public final d getPersistedAllowListManager() {
        return (d) this.persistedAllowListManager$delegate.getValue();
    }
}
