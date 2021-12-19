package com.facebook.imagepipeline.n;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.j.e;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    final Executor f48402a;

    /* renamed from: b  reason: collision with root package name */
    final a f48403b;

    /* renamed from: c  reason: collision with root package name */
    final Runnable f48404c = new Runnable() {
        /* class com.facebook.imagepipeline.n.v.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29183);
        }

        public final void run() {
            e eVar;
            int i2;
            MethodCollector.i(13933);
            v vVar = v.this;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (vVar) {
                try {
                    eVar = vVar.f48405d;
                    i2 = vVar.f48406e;
                    vVar.f48405d = null;
                    vVar.f48406e = 0;
                    vVar.f48407f = c.RUNNING;
                    vVar.f48409h = uptimeMillis;
                } catch (Throwable th) {
                    MethodCollector.o(13933);
                    throw th;
                }
            }
            try {
                if (v.b(eVar, i2)) {
                    vVar.f48403b.a(eVar, i2);
                }
            } finally {
                e.d(eVar);
                vVar.c();
                MethodCollector.o(13933);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    e f48405d = null;

    /* renamed from: e  reason: collision with root package name */
    int f48406e = 0;

    /* renamed from: f  reason: collision with root package name */
    c f48407f = c.IDLE;

    /* renamed from: g  reason: collision with root package name */
    long f48408g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f48409h = 0;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f48410i = new Runnable() {
        /* class com.facebook.imagepipeline.n.v.AnonymousClass2 */

        static {
            Covode.recordClassIndex(29184);
        }

        public final void run() {
            v vVar = v.this;
            vVar.f48402a.execute(vVar.f48404c);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final int f48411j;

    public interface a {
        static {
            Covode.recordClassIndex(29186);
        }

        void a(e eVar, int i2);
    }

    static {
        Covode.recordClassIndex(29182);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f48415a;

        static {
            Covode.recordClassIndex(29187);
        }

        static ScheduledExecutorService a() {
            if (f48415a == null) {
                f48415a = b();
            }
            return f48415a;
        }

        private static ScheduledExecutorService b() {
            l.a a2 = l.a(o.SCHEDULED);
            a2.f79174c = 1;
            return (ScheduledExecutorService) g.a(a2.a());
        }
    }

    public final synchronized long d() {
        long j2;
        MethodCollector.i(13985);
        j2 = this.f48409h - this.f48408g;
        MethodCollector.o(13985);
        return j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.v$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48414a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 29185(0x7201, float:4.0897E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.n.v$c[] r0 = com.facebook.imagepipeline.n.v.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.n.v.AnonymousClass3.f48414a = r2
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.IDLE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.n.v.AnonymousClass3.f48414a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.QUEUED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.n.v.AnonymousClass3.f48414a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.RUNNING     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.n.v.AnonymousClass3.f48414a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.v.AnonymousClass3.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public enum c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING;

        static {
            Covode.recordClassIndex(29188);
        }
    }

    public final void a() {
        e eVar;
        MethodCollector.i(13782);
        synchronized (this) {
            try {
                eVar = this.f48405d;
                this.f48405d = null;
                this.f48406e = 0;
            } catch (Throwable th) {
                MethodCollector.o(13782);
                throw th;
            }
        }
        e.d(eVar);
        MethodCollector.o(13782);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        long j2;
        boolean z;
        MethodCollector.i(13984);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f48407f == c.RUNNING_AND_PENDING) {
                    j2 = Math.max(this.f48409h + ((long) this.f48411j), uptimeMillis);
                    z = true;
                    this.f48408g = uptimeMillis;
                    this.f48407f = c.QUEUED;
                } else {
                    this.f48407f = c.IDLE;
                    j2 = 0;
                    z = false;
                }
            } finally {
                MethodCollector.o(13984);
            }
        }
        if (z) {
            a(j2 - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r7 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        a(r4 - r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13934);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r9 = this;
            r8 = 13934(0x366e, float:1.9526E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r9)
            com.facebook.imagepipeline.j.e r1 = r9.f48405d     // Catch:{ all -> 0x004e }
            int r0 = r9.f48406e     // Catch:{ all -> 0x004e }
            boolean r0 = b(r1, r0)     // Catch:{ all -> 0x004e }
            r7 = 0
            if (r0 != 0) goto L_0x001a
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r7
        L_0x001a:
            int[] r1 = com.facebook.imagepipeline.n.v.AnonymousClass3.f48414a
            com.facebook.imagepipeline.n.v$c r0 = r9.f48407f
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r6 = 1
            if (r1 == r6) goto L_0x0032
            r0 = 3
            if (r1 == r0) goto L_0x002d
        L_0x002a:
            r4 = 0
            goto L_0x0043
        L_0x002d:
            com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.RUNNING_AND_PENDING
            r9.f48407f = r0
            goto L_0x002a
        L_0x0032:
            long r4 = r9.f48409h
            int r0 = r9.f48411j
            long r0 = (long) r0
            long r4 = r4 + r0
            long r4 = java.lang.Math.max(r4, r2)
            r9.f48408g = r2
            com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.n.v.c.QUEUED
            r9.f48407f = r0
            r7 = 1
        L_0x0043:
            monitor-exit(r9)
            if (r7 == 0) goto L_0x004a
            long r4 = r4 - r2
            r9.a(r4)
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            return r6
        L_0x004e:
            r0 = move-exception
            monitor-exit(r9)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.v.b():boolean");
    }

    private void a(long j2) {
        if (j2 > 0) {
            b.a().schedule(this.f48410i, j2, TimeUnit.MILLISECONDS);
        } else {
            this.f48410i.run();
        }
    }

    static boolean b(e eVar, int i2) {
        if (b.a(i2) || b.a(i2, 4) || e.e(eVar)) {
            return true;
        }
        return false;
    }

    public final boolean a(e eVar, int i2) {
        e eVar2;
        MethodCollector.i(13829);
        if (!b(eVar, i2)) {
            MethodCollector.o(13829);
            return false;
        }
        synchronized (this) {
            try {
                eVar2 = this.f48405d;
                this.f48405d = e.a(eVar);
                this.f48406e = i2;
            } catch (Throwable th) {
                MethodCollector.o(13829);
                throw th;
            }
        }
        e.d(eVar2);
        MethodCollector.o(13829);
        return true;
    }

    public v(Executor executor, a aVar, int i2) {
        this.f48402a = executor;
        this.f48403b = aVar;
        this.f48411j = i2;
    }
}
