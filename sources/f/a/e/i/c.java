package f.a.e.i;

import com.bytedance.covode.number.Covode;
import f.a.e.c.f;

public enum c implements f<Object> {
    INSTANCE;

    @Override // org.a.d
    public final void cancel() {
    }

    @Override // f.a.e.c.i
    public final void clear() {
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

    public final String toString() {
        return "EmptySubscription";
    }

    static {
        Covode.recordClassIndex(104855);
    }

    @Override // org.a.d
    public final void request(long j2) {
        f.validate(j2);
    }

    @Override // f.a.e.c.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(org.a.c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th, org.a.c<?> cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th);
    }

    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
