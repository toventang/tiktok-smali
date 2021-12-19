package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.j.h;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class at extends EventLoopImplBase implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: a  reason: collision with root package name */
    public static final at f159025a;

    /* renamed from: c  reason: collision with root package name */
    private static final long f159026c;
    private static volatile int debugStatus;

    private at() {
    }

    private static boolean a() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.bm
    public final Thread getThread() {
        Thread thread = _thread;
        if (thread == null) {
            return b();
        }
        return thread;
    }

    private final synchronized Thread b() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized boolean c() {
        if (a()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final synchronized void d() {
        if (a()) {
            debugStatus = 3;
            resetAll();
            notifyAll();
        }
    }

    static {
        Long l2;
        Covode.recordClassIndex(105542);
        at atVar = new at();
        f159025a = atVar;
        bl.incrementUseCount$default(atVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f159026c = timeUnit.toNanos(l2.longValue());
    }

    public final void run() {
        long j2;
        cw.f159100a.set(this);
        try {
            if (c()) {
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long processNextEvent = processNextEvent();
                    if (processNextEvent == Long.MAX_VALUE) {
                        if (j3 == Long.MAX_VALUE) {
                            cx cxVar = cy.f159102a;
                            if (cxVar != null) {
                                j2 = cxVar.a();
                            } else {
                                j2 = System.nanoTime();
                            }
                            if (j3 == Long.MAX_VALUE) {
                                j3 = f159026c + j2;
                            }
                            long j4 = j3 - j2;
                            if (j4 <= 0) {
                                _thread = null;
                                d();
                                if (!isEmpty()) {
                                    getThread();
                                    return;
                                }
                                return;
                            }
                            processNextEvent = h.b(processNextEvent, j4);
                        } else {
                            processNextEvent = h.b(processNextEvent, f159026c);
                        }
                    }
                    if (processNextEvent > 0) {
                        if (a()) {
                            _thread = null;
                            d();
                            if (!isEmpty()) {
                                getThread();
                                return;
                            }
                            return;
                        } else if (cy.f159102a == null) {
                            LockSupport.parkNanos(this, processNextEvent);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            d();
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.ax, kotlinx.coroutines.EventLoopImplBase
    public final bh invokeOnTimeout(long j2, Runnable runnable) {
        return scheduleInvokeOnTimeout(j2, runnable);
    }
}
