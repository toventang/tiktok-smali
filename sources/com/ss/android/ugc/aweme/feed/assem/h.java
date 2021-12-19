package com.ss.android.ugc.aweme.feed.assem;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.b.l;
import h.k.i;
import java.lang.ref.WeakReference;

public final class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<T> f92264a;

    static {
        Covode.recordClassIndex(58272);
    }

    public h() {
        this(AnonymousClass1.f92265a);
    }

    public final T a(i<?> iVar) {
        l.d(iVar, "");
        return this.f92264a.get();
    }

    public h(a<? extends T> aVar) {
        l.d(aVar, "");
        this.f92264a = new WeakReference<>(aVar.invoke());
    }

    public final void a(i<?> iVar, T t) {
        l.d(iVar, "");
        this.f92264a = new WeakReference<>(t);
    }
}
