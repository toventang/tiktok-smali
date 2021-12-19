package com.bytedance.platform.a.b.a;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.a.a.a;
import com.bytedance.platform.a.a.g;
import com.bytedance.platform.a.b;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

public class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    private static c f41837h;

    /* renamed from: a  reason: collision with root package name */
    public Application f41838a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f41839b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f41840c;

    /* renamed from: d  reason: collision with root package name */
    public b f41841d;

    /* renamed from: e  reason: collision with root package name */
    public String f41842e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41843f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f41844g;

    /* renamed from: i  reason: collision with root package name */
    private MessageQueue f41845i;

    /* renamed from: j  reason: collision with root package name */
    private Field f41846j;

    /* renamed from: k  reason: collision with root package name */
    private Field f41847k;

    static {
        Covode.recordClassIndex(25577);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(5484);
        if (f41837h == null) {
            synchronized (c.class) {
                try {
                    if (f41837h == null) {
                        f41837h = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5484);
                    throw th;
                }
            }
        }
        c cVar = f41837h;
        MethodCollector.o(5484);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[Catch:{ all -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.a.b.a.c.run():void");
    }

    public final void a(Application application, String str, b bVar, boolean z) {
        if (!this.f41840c) {
            this.f41842e = str;
            this.f41841d = bVar;
            this.f41840c = true;
            this.f41838a = application;
            this.f41843f = z;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            d dVar = d.f41852a;
            try {
                if (!dVar.f41855d) {
                    Handler handler = (Handler) a.b();
                    Field a2 = com.bytedance.platform.a.a.b.a(Handler.class, "mCallback");
                    dVar.f41854c = (Handler.Callback) a2.get(handler);
                    a2.set(handler, dVar);
                    dVar.f41855d = true;
                }
            } catch (Throwable unused) {
            }
            this.f41844g = handlerThread.getLooper();
            this.f41839b = new b(this.f41844g);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f41839b.post(new Runnable() {
                /* class com.bytedance.platform.a.b.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25578);
                }

                public final void run() {
                    try {
                        g.a(g.a.ERROR);
                        countDownLatch.await();
                        g.a(g.a.ERROR);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            });
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() {
                /* class com.bytedance.platform.a.b.a.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(25579);
                }

                public final void run() {
                    countDownLatch.countDown();
                    g.a(g.a.ERROR);
                }
            });
            this.f41839b.postDelayed(this, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }
}
