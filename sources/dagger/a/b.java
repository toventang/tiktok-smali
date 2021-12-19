package dagger.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dagger.a;

public final class b<T> implements a<T>, javax.a.a<T> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f156651a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f156652b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile javax.a.a<T> f156653c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Object f156654d = f156652b;

    static {
        Covode.recordClassIndex(104021);
    }

    @Override // javax.a.a, dagger.a
    public final T get() {
        MethodCollector.i(4560);
        T t = (T) this.f156654d;
        Object obj = f156652b;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f156654d;
                    if (t == obj) {
                        t = this.f156653c.get();
                        this.f156654d = a(this.f156654d, t);
                        this.f156653c = null;
                    }
                } finally {
                    MethodCollector.o(4560);
                }
            }
        }
        return t;
    }

    public static <P extends javax.a.a<T>, T> javax.a.a<T> a(P p) {
        f.a(p);
        if (p instanceof b) {
            return p;
        }
        return new b(p);
    }

    private b(javax.a.a<T> aVar) {
        if (f156651a || aVar != null) {
            this.f156653c = aVar;
            return;
        }
        throw new AssertionError();
    }

    public static <P extends javax.a.a<T>, T> a<T> b(P p) {
        if (p instanceof a) {
            return (a) p;
        }
        return new b((javax.a.a) f.a(p));
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == f156652b || (obj instanceof e) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }
}
