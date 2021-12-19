package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;

public final /* synthetic */ class v implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f74837a;

    static {
        Covode.recordClassIndex(46129);
    }

    public v(Aweme aweme) {
        this.f74837a = aweme;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        Aweme aweme = this.f74837a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(aweme) : bVar.a(aweme);
    }
}
