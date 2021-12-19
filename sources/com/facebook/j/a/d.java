package com.facebook.j.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.j.a.b;
import java.util.concurrent.atomic.AtomicInteger;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f48733a;

    /* renamed from: b  reason: collision with root package name */
    public long f48734b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicInteger f48735c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f48736d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f48737e;

    static {
        Covode.recordClassIndex(29377);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f48738a = new d(b.a.f48731a, (byte) 0);

        static {
            Covode.recordClassIndex(29378);
        }
    }

    public final void b() {
        if (this.f48735c.decrementAndGet() == 0) {
            this.f48736d.sendEmptyMessage(2);
        }
    }

    public final void a() {
        if (this.f48735c.getAndIncrement() == 0) {
            this.f48736d.sendEmptyMessage(1);
            this.f48734b = SystemClock.elapsedRealtime();
        }
    }

    class b extends Handler {
        static {
            Covode.recordClassIndex(29379);
        }

        private void a() {
            MethodCollector.i(1680);
            long a2 = g.a().a(Process.myUid());
            synchronized (this) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (a2 != -1) {
                        d.this.f48733a.a(a2, elapsedRealtime - d.this.f48734b);
                    }
                    d.this.f48734b = elapsedRealtime;
                } finally {
                    MethodCollector.o(1680);
                }
            }
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                a();
                sendEmptyMessageDelayed(1, 1000);
            } else if (i2 == 2) {
                a();
                removeMessages(1);
            } else {
                throw new IllegalArgumentException("Unknown what=" + message.what);
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    private d(b bVar) {
        this.f48733a = bVar;
        this.f48735c = new AtomicInteger();
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        this.f48737e = handlerThread;
        handlerThread.start();
        this.f48736d = new b(this.f48737e.getLooper());
    }

    /* synthetic */ d(b bVar, byte b2) {
        this(bVar);
    }
}
