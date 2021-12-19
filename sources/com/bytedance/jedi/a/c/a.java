package com.bytedance.jedi.a.c;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.d.k;
import f.a.t;
import f.a.x;
import f.a.z;
import h.a.n;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class a<K, V> implements e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<com.bytedance.jedi.a.l.a<p<K, V>>> f39100a;

    static {
        Covode.recordClassIndex(23949);
    }

    @Override // com.bytedance.jedi.a.c.e
    public final com.bytedance.jedi.a.l.a<p<K, V>> c() {
        return this.f39100a.get();
    }

    /* renamed from: com.bytedance.jedi.a.c.a$a  reason: collision with other inner class name */
    static final class C0942a<T, R> implements g<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0942a f39101a = new C0942a();

        static {
            Covode.recordClassIndex(23950);
        }

        C0942a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            p pVar = (p) obj;
            l.c(pVar, "");
            return pVar.getFirst();
        }
    }

    static final class b<T, R> implements g<T, x<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39102a = new b();

        static {
            Covode.recordClassIndex(23951);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            t tVar = (t) obj;
            l.c(tVar, "");
            return tVar.f(100, TimeUnit.MILLISECONDS);
        }
    }

    static final class d<T, R> implements g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39104a = new d();

        static {
            Covode.recordClassIndex(23953);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.c(obj, "");
            return n.a(obj);
        }
    }

    public a(com.bytedance.jedi.a.l.a<p<K, V>> aVar) {
        l.c(aVar, "");
        this.f39100a = new WeakReference<>(aVar);
    }

    static final class c<T> implements k<List<p<? extends K, ? extends V>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39103a = new c();

        static {
            Covode.recordClassIndex(23952);
        }

        c() {
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            List list = (List) obj;
            l.c(list, "");
            if (list.size() > 0) {
                return true;
            }
            return false;
        }
    }

    protected static t<List<p<K, V>>> a(t<p<K, V>> tVar, boolean z) {
        l.c(tVar, "");
        if (z) {
            f.a.l.g j2 = new f.a.l.c().j();
            tVar.c(C0942a.f39101a).a((g<? super f.a.f.b<K, p<K, V>>, ? extends x<? extends R>>) b.f39102a, false).c((z) j2);
            t<List<p<K, V>>> a2 = j2.c(100, TimeUnit.MILLISECONDS).a(c.f39103a);
            l.a((Object) a2, "");
            return a2;
        }
        t<R> d2 = tVar.d(d.f39104a);
        l.a((Object) d2, "");
        return d2;
    }
}
