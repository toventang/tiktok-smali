package com.bytedance.jedi.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.f;
import com.bytedance.jedi.a.l.g;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.Arrays;
import java.util.List;

public interface e<K, V> extends com.bytedance.jedi.a.l.a<p<? extends K, ? extends List<? extends V>>> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39073b = a.f39074a;

    static {
        Covode.recordClassIndex(23926);
    }

    t<f<List<V>>> a(K k2);

    void a(K k2, List<? extends V> list);

    t<List<p<K, List<V>>>> b();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f39074a = new a();

        private a() {
        }

        /* renamed from: com.bytedance.jedi.a.a.e$a$a  reason: collision with other inner class name */
        public static final class C0936a<K, V> extends com.bytedance.jedi.a.c.a<K, List<? extends V>> implements com.bytedance.jedi.a.l.c<p<? extends K, ? extends List<? extends V>>>, com.bytedance.jedi.a.l.d<p<? extends K, ? extends List<? extends V>>> {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ com.bytedance.jedi.a.l.f f39075a;

            /* renamed from: b  reason: collision with root package name */
            private final /* synthetic */ g f39076b;

            static {
                Covode.recordClassIndex(23928);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final void a(com.bytedance.jedi.a.l.b<p<K, List<V>>> bVar) {
                l.c(bVar, "");
                this.f39075a.a(bVar);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final t<com.bytedance.jedi.a.l.b<p<K, List<V>>>> b() {
                return this.f39075a.b();
            }

            @Override // com.bytedance.jedi.a.l.d
            public final void b(com.bytedance.jedi.a.l.b<p<K, List<V>>> bVar) {
                l.c(bVar, "");
                this.f39076b.b(bVar);
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, List<V>>>> a() {
                return f.a(this).b();
            }

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$b */
            static final class b<T, R> implements f.a.d.g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final b f39078a = new b();

                static {
                    Covode.recordClassIndex(23930);
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
            /* renamed from: com.bytedance.jedi.a.a.e$a$a$d */
            public static final class d<T, R> implements f.a.d.g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f39080a = new d();

                static {
                    Covode.recordClassIndex(23932);
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

            /* renamed from: com.bytedance.jedi.a.a.e$a$a$a  reason: collision with other inner class name */
            static final class C0937a<T> implements k<p<? extends K, ? extends List<? extends V>>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Object f39077a;

                static {
                    Covode.recordClassIndex(23929);
                }

                C0937a(Object obj) {
                    this.f39077a = obj;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    p pVar = (p) obj;
                    l.c(pVar, "");
                    return l.a(this.f39077a, pVar.getFirst());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0936a(e<K, V> eVar) {
                super(eVar);
                l.c(eVar, "");
                this.f39075a = new com.bytedance.jedi.a.l.f(eVar);
                this.f39076b = new g(eVar);
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<f<List<V>>> a(K k2) {
                return f.a(this).a(k2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.a.e$a$a$c */
            public static final class c<T> implements k<com.bytedance.jedi.a.l.b<p<? extends K, ? extends List<? extends V>>>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.jedi.a.c.e[] f39079a;

                static {
                    Covode.recordClassIndex(23931);
                }

                c(com.bytedance.jedi.a.c.e[] eVarArr) {
                    this.f39079a = eVarArr;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
                    l.c(bVar, "");
                    for (com.bytedance.jedi.a.c.e eVar : this.f39079a) {
                        com.bytedance.jedi.a.l.a<p<K, V>> c2 = eVar.c();
                        if (c2 == null || bVar.a((com.bytedance.jedi.a.l.a<?>) c2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<f<List<V>>> a(K k2, com.bytedance.jedi.a.c.e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<List<p<K, List<V>>>> i2 = a(false, (com.bytedance.jedi.a.c.e[]) Arrays.copyOf(eVarArr, eVarArr.length)).e().i();
                l.a((Object) i2, "");
                t<f<List<V>>> d2 = f.a.j.b.a(i2).a(new C0937a(k2)).d(b.f39078a);
                l.a((Object) d2, "");
                return d2;
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, List<V>>>> a(boolean z, com.bytedance.jedi.a.c.e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<R> d2 = this.f39075a.b().a(new c(eVarArr)).d(d.f39080a);
                l.a((Object) d2, "");
                t<List<p<K, List<V>>>> a2 = a(d2, z).a(f.a.a.b.a.a());
                l.a((Object) a2, "");
                return a2;
            }
        }

        static {
            Covode.recordClassIndex(23927);
        }
    }
}
