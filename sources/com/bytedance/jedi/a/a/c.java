package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.l.g;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.Arrays;
import java.util.List;

public interface c<K, V> extends com.bytedance.jedi.a.l.a<p<? extends K, ? extends V>> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39065b = a.f39066a;

    static {
        Covode.recordClassIndex(23918);
    }

    t<f<V>> a(K k2);

    void a(K k2, V v);

    t<List<p<K, V>>> b();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f39066a = new a();

        private a() {
        }

        /* renamed from: com.bytedance.jedi.a.a.c$a$a  reason: collision with other inner class name */
        public static final class C0933a<K, V> extends com.bytedance.jedi.a.c.a<K, V> implements com.bytedance.jedi.a.l.c<p<? extends K, ? extends V>>, com.bytedance.jedi.a.l.d<p<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ com.bytedance.jedi.a.l.f f39067a;

            /* renamed from: b  reason: collision with root package name */
            private final /* synthetic */ g f39068b;

            static {
                Covode.recordClassIndex(23920);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final void a(com.bytedance.jedi.a.l.b<p<K, V>> bVar) {
                l.c(bVar, "");
                this.f39067a.a(bVar);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final t<com.bytedance.jedi.a.l.b<p<K, V>>> b() {
                return this.f39067a.b();
            }

            @Override // com.bytedance.jedi.a.l.d
            public final void b(com.bytedance.jedi.a.l.b<p<K, V>> bVar) {
                l.c(bVar, "");
                this.f39068b.b(bVar);
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, V>>> a() {
                return d.a(this).b();
            }

            /* renamed from: com.bytedance.jedi.a.a.c$a$a$b */
            static final class b<T, R> implements f.a.d.g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f39070a = new b();

                static {
                    Covode.recordClassIndex(23922);
                }

                b() {
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    p pVar = (p) obj;
                    l.c(pVar, "");
                    return com.bytedance.jedi.a.c.g.a(pVar.getSecond());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.a.c$a$a$d */
            public static final class d<T, R> implements f.a.d.g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f39072a = new d();

                static {
                    Covode.recordClassIndex(23924);
                }

                d() {
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
                    l.c(bVar, "");
                    return bVar.a();
                }
            }

            /* renamed from: com.bytedance.jedi.a.a.c$a$a$a  reason: collision with other inner class name */
            static final class C0934a<T> implements k<p<? extends K, ? extends V>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Object f39069a;

                static {
                    Covode.recordClassIndex(23921);
                }

                C0934a(Object obj) {
                    this.f39069a = obj;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    p pVar = (p) obj;
                    l.c(pVar, "");
                    return l.a(this.f39069a, pVar.getFirst());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0933a(c<K, V> cVar) {
                super(cVar);
                l.c(cVar, "");
                this.f39067a = new com.bytedance.jedi.a.l.f(cVar);
                this.f39068b = new g(cVar);
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<f<V>> a(K k2) {
                return d.a(this).a(k2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.a.c$a$a$c  reason: collision with other inner class name */
            public static final class C0935c<T> implements k<com.bytedance.jedi.a.l.b<p<? extends K, ? extends V>>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e[] f39071a;

                static {
                    Covode.recordClassIndex(23923);
                }

                C0935c(e[] eVarArr) {
                    this.f39071a = eVarArr;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
                    l.c(bVar, "");
                    for (e eVar : this.f39071a) {
                        com.bytedance.jedi.a.l.a<p<K, V>> c2 = eVar.c();
                        if (c2 == null || bVar.a((com.bytedance.jedi.a.l.a<?>) c2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<f<V>> a(K k2, e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<List<p<K, V>>> i2 = a(false, (e[]) Arrays.copyOf(eVarArr, eVarArr.length)).e().i();
                l.a((Object) i2, "");
                t<f<V>> d2 = f.a.j.b.a(i2).a(new C0934a(k2)).d(b.f39070a);
                l.a((Object) d2, "");
                return d2;
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, V>>> a(boolean z, e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<R> d2 = this.f39067a.b().a(new C0935c(eVarArr)).d(d.f39072a);
                l.a((Object) d2, "");
                t<List<p<K, V>>> a2 = a(d2, z).a(f.a.a.b.a.a());
                l.a((Object) a2, "");
                return a2;
            }
        }

        static {
            Covode.recordClassIndex(23919);
        }
    }
}
