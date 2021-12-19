package com.bytedance.android.live.u;

import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.android.live.core.f.j;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Method;

public class b {
    private static volatile b s;

    /* renamed from: a  reason: collision with root package name */
    final a f12803a = new a();

    /* renamed from: b  reason: collision with root package name */
    Method f12804b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f12805c = false;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f12806d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f12807e = 0;

    /* renamed from: f  reason: collision with root package name */
    volatile long f12808f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f12809g = 10;

    /* renamed from: h  reason: collision with root package name */
    long f12810h = 0;

    /* renamed from: i  reason: collision with root package name */
    long f12811i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f12812j = 2000000000;

    /* renamed from: k  reason: collision with root package name */
    volatile int f12813k = -1;

    /* renamed from: l  reason: collision with root package name */
    public volatile long f12814l = -1;

    /* renamed from: m  reason: collision with root package name */
    public volatile long f12815m = -1;
    public volatile boolean n = false;
    public final Choreographer.FrameCallback o = new Choreographer.FrameCallback() {
        /* class com.bytedance.android.live.u.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7126);
        }

        public final void doFrame(long j2) {
            b bVar = b.this;
            if (bVar.f12809g > 0 && bVar.f12806d > 0) {
                long j3 = j2 - bVar.f12806d;
                if (j3 > 0) {
                    if (bVar.f12810h < bVar.f12809g) {
                        bVar.f12810h++;
                    }
                    bVar.f12811i = ((bVar.f12811i * (bVar.f12810h - 1)) + j3) / bVar.f12810h;
                    bVar.f12807e = bVar.f12808f + bVar.f12811i;
                }
            }
            bVar.f12806d = j2;
            if (bVar.a(bVar.f12813k)) {
                bVar.f12813k = -1;
            }
            if (b.this.f12805c) {
                Choreographer.getInstance().postFrameCallback(b.this.o);
            }
        }
    };
    public final Runnable p = new c(this);
    final Runnable q = new d(this);
    public final Runnable r = new e(this);
    private MessageQueue t;
    private Method u;
    private Object v;
    private a w;
    private double x = 1.0d;

    static {
        Covode.recordClassIndex(7125);
    }

    static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_android_live_watchdog_FWatchDog_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_android_live_watchdog_FWatchDog_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f12809g = 0;
    }

    private void h() {
        try {
            a aVar = this.w;
            if (aVar != null) {
                aVar.f12817a = true;
                this.w.interrupt();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static b a() {
        MethodCollector.i(11015);
        if (s == null) {
            synchronized (b.class) {
                try {
                    if (s == null) {
                        s = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11015);
                    throw th;
                }
            }
        }
        b bVar = s;
        MethodCollector.o(11015);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        return r1.getBoolean(android.view.Choreographer.getInstance());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r2 = r5.f12803a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r2.f12797c == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r2.f12797c = r2.a(android.view.Choreographer.class, "USE_VSYNC", java.lang.Boolean.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = r2.f12797c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i() {
        /*
            r5 = this;
            java.lang.String r4 = "USE_VSYNC"
            r3 = 0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ Exception -> 0x001c }
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on(r0)     // Catch:{ Exception -> 0x001c }
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x001c }
            com.bytedance.common.utility.reflect.Reflect r0 = r1.field(r4, r0)     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x001c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x001c }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x001c }
            return r0
        L_0x001c:
            com.bytedance.android.live.u.a r2 = r5.f12803a     // Catch:{ Exception -> 0x0039 }
            java.lang.reflect.Field r0 = r2.f12797c     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x002c
            java.lang.Class<android.view.Choreographer> r1 = android.view.Choreographer.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.reflect.Field r0 = r2.a(r1, r4, r0)     // Catch:{ Exception -> 0x0039 }
            r2.f12797c = r0     // Catch:{ Exception -> 0x0039 }
        L_0x002c:
            java.lang.reflect.Field r1 = r2.f12797c     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x003d
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ Exception -> 0x0039 }
            boolean r0 = r1.getBoolean(r0)     // Catch:{ Exception -> 0x0039 }
            return r0
        L_0x0039:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.u.b.i():boolean");
    }

    private Object j() {
        if (this.v == null) {
            try {
                this.v = Reflect.on(Choreographer.getInstance()).field("mDisplayEventReceiver", new Class[0]).get();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.v;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r5.f12803a.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r0.getBoolean(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r5 = this;
            r4 = 0
            java.lang.Object r3 = r5.j()     // Catch:{ Exception -> 0x001e }
            if (r3 == 0) goto L_0x0032
            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r3)     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = "mHavePendingVsync"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x001f }
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch:{ Exception -> 0x001f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x001f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x001f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x001f }
            return r0
        L_0x001e:
            r3 = 0
        L_0x001f:
            com.bytedance.android.live.u.a r0 = r5.f12803a     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Field r0 = r0.a()     // Catch:{ Exception -> 0x002e }
            if (r0 == 0) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            boolean r0 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0032:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.u.b.e():boolean");
    }

    /* access modifiers changed from: package-private */
    public final MessageQueue g() {
        if (this.t == null) {
            try {
                this.t = (MessageQueue) Reflect.on(Looper.getMainLooper()).field("mQueue", new Class[0]).get();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.t;
    }

    private b() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i2 = Build.VERSION.SDK_INT;
        if (p.b() && i() && !this.f12805c) {
            this.f12805c = true;
            if (i.f12837d < 0) {
                i.f12837d = (long) Math.ceil((double) (i.a() * 1000000.0f));
            }
            double d2 = (double) i.f12837d;
            double d3 = this.x;
            Double.isNaN(d2);
            this.f12808f = (long) (d2 * d3);
            this.f12807e = this.f12808f + this.f12811i;
            Choreographer.getInstance().removeFrameCallback(this.o);
            Choreographer.getInstance().postFrameCallback(this.o);
            if (this.w != null) {
                h();
            } else {
                this.w = new a("FWatchDogWorkThread", this.x);
            }
            this.w.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (p.b() && this.f12805c) {
            this.f12805c = false;
            h();
            Choreographer.getInstance().removeFrameCallback(this.o);
            j.a().removeCallbacks(this.p);
            j.a().removeCallbacks(this.q);
            j.a().removeCallbacks(this.r);
            a(this.f12813k);
            f();
            this.f12806d = -1;
            this.f12811i = 0;
            this.f12810h = 0;
            this.f12809g = 10;
            this.f12814l = -1;
            this.f12813k = -1;
            this.f12815m = -1;
            this.n = false;
            this.w = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        try {
            MessageQueue g2 = g();
            if (g2 != null) {
                Message message = (Message) Reflect.on(g2).field("mMessages", new Class[0]).get();
                while (message != null && message.getWhen() <= 1) {
                    if (message.getTarget() == null) {
                        a(message.arg1);
                    }
                    message = (Message) Reflect.on(message).field("next", new Class[0]).get();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        volatile boolean f12817a;

        /* renamed from: c  reason: collision with root package name */
        private final double f12819c;

        /* renamed from: d  reason: collision with root package name */
        private long f12820d;

        static {
            Covode.recordClassIndex(7127);
        }

        public final void run() {
            while (!this.f12817a) {
                try {
                    sleep(this.f12820d);
                    if (!Debug.isDebuggerConnected()) {
                        long nanoTime = System.nanoTime();
                        if (b.this.f12815m > 0 && b.this.f12812j > 0 && nanoTime - b.this.f12815m > b.this.f12812j && !b.this.n) {
                            b.this.n = true;
                            j.a().sendMessageAtFrontOfQueue(Message.obtain(j.a(), b.this.r));
                        }
                    }
                    long nanoTime2 = System.nanoTime();
                    if (b.this.f12806d >= 0 && nanoTime2 - b.this.f12806d > b.this.f12807e && b.this.f12806d != b.this.f12814l) {
                        b bVar = b.this;
                        bVar.f12814l = bVar.f12806d;
                        j.a().postAtFrontOfQueue(b.this.p);
                    }
                } catch (Exception unused) {
                    this.f12817a = true;
                }
            }
        }

        public a(String str, double d2) {
            super(str);
            this.f12819c = d2;
            if (i.f12838e < 0) {
                i.f12838e = (long) Math.ceil((double) i.a());
            }
            double d3 = (double) i.f12838e;
            Double.isNaN(d3);
            this.f12820d = (long) (d3 * d2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|(1:15)|16|(2:19|20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = r8.f12803a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r3.f12796b == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r3.f12796b = r3.a(android.os.MessageQueue.class, "removeSyncBarrier", java.lang.Integer.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r2 = r3.f12796b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        a(r2, null, new java.lang.Object[]{java.lang.Integer.valueOf(r9)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r9) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.u.b.a(int):boolean");
    }
}
