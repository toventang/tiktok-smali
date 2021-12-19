package com.bytedance.ies.ugc.aweme.commercialize.splash.f;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.c;

final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f34778a;

    static {
        Covode.recordClassIndex(20864);
    }

    e(c.a aVar) {
        this.f34778a = aVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        this.f34778a.a(a.a().u() || System.currentTimeMillis() - a.a().v() < 5000);
        return null;
    }
}
