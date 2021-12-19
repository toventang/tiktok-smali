package com.bytedance.assem.jedi_vm.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import f.a.aa;
import h.f.b.l;
import java.util.concurrent.TimeUnit;

public final class c extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f25741a;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25742c = false;

    static {
        Covode.recordClassIndex(15018);
    }

    static final class a extends aa.c {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f25743a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f25744b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f25745c;

        static {
            Covode.recordClassIndex(15019);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f25743a;
        }

        @Override // f.a.b.b
        public final void dispose() {
            this.f25743a = true;
            this.f25744b.removeCallbacksAndMessages(this);
        }

        public a(Handler handler, boolean z) {
            l.c(handler, "");
            this.f25744b = handler;
            this.f25745c = z;
        }

        @Override // f.a.aa.c
        public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
            l.c(runnable, "");
            l.c(timeUnit, "");
            if (this.f25743a) {
                f.a.e.a.c cVar = f.a.e.a.c.INSTANCE;
                l.a((Object) cVar, "");
                return cVar;
            }
            Runnable a2 = f.a.h.a.a(runnable);
            l.a((Object) a2, "");
            boolean a3 = d.a();
            b bVar = new b(this.f25744b, a2, a3);
            if (a3) {
                bVar.run();
                return bVar;
            }
            Message obtain = Message.obtain(this.f25744b, bVar);
            obtain.obj = this;
            if (this.f25745c) {
                l.a((Object) obtain, "");
                obtain.setAsynchronous(true);
            }
            this.f25744b.sendMessageDelayed(obtain, timeUnit.toMillis(j2));
            if (!this.f25743a) {
                return bVar;
            }
            this.f25744b.removeCallbacks(bVar);
            f.a.e.a.c cVar2 = f.a.e.a.c.INSTANCE;
            l.a((Object) cVar2, "");
            return cVar2;
        }
    }

    static final class b implements f.a.b.b, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f25746a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f25747b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f25748c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f25749d;

        static {
            Covode.recordClassIndex(15020);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.f25746a;
        }

        @Override // f.a.b.b
        public final void dispose() {
            if (!this.f25749d) {
                this.f25747b.removeCallbacks(this);
            }
            this.f25746a = true;
        }

        public final void run() {
            try {
                this.f25748c.run();
            } catch (Throwable th) {
                f.a.h.a.a(th);
            }
        }

        public b(Handler handler, Runnable runnable, boolean z) {
            l.c(handler, "");
            l.c(runnable, "");
            this.f25747b = handler;
            this.f25748c = runnable;
            this.f25749d = z;
        }
    }

    @Override // f.a.aa
    public final aa.c a() {
        return new a(this.f25741a, this.f25742c);
    }

    public c(Handler handler) {
        l.c(handler, "");
        this.f25741a = handler;
    }

    @Override // f.a.aa
    public final f.a.b.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        l.c(runnable, "");
        l.c(timeUnit, "");
        Runnable a2 = f.a.h.a.a(runnable);
        l.a((Object) a2, "");
        boolean a3 = d.a();
        b bVar = new b(this.f25741a, a2, a3);
        if (a3) {
            bVar.run();
            return bVar;
        }
        this.f25741a.postDelayed(bVar, timeUnit.toMillis(j2));
        return bVar;
    }
}
