package androidx.core.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final Object f2328a = new Object();

    /* renamed from: b  reason: collision with root package name */
    HandlerThread f2329b;

    /* renamed from: c  reason: collision with root package name */
    Handler f2330c;

    /* renamed from: d  reason: collision with root package name */
    final int f2331d;

    /* renamed from: e  reason: collision with root package name */
    private int f2332e;

    /* renamed from: f  reason: collision with root package name */
    private Handler.Callback f2333f = new Handler.Callback() {
        /* class androidx.core.e.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(745);
        }

        public final boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c cVar = c.this;
                synchronized (cVar.f2328a) {
                    if (!cVar.f2330c.hasMessages(1)) {
                        cVar.f2329b.quit();
                        cVar.f2329b = null;
                        cVar.f2330c = null;
                    }
                }
                return true;
            } else if (i2 != 1) {
                return true;
            } else {
                c cVar2 = c.this;
                ((Runnable) message.obj).run();
                synchronized (cVar2.f2328a) {
                    cVar2.f2330c.removeMessages(0);
                    cVar2.f2330c.sendMessageDelayed(cVar2.f2330c.obtainMessage(0), (long) cVar2.f2331d);
                }
                return true;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final int f2334g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2335h;

    public interface a<T> {
        static {
            Covode.recordClassIndex(749);
        }

        void a(T t);
    }

    static {
        Covode.recordClassIndex(744);
    }

    public c(String str) {
        this.f2335h = str;
        this.f2334g = 10;
        this.f2331d = 10000;
        this.f2332e = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable) {
        synchronized (this.f2328a) {
            if (this.f2329b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f2335h, this.f2334g);
                this.f2329b = handlerThread;
                handlerThread.start();
                this.f2330c = new Handler(this.f2329b.getLooper(), this.f2333f);
                this.f2332e++;
            }
            this.f2330c.removeMessages(0);
            Handler handler = this.f2330c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public final <T> T a(final Callable<T> callable, int i2) {
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new Runnable() {
            /* class androidx.core.e.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(748);
            }

            public final void run() {
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i2);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }
}
