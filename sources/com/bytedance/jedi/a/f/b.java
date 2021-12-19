package com.bytedance.jedi.a.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.l.f;
import f.a.d.g;
import f.a.d.k;
import f.a.e.e.e.v;
import f.a.t;
import h.f.b.l;
import h.p;
import h.w;
import java.util.Arrays;
import java.util.List;

public interface b<K, V, REQ, RESP> extends com.bytedance.jedi.a.l.a<p<? extends K, ? extends V>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f39118e = a.f39119a;

    static {
        Covode.recordClassIndex(23970);
    }

    V a(REQ req, RESP resp);

    K b(REQ req);

    t<RESP> c(REQ req);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f39119a = new a();

        private a() {
        }

        /* renamed from: com.bytedance.jedi.a.f.b$a$a  reason: collision with other inner class name */
        public static final class C0944a<K, V, REQ, RESP> extends com.bytedance.jedi.a.c.a<K, V> implements com.bytedance.jedi.a.l.c<p<? extends K, ? extends V>> {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ f f39120a;

            static {
                Covode.recordClassIndex(23972);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final void a(com.bytedance.jedi.a.l.b<p<K, V>> bVar) {
                l.c(bVar, "");
                this.f39120a.a(bVar);
            }

            @Override // com.bytedance.jedi.a.l.c
            public final t<com.bytedance.jedi.a.l.b<p<K, V>>> b() {
                return this.f39120a.b();
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, V>>> a() {
                t<List<p<K, V>>> a2 = f.a.h.a.a(v.f157740a);
                l.a((Object) a2, "");
                return a2;
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$b  reason: collision with other inner class name */
            static final class C0946b<T, R> implements g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0946b f39122a = new C0946b();

                static {
                    Covode.recordClassIndex(23974);
                }

                C0946b() {
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    p pVar = (p) obj;
                    l.c(pVar, "");
                    return com.bytedance.jedi.a.c.g.a(pVar.getSecond());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.f.b$a$a$d */
            public static final class d<T, R> implements g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                public static final d f39124a = new d();

                static {
                    Covode.recordClassIndex(23976);
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

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$e */
            static final class e<T, R> implements g<T, R> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f39125a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C0944a f39126b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Object f39127c;

                static {
                    Covode.recordClassIndex(23977);
                }

                e(b bVar, C0944a aVar, Object obj) {
                    this.f39125a = bVar;
                    this.f39126b = aVar;
                    this.f39127c = obj;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.jedi.a.f.b */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    return com.bytedance.jedi.a.c.g.a(this.f39125a.a(this.f39127c, obj));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0944a(b<K, V, REQ, RESP> bVar) {
                super(bVar);
                l.c(bVar, "");
                this.f39120a = new f(bVar);
            }

            /* renamed from: com.bytedance.jedi.a.f.b$a$a$a  reason: collision with other inner class name */
            static final class C0945a<T> implements k<p<? extends K, ? extends V>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Object f39121a;

                static {
                    Covode.recordClassIndex(23973);
                }

                C0945a(Object obj) {
                    this.f39121a = obj;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    p pVar = (p) obj;
                    l.c(pVar, "");
                    return l.a(this.f39121a, pVar.getFirst());
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.bytedance.jedi.a.f.b$a$a$c */
            public static final class c<T> implements k<com.bytedance.jedi.a.l.b<p<? extends K, ? extends V>>> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.bytedance.jedi.a.c.e[] f39123a;

                static {
                    Covode.recordClassIndex(23975);
                }

                c(com.bytedance.jedi.a.c.e[] eVarArr) {
                    this.f39123a = eVarArr;
                }

                @Override // f.a.d.k
                public final /* synthetic */ boolean a(Object obj) {
                    com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
                    l.c(bVar, "");
                    for (com.bytedance.jedi.a.c.e eVar : this.f39123a) {
                        com.bytedance.jedi.a.l.a<p<K, V>> c2 = eVar.c();
                        if (c2 == null || bVar.a((com.bytedance.jedi.a.l.a<?>) c2)) {
                            return false;
                        }
                    }
                    return true;
                }
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<com.bytedance.jedi.a.c.f<V>> a(K k2) {
                if ((k2 instanceof Object) && k2 != null) {
                    com.bytedance.jedi.a.l.a<p<K, V>> c2 = c();
                    if (c2 != null) {
                        b bVar = (b) c2;
                        t<R> d2 = bVar.c(k2).d(new e(bVar, this, k2));
                        if (d2 != null) {
                            return d2;
                        }
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                t<com.bytedance.jedi.a.c.f<V>> a2 = f.a.h.a.a(v.f157740a);
                l.a((Object) a2, "");
                return a2;
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<com.bytedance.jedi.a.c.f<V>> a(K k2, com.bytedance.jedi.a.c.e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<List<p<K, V>>> i2 = a(false, (com.bytedance.jedi.a.c.e[]) Arrays.copyOf(eVarArr, eVarArr.length)).e().i();
                l.a((Object) i2, "");
                t<com.bytedance.jedi.a.c.f<V>> d2 = f.a.j.b.a(i2).a(new C0945a(k2)).d(C0946b.f39122a);
                l.a((Object) d2, "");
                return d2;
            }

            @Override // com.bytedance.jedi.a.c.e
            public final t<List<p<K, V>>> a(boolean z, com.bytedance.jedi.a.c.e<?, ?>... eVarArr) {
                l.c(eVarArr, "");
                t<R> d2 = this.f39120a.b().a(new c(eVarArr)).d(d.f39124a);
                l.a((Object) d2, "");
                t<List<p<K, V>>> a2 = a(d2, z).a(f.a.a.b.a.a());
                l.a((Object) a2, "");
                return a2;
            }
        }

        static {
            Covode.recordClassIndex(23971);
        }
    }
}
