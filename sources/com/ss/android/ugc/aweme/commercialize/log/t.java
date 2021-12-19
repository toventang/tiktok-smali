package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ac f74835a;

    static {
        Covode.recordClassIndex(46127);
    }

    t(ac acVar) {
        this.f74835a = acVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        ac acVar = this.f74835a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(acVar) : bVar.a(acVar);
    }
}
