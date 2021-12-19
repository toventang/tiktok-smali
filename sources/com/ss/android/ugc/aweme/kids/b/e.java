package com.ss.android.ugc.aweme.kids.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.b.d;
import com.ss.android.ugc.aweme.services.external.ICacheService;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final ICacheService f105428a;

    static {
        Covode.recordClassIndex(67568);
    }

    e(ICacheService iCacheService) {
        this.f105428a = iCacheService;
    }

    @Override // com.ss.android.ugc.aweme.kids.b.d.a
    public final String a() {
        return this.f105428a.musicDir() + "cache/";
    }
}
