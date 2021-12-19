package f.a.e.a;

import com.bytedance.covode.number.Covode;
import f.a.ae;
import f.a.e.c.d;
import f.a.p;
import f.a.z;

public enum c implements d<Object> {
    INSTANCE,
    NEVER;

    @Override // f.a.e.c.i
    public final void clear() {
    }

    @Override // f.a.b.b
    public final void dispose() {
    }

    @Override // f.a.e.c.i
    public final boolean isEmpty() {
        return true;
    }

    @Override // f.a.e.c.i
    public final Object poll() {
        return null;
    }

    @Override // f.a.e.c.e
    public final int requestFusion(int i2) {
        return i2 & 2;
    }

    @Override // f.a.b.b
    public final boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(104402);
    }

    @Override // f.a.e.c.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(f.a.d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void complete(p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onComplete();
    }

    public static void complete(z<?> zVar) {
        zVar.onSubscribe(INSTANCE);
        zVar.onComplete();
    }

    public static void error(Throwable th, ae<?> aeVar) {
        aeVar.onSubscribe(INSTANCE);
        aeVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, f.a.d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th);
    }

    public static void error(Throwable th, p<?> pVar) {
        pVar.onSubscribe(INSTANCE);
        pVar.onError(th);
    }

    public static void error(Throwable th, z<?> zVar) {
        zVar.onSubscribe(INSTANCE);
        zVar.onError(th);
    }
}
