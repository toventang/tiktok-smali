package f.a.a.a;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.d.g;
import f.a.e.j.h;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile g<Callable<aa>, aa> f157154a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile g<aa, aa> f157155b;

    static {
        Covode.recordClassIndex(104351);
    }

    public static aa a(aa aaVar) {
        Objects.requireNonNull(aaVar, "scheduler == null");
        g<aa, aa> gVar = f157155b;
        if (gVar == null) {
            return aaVar;
        }
        return (aa) a(gVar, aaVar);
    }

    public static aa a(Callable<aa> callable) {
        try {
            aa call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw h.a(th);
        }
    }

    public static <T, R> R a(g<T, R> gVar, T t) {
        try {
            return gVar.apply(t);
        } catch (Throwable th) {
            throw h.a(th);
        }
    }
}
