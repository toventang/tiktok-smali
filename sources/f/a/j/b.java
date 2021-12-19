package f.a.j;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class b {

    /* access modifiers changed from: package-private */
    public static final class a<T, R> implements g<T, Iterable<? extends U>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f157994a = new a();

        static {
            Covode.recordClassIndex(104897);
        }

        a() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.c(obj, "");
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(104896);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: f.a.t<U>, java.lang.Object, f.a.t<T> */
    public static final <T> t<T> a(t<? extends Iterable<? extends T>> tVar) {
        l.c(tVar, "");
        t tVar2 = (t<U>) tVar.b((g<? super Object, ? extends Iterable<? extends U>>) a.f157994a);
        l.a((Object) tVar2, "");
        return tVar2;
    }
}
