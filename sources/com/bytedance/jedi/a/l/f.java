package com.bytedance.jedi.a.l;

import com.bytedance.covode.number.Covode;
import com.e.a.c;
import com.e.a.d;
import f.a.t;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.p;
import java.lang.ref.WeakReference;

public final class f<K, V> implements c<p<? extends K, ? extends V>> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39308a = {new y(ab.a(f.class), "subject", "getSubject()Lcom/jakewharton/rxrelay2/Relay;")};

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<a<p<K, V>>> f39309b;

    /* renamed from: c  reason: collision with root package name */
    private final h f39310c = h.i.a((h.f.a.a) b.f39312a);

    private final c<b<p<K, V>>> a() {
        return (c) this.f39310c.getValue();
    }

    static final class b extends m implements h.f.a.a<c<b<p<? extends K, ? extends V>>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39312a = new b();

        static {
            Covode.recordClassIndex(24115);
        }

        b() {
            super(0);
        }

        @Override // h.f.a.a
        public final /* synthetic */ Object invoke() {
            return new d(new com.e.a.b());
        }
    }

    static {
        Covode.recordClassIndex(24113);
    }

    @Override // com.bytedance.jedi.a.l.c
    public final t<b<p<K, V>>> b() {
        t<b<p<K, V>>> b2 = a().b(new a(this));
        l.a((Object) b2, "");
        return b2;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f<b<p<? extends K, ? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f39311a;

        static {
            Covode.recordClassIndex(24114);
        }

        a(f fVar) {
            this.f39311a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            a<p<K, V>> aVar = this.f39311a.f39309b.get();
            if (aVar == null) {
                l.a();
            }
            l.a((Object) aVar, "");
            bVar.b(aVar);
        }
    }

    public f(a<p<K, V>> aVar) {
        l.c(aVar, "");
        this.f39309b = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.jedi.a.l.c
    public final void a(b<p<K, V>> bVar) {
        l.c(bVar, "");
        a().accept(bVar);
    }
}
