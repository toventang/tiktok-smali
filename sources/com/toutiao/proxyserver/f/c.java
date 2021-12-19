package com.toutiao.proxyserver.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.f.a;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final g f154839b = new f();

    /* renamed from: c  reason: collision with root package name */
    public static long f154840c = 1000;

    /* renamed from: i  reason: collision with root package name */
    private static long f154841i = -1;

    /* renamed from: a  reason: collision with root package name */
    public g f154842a;

    /* renamed from: d  reason: collision with root package name */
    private final a f154843d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicInteger f154844e;

    /* renamed from: f  reason: collision with root package name */
    private b f154845f;

    /* renamed from: g  reason: collision with root package name */
    private HandlerThread f154846g;

    /* renamed from: h  reason: collision with root package name */
    private long f154847h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f154848a = new c(a.C4114a.f154837a, (byte) 0);

        static {
            Covode.recordClassIndex(103131);
        }
    }

    static {
        Covode.recordClassIndex(103130);
    }

    public final void a() {
        if (this.f154844e.getAndIncrement() == 0) {
            this.f154845f.sendEmptyMessage(1);
            this.f154847h = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.f154844e.decrementAndGet() == 0) {
            this.f154845f.removeMessages(1);
            c();
            f154841i = -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        MethodCollector.i(9726);
        g gVar = this.f154842a;
        if (gVar == null) {
            MethodCollector.o(9726);
            return;
        }
        long a2 = gVar.a();
        long j2 = f154841i;
        long j3 = a2 - j2;
        if (j2 >= 0) {
            synchronized (this) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f154843d.a(j3, elapsedRealtime - this.f154847h);
                    this.f154847h = elapsedRealtime;
                } catch (Throwable th) {
                    MethodCollector.o(9726);
                    throw th;
                }
            }
        }
        f154841i = a2;
        MethodCollector.o(9726);
    }

    class b extends Handler {
        static {
            Covode.recordClassIndex(103132);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                c.this.c();
                sendEmptyMessageDelayed(1, c.f154840c);
                return;
            }
            throw new IllegalArgumentException("Unknown what=" + message.what);
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    private c(a aVar) {
        this.f154842a = f154839b;
        this.f154843d = aVar;
        this.f154844e = new AtomicInteger();
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        this.f154846g = handlerThread;
        handlerThread.start();
        this.f154845f = new b(this.f154846g.getLooper());
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
