package com.bytedance.android.ecommerce.ocr.a;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class f {

    /* renamed from: a  reason: collision with root package name */
    static f f7214a;

    /* renamed from: b  reason: collision with root package name */
    Handler f7215b;

    /* renamed from: c  reason: collision with root package name */
    HandlerThread f7216c;

    /* renamed from: d  reason: collision with root package name */
    int f7217d;

    /* renamed from: e  reason: collision with root package name */
    final Object f7218e = new Object();

    static {
        Covode.recordClassIndex(3465);
    }

    f() {
    }

    private void a() {
        MethodCollector.i(3395);
        synchronized (this.f7218e) {
            try {
                if (this.f7215b == null) {
                    if (this.f7217d > 0) {
                        HandlerThread handlerThread = new HandlerThread("CameraThread");
                        this.f7216c = handlerThread;
                        handlerThread.start();
                        this.f7215b = new Handler(this.f7216c.getLooper());
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("CameraThread is not open");
                        MethodCollector.o(3395);
                        throw illegalStateException;
                    }
                }
            } finally {
                MethodCollector.o(3395);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Runnable runnable) {
        MethodCollector.i(3383);
        synchronized (this.f7218e) {
            try {
                a();
                this.f7215b.post(runnable);
            } finally {
                MethodCollector.o(3383);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Runnable runnable) {
        MethodCollector.i(3396);
        synchronized (this.f7218e) {
            try {
                this.f7217d++;
                a(runnable);
            } finally {
                MethodCollector.o(3396);
            }
        }
    }
}
