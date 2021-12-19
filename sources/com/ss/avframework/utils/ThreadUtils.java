package com.ss.avframework.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public interface BlockingOperation {
        static {
            Covode.recordClassIndex(100620);
        }

        void run();
    }

    static {
        Covode.recordClassIndex(100609);
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        static {
            Covode.recordClassIndex(100621);
        }

        public void detachThread() {
            this.thread = null;
        }

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100613);
            }

            @Override // com.ss.avframework.utils.ThreadUtils.BlockingOperation
            public final void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100610);
            }

            @Override // com.ss.avframework.utils.ThreadUtils.BlockingOperation
            public final void run() {
                MethodCollector.i(12436);
                thread.join();
                MethodCollector.o(12436);
            }
        });
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[(stackTraceElementArr.length + stackTraceElementArr2.length)];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() {
            /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass4 */

            static {
                Covode.recordClassIndex(100617);
            }

            @Override // java.util.concurrent.Callable
            public final Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j3 = j2;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j3, TimeUnit.MILLISECONDS);
                if (z2) {
                }
            } catch (InterruptedException unused) {
                z2 = true;
                j3 = j2 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j3 <= 0) {
                    break;
                }
            }
        }
        Thread.currentThread().interrupt();
        return z;
    }

    public static boolean joinUninterruptibly(Thread thread, long j2) {
        MethodCollector.i(13582);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = j2;
        boolean z = false;
        while (j3 > 0) {
            try {
                thread.join(j3);
                break;
            } catch (InterruptedException unused) {
                j3 = j2 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        boolean isAlive = thread.isAlive();
        MethodCollector.o(13582);
        if (!isAlive) {
            return true;
        }
        return false;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            final AnonymousClass1Result r4 = new Object() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass1Result */
                public V value;

                static {
                    Covode.recordClassIndex(100612);
                }
            };
            final AnonymousClass1CaughtException r3 = new Object() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass1CaughtException */

                /* renamed from: e  reason: collision with root package name */
                Exception f151625e;

                static {
                    Covode.recordClassIndex(100611);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(100616);
                }

                public final void run() {
                    try {
                        r4.value = (V) callable.call();
                    } catch (Exception e2) {
                        r3.f151625e = e2;
                    }
                    countDownLatch.countDown();
                }
            })) {
                Exception exc = new Exception("Handler is invalid");
                exc.printStackTrace();
                AVLog.ioe("ThreadUtils", exc.getCause() + " " + Log.getStackTraceString(exc));
                countDownLatch.countDown();
            }
            awaitUninterruptibly(countDownLatch);
            if (r3.f151625e == null) {
                return r4.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f151625e);
            runtimeException.setStackTrace(concatStackTraces(r3.f151625e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    public static long invokeAtFrontUninterruptibly(Handler handler, Runnable runnable, long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!handler.post(new Runnable() {
            /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass6 */

            static {
                Covode.recordClassIndex(100619);
            }

            public final void run() {
                countDownLatch.countDown();
            }
        })) {
            return -1;
        }
        if (awaitUninterruptibly(countDownLatch, j2)) {
            return 0;
        }
        return j2;
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable, long j2) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            final AnonymousClass2Result r2 = new Object() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass2Result */
                public V value;

                static {
                    Covode.recordClassIndex(100615);
                }
            };
            final AnonymousClass2CaughtException r3 = new Object() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass2CaughtException */

                /* renamed from: e  reason: collision with root package name */
                Exception f151626e;

                static {
                    Covode.recordClassIndex(100614);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (!handler.post(new Runnable() {
                /* class com.ss.avframework.utils.ThreadUtils.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(100618);
                }

                public final void run() {
                    try {
                        r2.value = (V) callable.call();
                    } catch (Exception e2) {
                        r3.f151626e = e2;
                    }
                    countDownLatch.countDown();
                }
            })) {
                Exception exc = new Exception("Handler is invalid");
                exc.printStackTrace();
                AVLog.ioe("ThreadUtils", exc.getCause() + " " + Log.getStackTraceString(exc));
                countDownLatch.countDown();
            }
            awaitUninterruptibly(countDownLatch, j2);
            if (r3.f151626e == null) {
                return r2.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f151626e);
            runtimeException.setStackTrace(concatStackTraces(r3.f151626e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
