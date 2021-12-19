package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.l.k;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.ci;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final ci f159148a = a();

    /* renamed from: b  reason: collision with root package name */
    public static final o f159149b = new o();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f159150c = y.a("kotlinx.coroutines.fast.service.loader");

    private o() {
    }

    static {
        Covode.recordClassIndex(105667);
    }

    private static ci a() {
        List<MainDispatcherFactory> g2;
        T t;
        ci a2;
        try {
            if (f159150c) {
                g2 = g.a();
            } else {
                g2 = k.g(k.a(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
            }
            Iterator<T> it = g2.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = t.getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = next.getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            T t2 = t;
            if (t2 == null || (a2 = p.a(t2, g2)) == null) {
                return p.a((Throwable) null, 3);
            }
            return a2;
        } catch (Throwable th) {
            return p.a(th, 2);
        }
    }
}
