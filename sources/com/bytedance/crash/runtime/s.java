package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class s {

    /* renamed from: f  reason: collision with root package name */
    private static final b<d, Runnable> f27959f = new b<d, Runnable>() {
        /* class com.bytedance.crash.runtime.s.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16360);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.crash.runtime.s.b
        public final /* synthetic */ boolean a(d dVar, Runnable runnable) {
            d dVar2 = dVar;
            if (runnable == null) {
                if (dVar2 == null || dVar2.f27970a == null || dVar2.f27970a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (dVar2 == null || dVar2.f27970a == null || !runnable.equals(dVar2.f27970a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private static final b<Message, Runnable> f27960g = new b<Message, Runnable>() {
        /* class com.bytedance.crash.runtime.s.AnonymousClass2 */

        static {
            Covode.recordClassIndex(16361);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.crash.runtime.s.b
        public final /* synthetic */ boolean a(Message message, Runnable runnable) {
            Message message2 = message;
            if (runnable == null) {
                if (message2 == null || message2.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (message2 == null || !runnable.equals(message2.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final HandlerThread f27961a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<d> f27962b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Message> f27963c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f27964d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f27965e = new Object();

    /* access modifiers changed from: package-private */
    public interface b<A, B> {
        static {
            Covode.recordClassIndex(16363);
        }

        boolean a(A a2, B b2);
    }

    static {
        Covode.recordClassIndex(16359);
    }

    class a implements Runnable {
        static {
            Covode.recordClassIndex(16362);
        }

        public final void run() {
            while (!s.this.f27963c.isEmpty()) {
                if (s.this.f27964d != null) {
                    try {
                        s.this.f27964d.sendMessageAtFrontOfQueue(s.this.f27963c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!s.this.f27962b.isEmpty()) {
                d poll = s.this.f27962b.poll();
                if (s.this.f27964d != null) {
                    try {
                        s.this.f27964d.sendMessageAtTime(poll.f27970a, poll.f27971b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }

        a() {
        }
    }

    class c extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        volatile int f27967a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f27968b;

        static {
            Covode.recordClassIndex(16364);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.bytedance.crash.b.h.a(com.bytedance.crash.m.f27724a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            if (r4.f27967a < 5) goto L_0x0035;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
            com.bytedance.crash.d.a("NPTH_CATCH", r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
            r4.f27967a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r4.f27968b == false) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
            r4.f27968b = true;
            com.bytedance.crash.d.a("NPTH_ERR_MAX", new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r4 = this;
                r3 = 8682(0x21ea, float:1.2166E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                super.onLooperPrepared()
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.s.this
                java.lang.Object r2 = r0.f27965e
                monitor-enter(r2)
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.s.this     // Catch:{ all -> 0x0051 }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0051 }
                r0.<init>()     // Catch:{ all -> 0x0051 }
                r1.f27964d = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r2)     // Catch:{ all -> 0x0051 }
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.s.this
                android.os.Handler r2 = r0.f27964d
                com.bytedance.crash.runtime.s$a r1 = new com.bytedance.crash.runtime.s$a
                com.bytedance.crash.runtime.s r0 = com.bytedance.crash.runtime.s.this
                r1.<init>()
                r2.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r3 = move-exception
                android.content.Context r0 = com.bytedance.crash.m.f27724a     // Catch:{ all -> 0x0025 }
                com.bytedance.crash.b.h.a(r0)     // Catch:{ all -> 0x0025 }
                int r1 = r4.f27967a     // Catch:{ all -> 0x0025 }
                r0 = 5
                r2 = 1
                if (r1 >= r0) goto L_0x0040
                java.lang.String r0 = "NPTH_CATCH"
                com.bytedance.crash.d.a(r0, r3)     // Catch:{ all -> 0x0025 }
            L_0x003a:
                int r0 = r4.f27967a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r2
                r4.f27967a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0040:
                boolean r0 = r4.f27968b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x003a
                r4.f27968b = r2     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r0.<init>()     // Catch:{ all -> 0x0025 }
                com.bytedance.crash.d.a(r1, r0)     // Catch:{ all -> 0x0025 }
                goto L_0x003a
            L_0x0051:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.s.c.onLooperPrepared():void");
        }

        c(String str) {
            super(str);
        }
    }

    private Message c(Runnable runnable) {
        return Message.obtain(this.f27964d, runnable);
    }

    public final boolean a(Runnable runnable) {
        return a(c(runnable), 0);
    }

    public s(String str) {
        this.f27961a = new c(str);
    }

    public final void b(Runnable runnable) {
        if (!this.f27962b.isEmpty() || !this.f27963c.isEmpty()) {
            a(this.f27962b, runnable, f27959f);
            a(this.f27963c, runnable, f27960g);
        }
        if (this.f27964d != null) {
            this.f27964d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        Message f27970a;

        /* renamed from: b  reason: collision with root package name */
        long f27971b;

        static {
            Covode.recordClassIndex(16365);
        }

        d(Message message, long j2) {
            this.f27970a = message;
            this.f27971b = j2;
        }
    }

    private boolean a(Message message, long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j2);
    }

    private boolean b(Message message, long j2) {
        MethodCollector.i(8726);
        if (this.f27964d == null) {
            synchronized (this.f27965e) {
                try {
                    if (this.f27964d == null) {
                        this.f27962b.add(new d(message, j2));
                        return true;
                    }
                } finally {
                    MethodCollector.o(8726);
                }
            }
        }
        try {
            boolean sendMessageAtTime = this.f27964d.sendMessageAtTime(message, j2);
            MethodCollector.o(8726);
            return sendMessageAtTime;
        } catch (Throwable unused) {
            MethodCollector.o(8726);
            return true;
        }
    }

    public final boolean a(Runnable runnable, long j2) {
        return a(c(runnable), j2);
    }

    private static <L, O> boolean a(Collection<L> collection, O o, b<? super L, O> bVar) {
        boolean z = false;
        if (!(collection == null || collection.isEmpty() || bVar == null)) {
            try {
                Iterator<L> it = collection.iterator();
                while (it.hasNext()) {
                    if (bVar.a(it.next(), o)) {
                        it.remove();
                        z = true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z;
    }
}
