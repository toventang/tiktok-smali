package leakcanary.internal;

import android.app.Application;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.w;
import h.z;
import java.io.File;
import java.lang.reflect.Field;
import leakcanary.a;
import leakcanary.e;
import m.a;

public final class f {

    /* renamed from: l  reason: collision with root package name */
    public static final a f159424l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f159425a = 300000;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f159426b;

    /* renamed from: c  reason: collision with root package name */
    public int f159427c;

    /* renamed from: d  reason: collision with root package name */
    public FileObserver f159428d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.a<z> f159429e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    volatile long f159430f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final Application f159431g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f159432h;

    /* renamed from: i  reason: collision with root package name */
    public final leakcanary.g f159433i;

    /* renamed from: j  reason: collision with root package name */
    public final leakcanary.c f159434j;

    /* renamed from: k  reason: collision with root package name */
    public final h f159435k;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.a<z> f159436m = new C4199f(this);
    private final h.f.a.a<e.a> n;

    static {
        Covode.recordClassIndex(105848);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105849);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(105855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.e();
            return z.f158842a;
        }
    }

    /* renamed from: leakcanary.internal.f$f  reason: collision with other inner class name */
    static final class C4199f extends m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(105856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4199f(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.d();
            return z.f158842a;
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f159449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f159450b;

        static {
            Covode.recordClassIndex(105857);
        }

        g(f fVar, String str) {
            this.f159449a = fVar;
            this.f159450b = str;
        }

        public final void run() {
            this.f159449a.f159426b = false;
            this.f159449a.a(this.f159450b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f159451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f159452b;

        static {
            Covode.recordClassIndex(105858);
        }

        h(f fVar, String str) {
            this.f159451a = fVar;
            this.f159452b = str;
        }

        public final void run() {
            this.f159451a.f159426b = false;
            this.f159451a.a(this.f159452b);
        }
    }

    public final void b() {
        this.f159432h.postDelayed(new d(this), this.f159425a);
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f159448a;

        static {
            Covode.recordClassIndex(105854);
        }

        d(f fVar) {
            this.f159448a = fVar;
        }

        public final void run() {
            if (!leakcanary.d.f159366a) {
                leakcanary.a.a(a.C4197a.a(leakcanary.a.f159358a, true, false, false, false, 0, 30));
            } else {
                this.f159448a.b();
            }
        }
    }

    public final NotificationManager a() {
        Object a2 = a(this.f159431g, "notification");
        if (a2 != null) {
            return (NotificationManager) a2;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final void c() {
        a.AbstractC4200a aVar = m.a.f159491a;
        if (aVar != null) {
            aVar.a("Failed to dump heap, will retry in 5000 ms");
        }
        a("failed to dump heap", 5000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [leakcanary.internal.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            android.os.Handler r2 = r3.f159432h
            h.f.a.a<h.z> r1 = r3.f159436m
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.g r0 = new leakcanary.internal.g
            r0.<init>(r1)
            r1 = r0
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            android.app.NotificationManager r1 = r3.a()
            r0 = -101110101(0xfffffffff9f92eab, float:-1.6172856E35)
            r1.cancel(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.f.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [leakcanary.internal.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r3 = this;
            android.os.Handler r2 = r3.f159432h
            h.f.a.a<h.z> r1 = r3.f159429e
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.g r0 = new leakcanary.internal.g
            r0.<init>(r1)
            r1 = r0
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.removeCallbacks(r1)
            android.app.NotificationManager r1 = r3.a()
            r0 = -1000111(0xfffffffffff0bd51, float:NaN)
            r1.cancel(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.f.e():void");
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f159441a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f159442b = true;

        static {
            Covode.recordClassIndex(105851);
        }

        c(f fVar) {
            this.f159441a = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v34, types: [leakcanary.internal.g] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 426
            */
            throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.f.c.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [leakcanary.internal.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if ((android.os.SystemClock.uptimeMillis() - r0) < leakcanary.a.f159358a.f159364e) goto L_0x0073;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.f.a(java.lang.String):void");
    }

    public static final class b extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f159437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f159438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f159439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f159440d;

        static {
            Covode.recordClassIndex(105850);
        }

        public final void onEvent(int i2, String str) {
            if (i2 != 8) {
                return;
            }
            if (this.f159438b == null) {
                this.f159437a.c();
                return;
            }
            a.AbstractC4200a aVar = m.a.f159491a;
            if (aVar != null) {
                aVar.a("HeapAnalyzerService.runAnalysis");
            }
            leakcanary.d.a(this.f159437a.f159431g, this.f159438b);
            this.f159437a.b();
            stopWatching();
            this.f159440d.b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, File file, z.c cVar, i iVar, String str) {
            super(str, 4095);
            this.f159437a = fVar;
            this.f159438b = file;
            this.f159439c = cVar;
            this.f159440d = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, long j2) {
        if (this.f159426b) {
            a.AbstractC4200a aVar = m.a.f159491a;
            if (aVar != null) {
                aVar.a("Already scheduled retained check, ignoring (" + str + ')');
                return;
            }
            return;
        }
        this.f159426b = true;
        this.f159432h.postDelayed(new h(this, str), j2);
    }

    private static Object a(Application application, String str) {
        Object obj;
        MethodCollector.i(12821);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(12821);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    public f(Application application, Handler handler, leakcanary.g gVar, leakcanary.c cVar, h hVar, h.f.a.a<e.a> aVar) {
        l.c(application, "");
        l.c(handler, "");
        l.c(gVar, "");
        l.c(cVar, "");
        l.c(hVar, "");
        l.c(aVar, "");
        this.f159431g = application;
        this.f159432h = handler;
        this.f159433i = gVar;
        this.f159434j = cVar;
        this.f159435k = hVar;
        this.n = aVar;
    }
}
