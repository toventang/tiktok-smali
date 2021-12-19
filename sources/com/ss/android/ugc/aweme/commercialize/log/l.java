package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f74825a;

    static {
        Covode.recordClassIndex(46119);
    }

    l(Aweme aweme) {
        this.f74825a = aweme;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        Aweme aweme = this.f74825a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(aweme) : bVar.a(aweme);
    }
}
