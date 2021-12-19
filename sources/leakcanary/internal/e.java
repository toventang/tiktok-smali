package leakcanary.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<T> f159422a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    final CountDownLatch f159423b = new CountDownLatch(1);

    static {
        Covode.recordClassIndex(105847);
    }

    public final void a(T t) {
        this.f159422a.set(t);
        this.f159423b.countDown();
    }

    public final boolean a(TimeUnit timeUnit) {
        l.c(timeUnit, "");
        try {
            return this.f159423b.await(5, timeUnit);
        } catch (InterruptedException e2) {
            throw new RuntimeException("Did not expect thread to be interrupted", e2);
        }
    }
}
