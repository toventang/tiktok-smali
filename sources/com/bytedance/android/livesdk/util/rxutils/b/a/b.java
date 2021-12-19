package com.bytedance.android.livesdk.util.rxutils.b.a;

import com.bytedance.covode.number.Covode;
import f.a.e.e.e.bh;
import f.a.h.a;
import f.a.t;
import f.a.x;
import f.a.y;

public final class b<T, R> implements y<T, T> {

    /* renamed from: a  reason: collision with root package name */
    private final t<R> f22185a;

    /* renamed from: b  reason: collision with root package name */
    private final R f22186b;

    static {
        Covode.recordClassIndex(13095);
    }

    public final int hashCode() {
        return (this.f22185a.hashCode() * 31) + this.f22186b.hashCode();
    }

    public final String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f22185a + ", event=" + ((Object) this.f22186b) + '}';
    }

    @Override // f.a.y
    public final x<T> a(t<T> tVar) {
        t<R> b2 = this.f22185a.a(new a(this.f22186b)).b(1);
        f.a.e.b.b.a((Object) b2, "other is null");
        return a.a(new bh(tVar, b2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f22185a.equals(bVar.f22185a)) {
            return false;
        }
        return this.f22186b.equals(bVar.f22186b);
    }

    public b(t<R> tVar, R r) {
        this.f22185a = tVar;
        this.f22186b = r;
    }
}
