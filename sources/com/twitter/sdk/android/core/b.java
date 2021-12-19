package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import l.d;
import l.l;

public abstract class b<T> implements d<T> {
    static {
        Covode.recordClassIndex(103585);
    }

    public abstract void a(h<T> hVar);

    public abstract void a(s sVar);

    @Override // l.d
    public final void a(l.b<T> bVar, Throwable th) {
        a(new s("Request Failure", th));
    }

    @Override // l.d
    public final void a(l.b<T> bVar, l<T> lVar) {
        if (lVar.f159305a.isSuccessful()) {
            a(new h<>(lVar.f159306b, lVar));
        } else {
            a(new m(lVar));
        }
    }
}
