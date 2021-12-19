package com.ss.android.ugc.aweme.app.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;

public final class Feed0VVManagerService implements IFeed0VVManagerService {
    static {
        Covode.recordClassIndex(41179);
    }

    @Override // com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService
    public final void b(String str) {
        l.d(str, "");
        s.a(af.valueOf(str));
    }
}
