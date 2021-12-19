package com.bytedance.jedi.a.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.l.e;
import f.a.d.k;
import f.a.t;
import f.a.x;
import f.a.y;
import h.a.i;
import h.f.a.m;
import h.f.b.ab;
import h.f.b.l;
import h.p;
import h.v;
import h.w;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public final class e<K, V, K1, V1> {

    /* renamed from: d  reason: collision with root package name */
    public static final b f39271d = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.jedi.a.c.e<K, V> f39272a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.jedi.a.c.e<K1, V1> f39273b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.jedi.a.i.a<K, V, K1, V1> f39274c;

    static {
        Covode.recordClassIndex(24083);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(24089);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static <T> boolean a(T t, T t2) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            if (t != t2) {
                Boolean bool4 = null;
                if (i.h(new Object[]{t, t2}).size() == 2) {
                    bool = Boolean.valueOf(t instanceof b);
                } else {
                    bool = null;
                }
                if (!l.a((Object) bool, (Object) true)) {
                    if (i.h(new Object[]{t, t2}).size() == 2) {
                        bool2 = Boolean.valueOf(t instanceof List);
                    } else {
                        bool2 = null;
                    }
                    if (!l.a((Object) bool2, (Object) true)) {
                        if (i.h(new Object[]{t, t2}).size() == 2) {
                            bool3 = Boolean.valueOf(t instanceof Object[]);
                        } else {
                            bool3 = null;
                        }
                        if (!l.a((Object) bool3, (Object) true)) {
                            if (i.h(new Object[]{t, t2}).size() == 2) {
                                bool4 = Boolean.valueOf(t instanceof Map);
                            }
                            if (!l.a((Object) bool4, (Object) true)) {
                                return l.a((Object) t2, (Object) t);
                            }
                            if (t != null) {
                                T t3 = t;
                                if (t2 != null) {
                                    T t4 = t2;
                                    if (t3.size() != t4.size()) {
                                        return false;
                                    }
                                    Set<Map.Entry<K, V>> entrySet = t3.entrySet();
                                    if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                                        Iterator<T> it = entrySet.iterator();
                                        if (it.hasNext()) {
                                            T next = it.next();
                                            Object key = next.getKey();
                                            Object value = next.getValue();
                                            if (t4.containsKey(key) && a(value, t4.get(key))) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                                throw new w("null cannot be cast to non-null type");
                            }
                            throw new w("null cannot be cast to non-null type");
                        } else if (t != null) {
                            Object[] objArr = (Object[]) t;
                            if (t2 != null) {
                                Object[] objArr2 = (Object[]) t2;
                                if (objArr.length != objArr2.length) {
                                    return false;
                                }
                                Iterator a2 = h.f.b.b.a(objArr);
                                Iterator a3 = h.f.b.b.a(objArr2);
                                while (a2.hasNext() && a3.hasNext()) {
                                    if (!a(a2.next(), a3.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            throw new w("null cannot be cast to non-null type");
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else if (t != null) {
                        T t5 = t;
                        if (t2 != null) {
                            T t6 = t2;
                            if (t5.size() != t6.size()) {
                                return false;
                            }
                            ListIterator listIterator = t5.listIterator();
                            ListIterator listIterator2 = t6.listIterator();
                            while (listIterator.hasNext() && listIterator2.hasNext()) {
                                if (!a(listIterator.next(), listIterator2.next())) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        throw new w("null cannot be cast to non-null type");
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (t != null) {
                    T t7 = t;
                    if (t2 == null) {
                        l.a();
                    }
                    return t7.a();
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else if ((t instanceof Collection) || (t instanceof Map) || (t instanceof Object[])) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static final /* synthetic */ class g extends h.f.b.i implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f39303a = new g();

        static {
            Covode.recordClassIndex(24105);
        }

        g() {
            super(1);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "printStackTrace";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "printStackTrace()V";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(Throwable.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.c(th, "");
            return z.f158842a;
        }
    }

    static final class a<V, K1, V1> implements y<V, p<? extends K1, ? extends V1>> {

        /* renamed from: a  reason: collision with root package name */
        public final com.bytedance.jedi.a.c.e<K1, V1> f39275a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.jedi.a.i.a<?, V, K1, V1> f39276b;

        static {
            Covode.recordClassIndex(24084);
        }

        /* renamed from: com.bytedance.jedi.a.k.e$a$a  reason: collision with other inner class name */
        static final class C0955a<T, R> implements f.a.d.g<T, Iterable<? extends U>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f39277a;

            static {
                Covode.recordClassIndex(24085);
            }

            C0955a(a aVar) {
                this.f39277a = aVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                return ((a.C0951a) this.f39277a.f39276b).f39253b.invoke(obj);
            }
        }

        static final class b<T, R> implements f.a.d.g<T, x<? extends R>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f39278a;

            static {
                Covode.recordClassIndex(24086);
            }

            b(a aVar) {
                this.f39278a = aVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.bytedance.jedi.a.c.e<K1, V1> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                p pVar = (p) obj;
                l.c(pVar, "");
                final Object component1 = pVar.component1();
                final Object component2 = pVar.component2();
                return this.f39278a.f39275a.a(component1).d(new f.a.d.g<T, R>(this) {
                    /* class com.bytedance.jedi.a.k.e.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f39279a;

                    static {
                        Covode.recordClassIndex(24087);
                    }

                    {
                        this.f39279a = r1;
                    }

                    @Override // f.a.d.g
                    public final /* synthetic */ Object apply(Object obj) {
                        com.bytedance.jedi.a.c.f fVar = (com.bytedance.jedi.a.c.f) obj;
                        l.c(fVar, "");
                        Object a2 = fVar.a();
                        Object invoke = ((a.C0951a) this.f39279a.f39278a.f39276b).f39254c.invoke((Object) component2, a2);
                        if (!(!l.a(invoke, a2))) {
                            invoke = null;
                        }
                        return v.a(component1, invoke);
                    }
                }).a(AnonymousClass2.f39282a);
            }
        }

        @Override // f.a.y
        public final x<p<K1, V1>> a(t<V> tVar) {
            l.c(tVar, "");
            if (this.f39276b instanceof a.C0951a) {
                t<R> a2 = tVar.b(new C0955a(this)).a((f.a.d.g<? super U, ? extends x<? extends R>>) new b(this), false);
                l.a((Object) a2, "");
                return a2;
            }
            throw new RuntimeException();
        }

        public a(com.bytedance.jedi.a.c.e<K1, V1> eVar, com.bytedance.jedi.a.i.a<?, V, K1, V1> aVar) {
            l.c(eVar, "");
            l.c(aVar, "");
            this.f39275a = eVar;
            this.f39276b = aVar;
        }
    }

    static final class c<K, V, K1, V1> implements y<p<? extends K, ? extends V>, p<? extends K1, ? extends V1>> {

        /* renamed from: a  reason: collision with root package name */
        public final com.bytedance.jedi.a.c.e<K1, V1> f39283a;

        /* renamed from: b  reason: collision with root package name */
        public final com.bytedance.jedi.a.i.a<K, V, K1, V1> f39284b;

        static {
            Covode.recordClassIndex(24090);
        }

        static final class b<T> implements k<p<? extends K1, ? extends V1>> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f39295a = new b();

            static {
                Covode.recordClassIndex(24097);
            }

            b() {
            }

            @Override // f.a.d.k
            public final /* synthetic */ boolean a(Object obj) {
                p pVar = (p) obj;
                l.c(pVar, "");
                if (pVar.getSecond() != null) {
                    return true;
                }
                return false;
            }
        }

        @Override // f.a.y
        public final x<p<K1, V1>> a(t<p<K, V>> tVar) {
            l.c(tVar, "");
            t<R> a2 = tVar.a((f.a.d.g<? super p<K, V>, ? extends x<? extends R>>) new a(this), false).a(b.f39295a);
            l.a((Object) a2, "");
            return a2;
        }

        static final class a<T, R> implements f.a.d.g<T, x<? extends R>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f39285a;

            static {
                Covode.recordClassIndex(24091);
            }

            a(c cVar) {
                this.f39285a = cVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                p pVar = (p) obj;
                l.c(pVar, "");
                final Object component1 = pVar.component1();
                final Object component2 = pVar.component2();
                com.bytedance.jedi.a.i.a<K, V, K1, V1> aVar = this.f39285a.f39284b;
                if (aVar instanceof a.c) {
                    return t.b(((a.c) this.f39285a.f39284b).f39258b.invoke(component1, component2)).a((f.a.d.g) new f.a.d.g<T, x<? extends R>>(this) {
                        /* class com.bytedance.jedi.a.k.e.c.a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f39286a;

                        static {
                            Covode.recordClassIndex(24092);
                        }

                        {
                            this.f39286a = r1;
                        }

                        @Override // f.a.d.g
                        public final /* synthetic */ Object apply(final Object obj) {
                            return this.f39286a.f39285a.f39283a.a(obj).d(new f.a.d.g<T, R>() {
                                /* class com.bytedance.jedi.a.k.e.c.a.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(24093);
                                }

                                @Override // f.a.d.g
                                public final /* synthetic */ Object apply(Object obj) {
                                    com.bytedance.jedi.a.c.f fVar = (com.bytedance.jedi.a.c.f) obj;
                                    l.c(fVar, "");
                                    return v.a(obj, fVar.a());
                                }
                            });
                        }
                    }, false).d(new f.a.d.g<T, R>(this) {
                        /* class com.bytedance.jedi.a.k.e.c.a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f39288a;

                        static {
                            Covode.recordClassIndex(24094);
                        }

                        {
                            this.f39288a = r1;
                        }

                        @Override // f.a.d.g
                        public final /* synthetic */ Object apply(Object obj) {
                            p pVar = (p) obj;
                            l.c(pVar, "");
                            Object component1 = pVar.component1();
                            Object component2 = pVar.component2();
                            Object invoke = ((a.c) this.f39288a.f39285a.f39284b).f39259c.invoke((Object) component1, (Object) component2, component2);
                            if (b.a(invoke, component2)) {
                                invoke = null;
                            }
                            return v.a(component1, invoke);
                        }
                    });
                }
                if (aVar instanceof a.d) {
                    return f.a.j.b.a(this.f39285a.f39283a.a()).a(new k<p<? extends K1, ? extends V1>>(this) {
                        /* class com.bytedance.jedi.a.k.e.c.a.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f39291a;

                        static {
                            Covode.recordClassIndex(24095);
                        }

                        {
                            this.f39291a = r1;
                        }

                        @Override // f.a.d.k
                        public final /* synthetic */ boolean a(Object obj) {
                            p pVar = (p) obj;
                            l.c(pVar, "");
                            Object component2 = pVar.component2();
                            if (i.h(new Object[]{component2, component2}).size() == 2) {
                                m<? super V, ? super V1, Boolean> mVar = ((a.d) this.f39291a.f39285a.f39284b).f39262b;
                                Object obj2 = (Object) component2;
                                if (obj2 == 0) {
                                    l.a();
                                }
                                if (component2 == null) {
                                    l.a();
                                }
                                Boolean valueOf = Boolean.valueOf(mVar.invoke(obj2, component2).booleanValue());
                                if (valueOf != null) {
                                    return valueOf.booleanValue();
                                }
                            }
                            return false;
                        }
                    }).d(new f.a.d.g<T, R>(this) {
                        /* class com.bytedance.jedi.a.k.e.c.a.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ a f39293a;

                        static {
                            Covode.recordClassIndex(24096);
                        }

                        {
                            this.f39293a = r1;
                        }

                        @Override // f.a.d.g
                        public final /* synthetic */ Object apply(Object obj) {
                            p pVar = (p) obj;
                            l.c(pVar, "");
                            Object component1 = pVar.component1();
                            Object component2 = pVar.component2();
                            m<? super V, ? super V1, ? extends V1> mVar = ((a.d) this.f39293a.f39285a.f39284b).f39263c;
                            Object obj2 = (Object) component2;
                            if (obj2 == 0) {
                                l.a();
                            }
                            if (component2 == null) {
                                l.a();
                            }
                            Object invoke = mVar.invoke(obj2, component2);
                            if (b.a(invoke, component2)) {
                                invoke = null;
                            }
                            return v.a(component1, invoke);
                        }
                    });
                }
                throw new RuntimeException();
            }
        }

        public c(com.bytedance.jedi.a.c.e<K1, V1> eVar, com.bytedance.jedi.a.i.a<K, V, K1, V1> aVar) {
            l.c(eVar, "");
            l.c(aVar, "");
            this.f39283a = eVar;
            this.f39284b = aVar;
        }
    }

    public static final class d<T> implements k<com.bytedance.jedi.a.l.b<p<? extends K, ? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f39296a;

        static {
            Covode.recordClassIndex(24098);
        }

        public d(e eVar) {
            this.f39296a = eVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
            l.c(bVar, "");
            com.bytedance.jedi.a.l.a<p<K1, V1>> c2 = this.f39296a.f39273b.c();
            if (c2 == null || bVar.a((com.bytedance.jedi.a.l.a<?>) c2)) {
                return false;
            }
            return true;
        }
    }

    public static final class f<T> implements f.a.d.f<com.bytedance.jedi.a.l.b<p<? extends K1, ? extends V1>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f39302a;

        static {
            Covode.recordClassIndex(24104);
        }

        public f(e eVar) {
            this.f39302a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.jedi.a.l.b<T> bVar = (com.bytedance.jedi.a.l.b) obj;
            com.bytedance.jedi.a.c.e<K1, V1> eVar = this.f39302a.f39273b;
            if (!(eVar instanceof com.bytedance.jedi.a.l.d)) {
                eVar = null;
            }
            com.bytedance.jedi.a.l.d dVar = (com.bytedance.jedi.a.l.d) eVar;
            if (dVar != null) {
                l.a((Object) bVar, "");
                dVar.b(bVar);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.k.e$e  reason: collision with other inner class name */
    public static final class C0956e<T, R> implements f.a.d.g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f39297a;

        static {
            Covode.recordClassIndex(24099);
        }

        public C0956e(e eVar) {
            this.f39297a = eVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            t<R> a2;
            final com.bytedance.jedi.a.l.b bVar = (com.bytedance.jedi.a.l.b) obj;
            l.c(bVar, "");
            if (this.f39297a.f39274c instanceof a.C0951a) {
                a2 = t.b(bVar.a()).a(AnonymousClass1.f39298a).d(AnonymousClass2.f39299a).a(new a(this.f39297a.f39273b, this.f39297a.f39274c));
            } else {
                a2 = t.b(bVar.a()).a(new c(this.f39297a.f39273b, this.f39297a.f39274c));
            }
            return a2.d(new f.a.d.g<T, R>() {
                /* class com.bytedance.jedi.a.k.e.C0956e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(24102);
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    l.c(obj, "");
                    com.bytedance.jedi.a.l.b bVar = bVar;
                    l.a((Object) bVar, "");
                    return e.a.a(obj, bVar);
                }
            }).a(AnonymousClass4.f39301a).c(f.a.h.a.a(f.a.e.e.e.v.f157740a)).b(f.a.h.a.a(f.a.e.e.e.v.f157740a));
        }
    }

    public e(com.bytedance.jedi.a.c.e<K, V> eVar, com.bytedance.jedi.a.c.e<K1, V1> eVar2, com.bytedance.jedi.a.i.a<K, V, K1, V1> aVar) {
        l.c(eVar, "");
        l.c(eVar2, "");
        l.c(aVar, "");
        this.f39272a = eVar;
        this.f39273b = eVar2;
        this.f39274c = aVar;
    }
}
