package com.bytedance.ies.sdk.datachannel;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class n<T> implements u<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f34582a;

    /* renamed from: b  reason: collision with root package name */
    private final b<T, z> f34583b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34584c;

    /* renamed from: d  reason: collision with root package name */
    private final m<T> f34585d;

    static {
        Covode.recordClassIndex(20700);
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(T t) {
        if (this.f34584c || this.f34582a < this.f34585d.f34580b) {
            this.f34583b.invoke(t);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(b<? super T, z> bVar, boolean z, m<T> mVar) {
        l.c(bVar, "");
        l.c(mVar, "");
        this.f34583b = bVar;
        this.f34584c = z;
        this.f34585d = mVar;
        this.f34582a = mVar.f34580b;
    }
}
