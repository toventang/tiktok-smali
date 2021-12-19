package com.ss.android.storageInit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;

public final class b extends c {
    static {
        Covode.recordClassIndex(37578);
    }

    @Override // com.ss.android.storageInit.c
    public final String f() {
        return "av-live_gift";
    }

    @Override // com.ss.android.storageInit.c
    public final String g() {
        return "RESOURCE";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.storageInit.c
    public final long h() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        return s.d().a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.storageInit.c
    public final boolean i() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.d().a(true);
        return false;
    }
}
