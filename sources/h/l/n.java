package h.l;

import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.b.l;
import h.f.b.m;
import java.util.Iterator;

public class n extends m {

    static final class c extends m implements h.f.a.b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f158788a = new c();

        static {
            Covode.recordClassIndex(105320);
        }

        c() {
            super(1);
        }

        @Override // h.f.a.b
        public final T invoke(T t) {
            return t;
        }
    }

    static {
        Covode.recordClassIndex(105317);
    }

    public static final class a implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f158786a;

        static {
            Covode.recordClassIndex(105318);
        }

        @Override // h.l.h
        public final Iterator<T> a() {
            return this.f158786a;
        }

        public a(Iterator it) {
            this.f158786a = it;
        }
    }

    static final class d extends m implements h.f.a.a<T> {
        final /* synthetic */ Object $seed;

        static {
            Covode.recordClassIndex(105321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Object obj) {
            super(0);
            this.$seed = obj;
        }

        @Override // h.f.a.a
        public final T invoke() {
            return (T) this.$seed;
        }
    }

    static final class b extends m implements h.f.a.b<h<? extends T>, Iterator<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f158787a = new b();

        static {
            Covode.recordClassIndex(105319);
        }

        b() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            h hVar = (h) obj;
            l.d(hVar, "");
            return hVar.a();
        }
    }

    public static final <T> h<T> a(Iterator<? extends T> it) {
        l.d(it, "");
        return k.b(new a(it));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.l.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> b(h<? extends T> hVar) {
        l.d(hVar, "");
        if (hVar instanceof a) {
            return hVar;
        }
        return new a(hVar);
    }

    public static final <T> h<T> a(h<? extends h<? extends T>> hVar) {
        l.d(hVar, "");
        b bVar = b.f158787a;
        if (!(hVar instanceof r)) {
            return new e(hVar, c.f158788a, bVar);
        }
        r rVar = (r) hVar;
        l.d(bVar, "");
        return new e(rVar.f158801a, rVar.f158802b, bVar);
    }

    public static final <T> h<T> a(T... tArr) {
        l.d(tArr, "");
        if (tArr.length == 0) {
            return c.f158758a;
        }
        return i.p(tArr);
    }

    public static final <T> h<T> a(T t, h.f.a.b<? super T, ? extends T> bVar) {
        l.d(bVar, "");
        if (t == null) {
            return c.f158758a;
        }
        return new f(new d(t), bVar);
    }
}
