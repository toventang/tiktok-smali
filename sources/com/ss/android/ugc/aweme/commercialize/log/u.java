package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ac f74836a;

    static {
        Covode.recordClassIndex(46128);
    }

    u(ac acVar) {
        this.f74836a = acVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        ac acVar = this.f74836a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(acVar) : bVar.a(acVar);
    }
}
