package com.ss.android.ugc.aweme.kids.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.b.d;
import com.ss.android.ugc.aweme.services.external.ICacheService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final ICacheService f105429a;

    static {
        Covode.recordClassIndex(67569);
    }

    f(ICacheService iCacheService) {
        this.f105429a = iCacheService;
    }

    @Override // com.ss.android.ugc.aweme.kids.b.d.a
    public final String a() {
        return this.f105429a.musicDir() + "download/";
    }
}
