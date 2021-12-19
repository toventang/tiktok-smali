package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;

public final /* synthetic */ class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f74834a;

    static {
        Covode.recordClassIndex(46126);
    }

    public s(Aweme aweme) {
        this.f74834a = aweme;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        Aweme aweme = this.f74834a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(aweme) : bVar.a(aweme);
    }
}
