package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.k.i;
import java.lang.ref.WeakReference;

public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f34533a;

    static {
        Covode.recordClassIndex(20656);
    }

    public g() {
        this(AnonymousClass1.f34534a);
    }

    public final T a(i<?> iVar) {
        l.c(iVar, "");
        return this.f34533a.get();
    }

    public g(a<? extends T> aVar) {
        l.c(aVar, "");
        this.f34533a = new WeakReference<>(aVar.invoke());
    }

    public final void a(i<?> iVar, T t) {
        l.c(iVar, "");
        this.f34533a = new WeakReference<>(t);
    }
}
