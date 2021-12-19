package h.l;

import com.bytedance.covode.number.Covode;
import h.a.ac;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class p extends o {
    static {
        Covode.recordClassIndex(105323);
    }

    public static final class a implements h.f.b.a.a, Iterable<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f158789a;

        static {
            Covode.recordClassIndex(105324);
        }

        @Override // java.lang.Iterable
        public final Iterator<T> iterator() {
            return this.f158789a.a();
        }

        public a(h hVar) {
            this.f158789a = hVar;
        }
    }

    public static final class g implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f158794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Comparator f158795b;

        static {
            Covode.recordClassIndex(105330);
        }

        @Override // h.l.h
        public final Iterator<T> a() {
            List h2 = k.h(this.f158794a);
            n.a(h2, this.f158795b);
            return h2.iterator();
        }

        g(h<? extends T> hVar, Comparator comparator) {
            this.f158794a = hVar;
            this.f158795b = comparator;
        }
    }

    public static final class c extends m implements h.f.a.b<ac<? extends T>, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f158790a = new c();

        static {
            Covode.recordClassIndex(105326);
        }

        c() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            ac acVar = (ac) obj;
            l.d(acVar, "");
            return acVar.f158623b;
        }
    }

    static final class d extends m implements h.f.a.b<T, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f158791a = new d();

        static {
            Covode.recordClassIndex(105327);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Object obj) {
            boolean z;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final /* synthetic */ class e extends j implements h.f.a.b<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f158792a = new e();

        static {
            Covode.recordClassIndex(105328);
        }

        e() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            Iterable iterable = (Iterable) obj;
            l.d(iterable, "");
            return iterable.iterator();
        }
    }

    static final /* synthetic */ class f extends j implements h.f.a.b<h<? extends R>, Iterator<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f158793a = new f();

        static {
            Covode.recordClassIndex(105329);
        }

        f() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            h hVar = (h) obj;
            l.d(hVar, "");
            return hVar.a();
        }
    }

    public static final <T> h<T> e(h<? extends T> hVar) {
        l.d(hVar, "");
        return k.b(hVar, d.f158791a);
    }

    public static final <T> List<T> g(h<? extends T> hVar) {
        l.d(hVar, "");
        return n.b(k.h(hVar));
    }

    public static final <T> boolean i(h<? extends T> hVar) {
        l.d(hVar, "");
        return hVar.a().hasNext();
    }

    public static final <T> Iterable<T> k(h<? extends T> hVar) {
        l.d(hVar, "");
        return new a(hVar);
    }

    public static final class b extends m implements h.f.a.b<ac<? extends T>, Boolean> {
        final /* synthetic */ h.f.a.m $predicate;

        static {
            Covode.recordClassIndex(105325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.f.a.m mVar) {
            super(1);
            this.$predicate = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Object obj) {
            ac acVar = (ac) obj;
            l.d(acVar, "");
            return Boolean.valueOf(((Boolean) this.$predicate.invoke(Integer.valueOf(acVar.f158622a), acVar.f158623b)).booleanValue());
        }
    }

    public static final <T> T c(h<? extends T> hVar) {
        l.d(hVar, "");
        Iterator<? extends T> a2 = hVar.a();
        if (a2.hasNext()) {
            return (T) a2.next();
        }
        return null;
    }

    public static final <T> T d(h<? extends T> hVar) {
        l.d(hVar, "");
        Iterator<? extends T> a2 = hVar.a();
        if (!a2.hasNext()) {
            return null;
        }
        return (T) a2.next();
    }

    public static final <T> List<T> h(h<? extends T> hVar) {
        l.d(hVar, "");
        return (List) k.a((h) hVar, (Collection) new ArrayList());
    }

    public static final <T> int j(h<? extends T> hVar) {
        l.d(hVar, "");
        Iterator<? extends T> a2 = hVar.a();
        int i2 = 0;
        while (a2.hasNext()) {
            a2.next();
            i2++;
            if (i2 < 0) {
                n.b();
            }
        }
        return i2;
    }

    public static final <T> HashSet<T> f(h<? extends T> hVar) {
        l.d(hVar, "");
        return (HashSet) k.a((h) hVar, (Collection) new HashSet());
    }

    public static final <T> h<T> a(h<? extends T> hVar, h.f.a.b<? super T, Boolean> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return new d(hVar, true, bVar);
    }

    public static final <T> h<T> b(h<? extends T> hVar, h.f.a.b<? super T, Boolean> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return new d(hVar, false, bVar);
    }

    public static final <T, R> h<R> c(h<? extends T> hVar, h.f.a.b<? super T, ? extends Iterable<? extends R>> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return new e(hVar, bVar, e.f158792a);
    }

    public static final <T, R> h<R> d(h<? extends T> hVar, h.f.a.b<? super T, ? extends h<? extends R>> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return new e(hVar, bVar, f.f158793a);
    }

    public static final <T> h<T> a(h<? extends T> hVar, h<? extends T> hVar2) {
        l.d(hVar, "");
        l.d(hVar2, "");
        return k.a(k.a(hVar, hVar2));
    }

    public static final <T, R> h<R> e(h<? extends T> hVar, h.f.a.b<? super T, ? extends R> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return new r(hVar, bVar);
    }

    public static final <T, R> h<R> f(h<? extends T> hVar, h.f.a.b<? super T, ? extends R> bVar) {
        l.d(hVar, "");
        l.d(bVar, "");
        return k.e(new r(hVar, bVar));
    }

    public static final <T> h<T> a(h<? extends T> hVar, T t) {
        l.d(hVar, "");
        return k.a(k.a(hVar, k.a(t)));
    }

    public static final <T> h<T> a(h<? extends T> hVar, Comparator<? super T> comparator) {
        l.d(hVar, "");
        l.d(comparator, "");
        return new g(hVar, comparator);
    }

    public static final <T, C extends Collection<? super T>> C a(h<? extends T> hVar, C c2) {
        l.d(hVar, "");
        l.d(c2, "");
        Iterator<? extends T> a2 = hVar.a();
        while (a2.hasNext()) {
            c2.add(a2.next());
        }
        return c2;
    }
}
