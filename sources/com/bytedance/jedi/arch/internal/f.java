package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.a.c;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class f extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39490a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39491c = false;

    static {
        Covode.recordClassIndex(24299);
    }

    static final class a extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f39492a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f39493b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f39494c;

        static {
            Covode.recordClassIndex(24300);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f39492a;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f39492a = true;
            this.f39493b.removeCallbacksAndMessages(this);
        }

        public a(Handler handler, boolean z) {
            l.c(handler, "");
            this.f39493b = handler;
            this.f39494c = z;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            l.c(runnable, "");
            l.c(timeUnit, "");
            if (this.f39492a) {
                c cVar = c.INSTANCE;
                l.a((Object) cVar, "");
                return cVar;
            }
            Runnable a2 = f.a.h.a.a(runnable);
            l.a((Object) a2, "");
            boolean a3 = g.a();
            b bVar = new b(this.f39493b, a2, a3);
            if (a3) {
                bVar.run();
                return bVar;
            }
            Message obtain = Message.obtain(this.f39493b, bVar);
            obtain.obj = this;
            if (this.f39494c) {
                l.a((Object) obtain, "");
                obtain.setAsynchronous(true);
            }
            this.f39493b.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f39492a) {
                return bVar;
            }
            this.f39493b.removeCallbacks(bVar);
            c cVar2 = c.INSTANCE;
            l.a((Object) cVar2, "");
            return cVar2;
        }
    }

    static final class b implements f.a.b.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f39495a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f39496b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f39497c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f39498d;

        static {
            Covode.recordClassIndex(24301);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f39495a;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f39498d) {
                this.f39496b.removeCallbacks(this);
            }
            this.f39495a = true;
        }

        public final void run() {
            try {
                this.f39497c.run();
            } catch (Throwable th) {
                f.a.h.a.a(th);
            }
        }

        public b(Handler handler, Runnable runnable, boolean z) {
            l.c(handler, "");
            l.c(runnable, "");
            this.f39496b = handler;
            this.f39497c = runnable;
            this.f39498d = z;
        }
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new a(this.f39490a, this.f39491c);
    }

    public f(Handler handler) {
        l.c(handler, "");
        this.f39490a = handler;
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        l.c(runnable, "");
        l.c(timeUnit, "");
        Runnable a2 = f.a.h.a.a(runnable);
        l.a((Object) a2, "");
        boolean a3 = g.a();
        b bVar = new b(this.f39490a, a2, a3);
        if (a3) {
            bVar.run();
            return bVar;
        }
        this.f39490a.postDelayed(bVar, timeUnit.toMillis(j2));
        return bVar;
    }
}
