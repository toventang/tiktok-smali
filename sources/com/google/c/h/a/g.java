package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f54225c = Logger.getLogger(g.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public a f54226a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54227b;

    static {
        Covode.recordClassIndex(33643);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r1.f54230c;
        r1.f54230c = r2;
        r2 = r1;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        a(r2.f54228a, r2.f54229b);
        r2 = r2.f54230c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(1993);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            r3 = 1993(0x7c9, float:2.793E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            monitor-enter(r4)
            boolean r0 = r4.f54227b     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x000f:
            r0 = 1
            r4.f54227b = r0
            com.google.c.h.a.g$a r1 = r4.f54226a
            r2 = 0
            r4.f54226a = r2
            monitor-exit(r4)
        L_0x0018:
            if (r1 == 0) goto L_0x0021
            com.google.c.h.a.g$a r0 = r1.f54230c
            r1.f54230c = r2
            r2 = r1
            r1 = r0
            goto L_0x0018
        L_0x0021:
            if (r2 == 0) goto L_0x002d
            java.lang.Runnable r1 = r2.f54228a
            java.util.concurrent.Executor r0 = r2.f54229b
            a(r1, r0)
            com.google.c.h.a.g$a r2 = r2.f54230c
            goto L_0x0021
        L_0x002d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.h.a.g.a():void");
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f54225c.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f54228a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f54229b;

        /* renamed from: c  reason: collision with root package name */
        a f54230c;

        static {
            Covode.recordClassIndex(33644);
        }

        public a(Runnable runnable, Executor executor, a aVar) {
            this.f54228a = runnable;
            this.f54229b = executor;
            this.f54230c = aVar;
        }
    }
}
