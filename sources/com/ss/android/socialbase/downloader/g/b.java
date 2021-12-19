package com.ss.android.socialbase.downloader.g;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.g.k;
import com.ss.android.socialbase.downloader.j.e;
import com.ss.android.socialbase.downloader.k.g;
import java.util.concurrent.atomic.AtomicInteger;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60520a = b.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f60521d;

    /* renamed from: g  reason: collision with root package name */
    private static long f60522g = -1;

    /* renamed from: h  reason: collision with root package name */
    private static volatile b f60523h = null;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f60524b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public final a f60525c = new a(e.a.f60727a);

    /* renamed from: e  reason: collision with root package name */
    public long f60526e;

    /* renamed from: f  reason: collision with root package name */
    private final k f60527f = k.a.f60555a;

    public static void c() {
        f60521d = g.a(c.B());
    }

    static {
        Covode.recordClassIndex(37397);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(13560);
        if (f60523h == null) {
            synchronized (b.class) {
                try {
                    if (f60523h == null) {
                        f60523h = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13560);
                    throw th;
                }
            }
        }
        b bVar = f60523h;
        MethodCollector.o(13560);
        return bVar;
    }

    public final void b() {
        try {
            com.ss.android.socialbase.downloader.e.a.c(f60520a, "stopSampling: mSamplingCounter = " + this.f60524b);
            if (this.f60524b.decrementAndGet() == 0) {
                this.f60525c.removeMessages(1);
                d();
                f60522g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        long mobileRxBytes;
        MethodCollector.i(13562);
        try {
            c();
            if (f60521d) {
                mobileRxBytes = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
            } else {
                mobileRxBytes = TrafficStats.getMobileRxBytes();
            }
            long j2 = f60522g;
            long j3 = mobileRxBytes - j2;
            if (j2 >= 0) {
                synchronized (this) {
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f60527f.a(j3, uptimeMillis - this.f60526e);
                        this.f60526e = uptimeMillis;
                    } catch (Throwable th) {
                        MethodCollector.o(13562);
                        throw th;
                    }
                }
            }
            f60522g = mobileRxBytes;
            MethodCollector.o(13562);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(13562);
        }
    }

    public class a extends Handler {
        static {
            Covode.recordClassIndex(37398);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                b.this.d();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }
}
