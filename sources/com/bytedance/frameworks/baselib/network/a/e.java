package com.bytedance.frameworks.baselib.network.a;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.platform.b.d;
import java.util.concurrent.atomic.AtomicInteger;

public class e {

    /* renamed from: g  reason: collision with root package name */
    private static long f28837g = -1;

    /* renamed from: a  reason: collision with root package name */
    private final c f28838a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f28839b;

    /* renamed from: c  reason: collision with root package name */
    private b f28840c;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f28841d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f28842e;

    /* renamed from: f  reason: collision with root package name */
    private long f28843f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f28844a = new e(c.a.f28835a);

        static {
            Covode.recordClassIndex(16955);
        }
    }

    static {
        Covode.recordClassIndex(16954);
    }

    public final void a() {
        try {
            if (!this.f28842e && this.f28839b.getAndIncrement() == 0) {
                Logger.debug();
                this.f28840c.sendEmptyMessage(1);
                this.f28843f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        try {
            if (!this.f28842e && this.f28839b.decrementAndGet() == 0) {
                Logger.debug();
                this.f28840c.removeMessages(1);
                c();
                f28837g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        MethodCollector.i(2387);
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j2 = f28837g;
            long j3 = totalRxBytes - j2;
            if (j2 >= 0) {
                synchronized (this) {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        this.f28838a.a(j3, elapsedRealtime - this.f28843f);
                        this.f28843f = elapsedRealtime;
                    } catch (Throwable th) {
                        MethodCollector.o(2387);
                        throw th;
                    }
                }
            }
            f28837g = totalRxBytes;
            MethodCollector.o(2387);
        } catch (Throwable unused) {
            MethodCollector.o(2387);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends Handler {
        static {
            Covode.recordClassIndex(16956);
        }

        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    e.this.c();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable unused) {
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    protected e(c cVar) {
        this.f28838a = cVar;
        try {
            this.f28839b = new AtomicInteger();
            HandlerThread a2 = d.a("ParseThread");
            this.f28841d = a2;
            a2.start();
            this.f28840c = new b(this.f28841d.getLooper());
        } catch (Throwable unused) {
            this.f28842e = true;
        }
    }
}
