package com.bytedance.android.livesdk.ab;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.g;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13579a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile g.c f13580b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f13581c;

    /* renamed from: d  reason: collision with root package name */
    private static final g.c f13582d = new g.c() {
        /* class com.bytedance.android.livesdk.ab.h.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7522);
        }

        @Override // com.bytedance.android.livesdk.ab.g.c
        public final void a() {
            a.a(6, h.f13579a, "Task count exceeded, rejection triggered. ");
            if (h.f13580b != null) {
                h.f13580b.a();
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static volatile h f13583e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13584f;

    /* renamed from: g  reason: collision with root package name */
    private Executor f13585g;

    /* renamed from: h  reason: collision with root package name */
    private Handler f13586h;

    private h() {
    }

    private synchronized void b() {
        MethodCollector.i(3593);
        c();
        MethodCollector.o(3593);
    }

    private synchronized void c() {
        MethodCollector.i(3594);
        a(f13581c);
        MethodCollector.o(3594);
    }

    static {
        Covode.recordClassIndex(7521);
        String simpleName = h.class.getSimpleName();
        f13579a = simpleName;
        f13581c = simpleName + "-Thread";
    }

    public static h a() {
        MethodCollector.i(3589);
        if (f13583e == null) {
            synchronized (h.class) {
                try {
                    if (f13583e == null) {
                        h hVar = new h();
                        f13583e = hVar;
                        hVar.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3589);
                    throw th;
                }
            }
        }
        h hVar2 = f13583e;
        MethodCollector.o(3589);
        return hVar2;
    }

    private static void a(h hVar) {
        if (!hVar.f13584f) {
            throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
        }
    }

    private synchronized void a(String str) {
        MethodCollector.i(3595);
        a(64, str, f13582d);
        MethodCollector.o(3595);
    }

    private synchronized void a(Executor executor) {
        MethodCollector.i(3592);
        this.f13585g = executor;
        this.f13586h = new Handler(Looper.getMainLooper());
        this.f13584f = true;
        MethodCollector.o(3592);
    }

    public final synchronized void a(g.c cVar) {
        MethodCollector.i(3599);
        f13580b = cVar;
        MethodCollector.o(3599);
    }

    public final void a(Runnable runnable) {
        a(this);
        Handler handler = this.f13586h;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public final void a(final Callable callable) {
        a(this);
        this.f13585g.execute(new Runnable() {
            /* class com.bytedance.android.livesdk.ab.h.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Handler f13587a = null;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f13589c;

            static {
                Covode.recordClassIndex(7523);
            }

            public final void run() {
                Handler handler = this.f13587a;
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception e2) {
                        a.a(6, h.f13579a, e2.getMessage());
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(this.f13589c);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e3) {
                        obtainMessage.obj = e3;
                    }
                    this.f13587a.sendMessage(obtainMessage);
                }
            }

            {
                this.f13589c = 0;
            }
        });
    }

    private synchronized void a(int i2, String str, g.c cVar) {
        MethodCollector.i(3598);
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            a(com.ss.android.ugc.aweme.cw.g.a());
            MethodCollector.o(3598);
            return;
        }
        g.a aVar = new g.a();
        aVar.f13572a = 64;
        aVar.f13574c = str;
        aVar.f13573b = cVar;
        a(new g(aVar.f13572a, new g.d(aVar.f13574c, (byte) 0), aVar.f13573b, (byte) 0));
        MethodCollector.o(3598);
    }
}
