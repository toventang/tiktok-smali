package com.bytedance.bae.base;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {

    public interface BlockingOperation {
        static {
            Covode.recordClassIndex(15354);
        }

        void run();
    }

    static {
        Covode.recordClassIndex(15347);
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        static {
            Covode.recordClassIndex(15355);
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
            /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass2 */

            static {
                Covode.recordClassIndex(15351);
            }

            @Override // com.bytedance.bae.base.ThreadUtils.BlockingOperation
            public final void run() {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() {
            /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15348);
            }

            @Override // com.bytedance.bae.base.ThreadUtils.BlockingOperation
            public final void run() {
                MethodCollector.i(1910);
                thread.join();
                MethodCollector.o(1910);
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
            /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass4 */

            static {
                Covode.recordClassIndex(15353);
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
        MethodCollector.i(1962);
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
        MethodCollector.o(1962);
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
            final AnonymousClass1Result r2 = new Object() {
                /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass1Result */
                public V value;

                static {
                    Covode.recordClassIndex(15350);
                }
            };
            final AnonymousClass1CaughtException r3 = new Object() {
                /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass1CaughtException */

                /* renamed from: e  reason: collision with root package name */
                Exception f26341e;

                static {
                    Covode.recordClassIndex(15349);
                }
            };
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new Runnable() {
                /* class com.bytedance.bae.base.ThreadUtils.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(15352);
                }

                public final void run() {
                    try {
                        r2.value = (V) callable.call();
                    } catch (Exception e2) {
                        r3.f26341e = e2;
                    }
                    countDownLatch.countDown();
                }
            });
            awaitUninterruptibly(countDownLatch);
            if (r3.f26341e == null) {
                return r2.value;
            }
            RuntimeException runtimeException = new RuntimeException(r3.f26341e);
            runtimeException.setStackTrace(concatStackTraces(r3.f26341e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }
}
