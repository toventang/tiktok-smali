package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.l.k;
import java.util.List;
import java.util.ServiceLoader;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f159004a = k.g(k.a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    static {
        Covode.recordClassIndex(105521);
    }

    public static final void a(f fVar, Throwable th) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : f159004a) {
            try {
                coroutineExceptionHandler.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, aj.a(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
