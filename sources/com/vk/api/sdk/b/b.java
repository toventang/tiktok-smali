package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.d;
import com.vk.api.sdk.f.a.c;
import h.f.b.l;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final d f156250a;

    static {
        Covode.recordClassIndex(103766);
    }

    public abstract T a(a aVar);

    public b(d dVar) {
        l.c(dVar, "");
        this.f156250a = dVar;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, Throwable th) {
        l.c(str, "");
        l.c(th, "");
        this.f156250a.f156269c.f156236i.a(c.a.DEBUG);
    }

    /* access modifiers changed from: protected */
    public final void b(String str, Throwable th) {
        l.c(str, "");
        l.c(th, "");
        this.f156250a.f156269c.f156236i.a(c.a.WARNING);
    }
}
