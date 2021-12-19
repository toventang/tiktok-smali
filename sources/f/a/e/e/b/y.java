package f.a.e.e.b;

import com.bytedance.covode.number.Covode;
import f.a.d.g;
import f.a.e.i.d;
import f.a.h;
import java.util.concurrent.Callable;
import org.a.b;
import org.a.c;

public final class y {
    static {
        Covode.recordClassIndex(104541);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T, R> extends h<R> {

        /* renamed from: b  reason: collision with root package name */
        final T f157344b;

        /* renamed from: c  reason: collision with root package name */
        final g<? super T, ? extends b<? extends R>> f157345c;

        static {
            Covode.recordClassIndex(104542);
        }

        @Override // f.a.h
        public final void a(c<? super R> cVar) {
            try {
                b bVar = (b) f.a.e.b.b.a(this.f157345c.apply(this.f157344b), "The mapper returned a null Publisher");
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            f.a.e.i.c.complete(cVar);
                        } else {
                            cVar.onSubscribe(new d(cVar, call));
                        }
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        f.a.e.i.c.error(th, cVar);
                    }
                } else {
                    bVar.a_(cVar);
                }
            } catch (Throwable th2) {
                f.a.e.i.c.error(th2, cVar);
            }
        }

        a(T t, g<? super T, ? extends b<? extends R>> gVar) {
            this.f157344b = t;
            this.f157345c = gVar;
        }
    }

    public static <T, U> h<U> a(T t, g<? super T, ? extends b<? extends U>> gVar) {
        return f.a.h.a.a(new a(t, gVar));
    }

    public static <T, R> boolean a(b<T> bVar, c<? super R> cVar, g<? super T, ? extends b<? extends R>> gVar) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object obj = (Object) ((Callable) bVar).call();
            if (obj == 0) {
                f.a.e.i.c.complete(cVar);
                return true;
            }
            try {
                b bVar2 = (b) f.a.e.b.b.a(gVar.apply(obj), "The mapper returned a null Publisher");
                if (bVar2 instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar2).call();
                        if (call == null) {
                            f.a.e.i.c.complete(cVar);
                            return true;
                        }
                        cVar.onSubscribe(new d(cVar, call));
                    } catch (Throwable th) {
                        f.a.c.b.a(th);
                        f.a.e.i.c.error(th, cVar);
                        return true;
                    }
                } else {
                    bVar2.a_(cVar);
                }
                return true;
            } catch (Throwable th2) {
                f.a.c.b.a(th2);
                f.a.e.i.c.error(th2, cVar);
                return true;
            }
        } catch (Throwable th3) {
            f.a.c.b.a(th3);
            f.a.e.i.c.error(th3, cVar);
            return true;
        }
    }
}
