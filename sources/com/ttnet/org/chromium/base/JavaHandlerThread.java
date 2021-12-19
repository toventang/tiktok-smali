package com.ttnet.org.chromium.base;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.Thread;

public class JavaHandlerThread {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f155157c = true;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f155158a;

    /* renamed from: b  reason: collision with root package name */
    public Throwable f155159b;

    public native void nativeInitializeThread(long j2, long j3);

    public native void nativeOnLooperStopped(long j2);

    private Throwable getUncaughtExceptionIfAny() {
        return this.f155159b;
    }

    private boolean isAlive() {
        return this.f155158a.isAlive();
    }

    static {
        Covode.recordClassIndex(103265);
    }

    private void joinThread() {
        do {
            try {
                this.f155158a.join();
                return;
            } catch (InterruptedException unused) {
                if (0 != 0) {
                }
            }
        } while (0 != 0);
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.f155158a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.AnonymousClass3 */

            static {
                Covode.recordClassIndex(103268);
            }

            public final void uncaughtException(Thread thread, Throwable th) {
                JavaHandlerThread.this.f155159b = th;
            }
        });
    }

    private void quitThreadSafely(final long j2) {
        new Handler(this.f155158a.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103267);
            }

            public final void run() {
                MethodCollector.i(13465);
                JavaHandlerThread.this.f155158a.quit();
                JavaHandlerThread.this.nativeOnLooperStopped(j2);
                MethodCollector.o(13465);
            }
        });
        int i2 = Build.VERSION.SDK_INT;
        this.f155158a.getLooper().quitSafely();
    }

    private static JavaHandlerThread create(String str, int i2) {
        return new JavaHandlerThread(str, i2);
    }

    private JavaHandlerThread(String str, int i2) {
        this.f155158a = new HandlerThread(str, i2);
    }

    private void startAndInitialize(final long j2, final long j3) {
        if (this.f155158a.getState() == Thread.State.NEW) {
            this.f155158a.start();
        }
        new Handler(this.f155158a.getLooper()).post(new Runnable() {
            /* class com.ttnet.org.chromium.base.JavaHandlerThread.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103266);
            }

            public final void run() {
                MethodCollector.i(11436);
                JavaHandlerThread.this.nativeInitializeThread(j2, j3);
                MethodCollector.o(11436);
            }
        });
    }
}
