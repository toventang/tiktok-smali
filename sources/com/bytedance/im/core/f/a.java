package com.bytedance.im.core.f;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.GetConversationsCheckInfoRequestBody;
import com.bytedance.im.core.proto.RequestBody;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38058a;

    /* renamed from: e  reason: collision with root package name */
    public static int f38059e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static volatile a f38060f;

    /* renamed from: b  reason: collision with root package name */
    public Handler f38061b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f38062c;

    /* renamed from: d  reason: collision with root package name */
    public long f38063d;

    static {
        Covode.recordClassIndex(22807);
    }

    private void g() {
        this.f38061b.postDelayed(new Runnable() {
            /* class com.bytedance.im.core.f.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22809);
            }

            public final void run() {
                int[] a2 = e.a();
                for (int i2 : a2) {
                    new com.bytedance.im.core.f.a.a().a(i2, new RequestBody.Builder().get_conversations_checkinfo_body(new GetConversationsCheckInfoRequestBody.Builder().build()).build(), null, new Object[0]);
                }
            }
        }, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    public final long b() {
        long j2 = this.f38063d;
        if (j2 > 0) {
            return j2;
        }
        return com.bytedance.im.core.internal.a.c();
    }

    private a() {
        HandlerThread handlerThread = new HandlerThread("RepairManager-Thread");
        handlerThread.start();
        this.f38061b = new Handler(handlerThread.getLooper());
        f38058a = true;
    }

    private static void f() {
        if (d.a().f37564d && com.bytedance.im.core.internal.a.a()) {
            f38059e = 8;
            a().c();
        }
    }

    public final void c() {
        if (this.f38062c == null) {
            AnonymousClass1 r5 = new Runnable() {
                /* class com.bytedance.im.core.f.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22808);
                }

                public final void run() {
                    int[] a2 = e.a();
                    if (a2 != null) {
                        for (int i2 : a2) {
                            x.a();
                            x.b(i2, a.f38059e);
                        }
                        a.this.f38061b.postDelayed(a.this.f38062c, a.this.b() * 1000);
                    }
                }
            };
            this.f38062c = r5;
            this.f38061b.postDelayed(r5, b() * 1000);
        }
    }

    public final void d() {
        Runnable runnable = this.f38062c;
        if (runnable != null) {
            this.f38061b.removeCallbacks(runnable);
            this.f38062c = null;
            this.f38063d = 0;
        }
    }

    public static a a() {
        MethodCollector.i(9755);
        if (f38060f == null) {
            synchronized (a.class) {
                try {
                    if (f38060f == null) {
                        f38060f = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9755);
                    throw th;
                }
            }
        }
        a aVar = f38060f;
        MethodCollector.o(9755);
        return aVar;
    }

    public static void e() {
        f();
        if (com.bytedance.im.core.internal.a.d()) {
            long currentTimeMillis = System.currentTimeMillis();
            s.a();
            if (currentTimeMillis - s.g() > com.bytedance.im.core.internal.a.e()) {
                s.a();
                s.b(currentTimeMillis);
                a().g();
            }
        }
    }
}
