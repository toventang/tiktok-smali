package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.h.a;
import f.a.z;
import java.util.concurrent.atomic.AtomicInteger;

public final class i {
    static {
        Covode.recordClassIndex(104869);
    }

    public static void a(z<?> zVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = cVar.terminate();
            if (terminate != null) {
                zVar.onError(terminate);
            } else {
                zVar.onComplete();
            }
        }
    }

    public static void a(z<?> zVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        if (!cVar.addThrowable(th)) {
            a.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            zVar.onError(cVar.terminate());
        }
    }

    public static <T> void a(z<? super T> zVar, T t, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            zVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = cVar.terminate();
                if (terminate != null) {
                    zVar.onError(terminate);
                } else {
                    zVar.onComplete();
                }
            }
        }
    }
}
