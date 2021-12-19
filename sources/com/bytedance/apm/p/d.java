package com.bytedance.apm.p;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.h;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    static final h.a<c, Runnable> f25214f = new h.a<c, Runnable>() {
        /* class com.bytedance.apm.p.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(14690);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.apm.q.h.a
        public final /* synthetic */ boolean a(c cVar, Runnable runnable) {
            c cVar2 = cVar;
            if (runnable == null) {
                if (cVar2 == null || cVar2.f25223a == null || cVar2.f25223a.getCallback() == null) {
                    return true;
                }
                return false;
            } else if (cVar2 == null || cVar2.f25223a == null || !runnable.equals(cVar2.f25223a.getCallback())) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: g  reason: collision with root package name */
    static final h.a<Message, Runnable> f25215g = new h.a<Message, Runnable>() {
        /* class com.bytedance.apm.p.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(14691);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.bytedance.apm.q.h.a
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
    public final HandlerThread f25216a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<c> f25217b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Message> f25218c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f25219d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f25220e = new Object();

    public final boolean a() {
        if (this.f25219d != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(14689);
    }

    class b extends HandlerThread {
        static {
            Covode.recordClassIndex(14693);
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (d.this.f25220e) {
                d.this.f25219d = new Handler();
            }
            d.this.f25219d.post(new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    h.b.f24998a.b(th, "apm_error");
                }
            }
        }

        b(String str) {
            super(str);
        }
    }

    class a implements Runnable {
        static {
            Covode.recordClassIndex(14692);
        }

        public final void run() {
            while (!d.this.f25218c.isEmpty()) {
                synchronized (d.this.f25220e) {
                    if (d.this.f25219d != null) {
                        d.this.f25219d.sendMessageAtFrontOfQueue(d.this.f25218c.poll());
                    }
                }
            }
            while (!d.this.f25217b.isEmpty()) {
                synchronized (d.this.f25220e) {
                    c poll = d.this.f25217b.poll();
                    if (d.this.f25219d != null) {
                        d.this.f25219d.sendMessageAtTime(poll.f25223a, poll.f25224b);
                    }
                }
            }
        }

        a() {
        }
    }

    private Message c(Runnable runnable) {
        return Message.obtain(this.f25219d, runnable);
    }

    public final boolean a(Runnable runnable) {
        return a(c(runnable), 0);
    }

    public d(String str) {
        this.f25216a = new b(str);
    }

    public final void b(Runnable runnable) {
        if (!this.f25217b.isEmpty() || !this.f25218c.isEmpty()) {
            com.bytedance.apm.q.h.a(this.f25217b, runnable, f25214f);
            com.bytedance.apm.q.h.a(this.f25218c, runnable, f25215g);
        }
        if (this.f25219d != null) {
            this.f25219d.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Message f25223a;

        /* renamed from: b  reason: collision with root package name */
        long f25224b;

        static {
            Covode.recordClassIndex(14694);
        }

        c(Message message, long j2) {
            this.f25223a = message;
            this.f25224b = j2;
        }
    }

    private boolean a(Message message, long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j2);
    }

    private boolean b(Message message, long j2) {
        if (this.f25219d == null) {
            synchronized (this.f25220e) {
                if (this.f25219d == null) {
                    this.f25217b.add(new c(message, j2));
                    return true;
                }
            }
        }
        return this.f25219d.sendMessageAtTime(message, j2);
    }

    public final boolean a(Runnable runnable, long j2) {
        return a(c(runnable), j2);
    }
}
