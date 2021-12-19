package com.bytedance.scene.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f42765a;

    /* renamed from: b  reason: collision with root package name */
    private a f42766b;

    /* renamed from: c  reason: collision with root package name */
    private Object f42767c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42768d;

    public interface a {
        static {
            Covode.recordClassIndex(26259);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(26258);
    }

    private void c() {
        MethodCollector.i(1992);
        while (this.f42768d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        MethodCollector.o(1992);
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(1979);
        synchronized (this) {
            try {
                z = this.f42765a;
            } finally {
                MethodCollector.o(1979);
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r2 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
        ((android.os.CancellationSignal) r2).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f42768d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1990);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1990);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f42768d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1990);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r4 = this;
            r3 = 1990(0x7c6, float:2.789E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            monitor-enter(r4)
            boolean r0 = r4.f42765a     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x000f:
            r0 = 1
            r4.f42765a = r0
            r4.f42768d = r0
            com.bytedance.scene.d.b$a r0 = r4.f42766b
            java.lang.Object r2 = r4.f42767c
            monitor-exit(r4)
            r1 = 0
            if (r0 == 0) goto L_0x001f
            r0.a()     // Catch:{ all -> 0x002b }
        L_0x001f:
            if (r2 == 0) goto L_0x003d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x002b }
            r0 = 16
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2     // Catch:{ all -> 0x002b }
            r2.cancel()     // Catch:{ all -> 0x002b }
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            monitor-enter(r4)
            r4.f42768d = r1     // Catch:{ all -> 0x0037 }
            r4.notifyAll()     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x003d:
            monitor-enter(r4)
            r4.f42768d = r1     // Catch:{ all -> 0x0048 }
            r4.notifyAll()     // Catch:{ all -> 0x0048 }
            monitor-exit(r4)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.d.b.a():void");
    }

    public final void a(a aVar) {
        MethodCollector.i(1991);
        synchronized (this) {
            try {
                c();
                if (this.f42766b != aVar) {
                    this.f42766b = aVar;
                    if (!this.f42765a) {
                        MethodCollector.o(1991);
                        return;
                    }
                    aVar.a();
                    MethodCollector.o(1991);
                }
            } finally {
                MethodCollector.o(1991);
            }
        }
    }
}
