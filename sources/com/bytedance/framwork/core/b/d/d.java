package com.bytedance.framwork.core.b.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.b.e.b;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    static final b.a<c, Runnable> f29463f = new b.a<c, Runnable>() {
        /* class com.bytedance.framwork.core.b.d.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17161);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.framwork.core.b.e.b.a
        public final /* synthetic */ boolean a(c cVar, Runnable runnable) {
            c cVar2 = cVar;
            if (runnable == null) {
                if (cVar2 == null || cVar2.f29472a == null || cVar2.f29472a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar2 == null || cVar2.f29472a == null || !runnable.equals(cVar2.f29472a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    static final b.a<Message, Runnable> f29464g = new b.a<Message, Runnable>() {
        /* class com.bytedance.framwork.core.b.d.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(17162);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.framwork.core.b.e.b.a
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
    final HandlerThread f29465a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<c> f29466b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Message> f29467c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f29468d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f29469e = new Object();

    static {
        Covode.recordClassIndex(17160);
    }

    class b extends HandlerThread {
        static {
            Covode.recordClassIndex(17164);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:7:?, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onLooperPrepared() {
            /*
                r4 = this;
                r3 = 11920(0x2e90, float:1.6703E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
                super.onLooperPrepared()
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.b.d.d.this
                java.lang.Object r2 = r0.f29469e
                monitor-enter(r2)
                com.bytedance.framwork.core.b.d.d r1 = com.bytedance.framwork.core.b.d.d.this     // Catch:{ all -> 0x0029 }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x0029 }
                r0.<init>()     // Catch:{ all -> 0x0029 }
                r1.f29468d = r0     // Catch:{ all -> 0x0029 }
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.b.d.d.this
                android.os.Handler r2 = r0.f29468d
                com.bytedance.framwork.core.b.d.d$a r1 = new com.bytedance.framwork.core.b.d.d$a
                com.bytedance.framwork.core.b.d.d r0 = com.bytedance.framwork.core.b.d.d.this
                r1.<init>()
                r2.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                monitor-exit(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.b.d.d.b.onLooperPrepared():void");
        }

        b(String str) {
            super(str);
        }
    }

    class a implements Runnable {
        static {
            Covode.recordClassIndex(17163);
        }

        public final void run() {
            while (!d.this.f29467c.isEmpty()) {
                if (d.this.f29468d != null) {
                    d.this.f29468d.sendMessageAtFrontOfQueue(d.this.f29467c.poll());
                }
            }
            while (!d.this.f29466b.isEmpty()) {
                c poll = d.this.f29466b.poll();
                if (d.this.f29468d != null) {
                    d.this.f29468d.sendMessageAtTime(poll.f29472a, poll.f29473b);
                }
            }
        }

        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public final Message a(Runnable runnable) {
        return Message.obtain(this.f29468d, runnable);
    }

    public d(String str) {
        this.f29465a = new b(str);
    }

    public final void b(Runnable runnable) {
        if (!this.f29466b.isEmpty() || !this.f29467c.isEmpty()) {
            com.bytedance.framwork.core.b.e.b.a(this.f29466b, runnable, f29463f);
            com.bytedance.framwork.core.b.e.b.a(this.f29467c, runnable, f29464g);
        }
        if (this.f29468d != null) {
            this.f29468d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Message f29472a;

        /* renamed from: b  reason: collision with root package name */
        long f29473b;

        static {
            Covode.recordClassIndex(17165);
        }

        c(Message message, long j2) {
            this.f29472a = message;
            this.f29473b = j2;
        }
    }

    public final boolean a(Runnable runnable, long j2) {
        return a(a(runnable), j2);
    }

    public final boolean a(Message message, long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j2);
    }

    private boolean b(Message message, long j2) {
        MethodCollector.i(10722);
        if (this.f29468d == null) {
            synchronized (this.f29469e) {
                try {
                    if (this.f29468d == null) {
                        this.f29466b.add(new c(message, j2));
                        return true;
                    }
                } finally {
                    MethodCollector.o(10722);
                }
            }
        }
        boolean sendMessageAtTime = this.f29468d.sendMessageAtTime(message, j2);
        MethodCollector.o(10722);
        return sendMessageAtTime;
    }
}
