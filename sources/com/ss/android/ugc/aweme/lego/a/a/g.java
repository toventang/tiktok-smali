package com.ss.android.ugc.aweme.lego.a.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.i;
import com.ss.android.ugc.aweme.lego.j;
import com.ss.android.ugc.aweme.lego.k;
import com.ss.android.ugc.aweme.lego.l;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.z;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public final class g extends v implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.lego.a.c f107326a = new com.ss.android.ugc.aweme.lego.a.c(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f107327c;

    /* renamed from: d  reason: collision with root package name */
    private int f107328d = 1;

    static {
        Covode.recordClassIndex(68686);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
        this.f107327c = false;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.BOOT_FINISH;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f107332a;

        static {
            Covode.recordClassIndex(68690);
        }

        d(w wVar) {
            this.f107332a = wVar;
        }

        public final void run() {
            f.f107537b.b(this.f107332a);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f107330a;

        static {
            Covode.recordClassIndex(68688);
        }

        b(w wVar) {
            this.f107330a = wVar;
        }

        public final void run() {
            MethodCollector.i(11169);
            if (l.b()) {
                Thread currentThread = Thread.currentThread();
                h.f.b.l.b(currentThread, "");
                int priority = currentThread.getPriority();
                if (l.c()) {
                    Thread currentThread2 = Thread.currentThread();
                    h.f.b.l.b(currentThread2, "");
                    currentThread2.setPriority(1);
                } else if (l.d()) {
                    Thread currentThread3 = Thread.currentThread();
                    h.f.b.l.b(currentThread3, "");
                    currentThread3.setPriority(2);
                } else if (l.e()) {
                    Thread currentThread4 = Thread.currentThread();
                    h.f.b.l.b(currentThread4, "");
                    currentThread4.setPriority(3);
                }
                f.f107537b.b(this.f107330a);
                Thread currentThread5 = Thread.currentThread();
                h.f.b.l.b(currentThread5, "");
                currentThread5.setPriority(priority);
                MethodCollector.o(11169);
                return;
            }
            f.f107537b.b(this.f107330a);
            MethodCollector.o(11169);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f107331a;

        static {
            Covode.recordClassIndex(68689);
        }

        c(w wVar) {
            this.f107331a = wVar;
        }

        public final void run() {
            MethodCollector.i(10801);
            if (l.b()) {
                Thread currentThread = Thread.currentThread();
                h.f.b.l.b(currentThread, "");
                int priority = currentThread.getPriority();
                Thread currentThread2 = Thread.currentThread();
                h.f.b.l.b(currentThread2, "");
                currentThread2.setPriority(1);
                f.f107537b.b(this.f107331a);
                Thread currentThread3 = Thread.currentThread();
                h.f.b.l.b(currentThread3, "");
                currentThread3.setPriority(priority);
                MethodCollector.o(10801);
                return;
            }
            f.f107537b.b(this.f107331a);
            MethodCollector.o(10801);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
        long j2;
        this.f107327c = true;
        if (!l.b()) {
            this.f107326a.a(1201, Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", k.f107571a));
        } else if (!this.f107326a.hasMessages(1201)) {
            if (f.f107537b.a()) {
                this.f107328d = 2;
                j2 = 1000;
            } else {
                this.f107328d = 1;
                j2 = Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", k.f107571a);
            }
            this.f107326a.a(1201, j2);
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f107329a;

        static {
            Covode.recordClassIndex(68687);
        }

        a(w wVar) {
            this.f107329a = wVar;
        }

        public final void run() {
            MethodCollector.i(13139);
            Thread currentThread = Thread.currentThread();
            h.f.b.l.b(currentThread, "");
            int priority = currentThread.getPriority();
            if (l.b()) {
                if (((com.ss.android.ugc.aweme.lego.a) this.f107329a).d() == 1) {
                    if (l.c()) {
                        Thread currentThread2 = Thread.currentThread();
                        h.f.b.l.b(currentThread2, "");
                        currentThread2.setPriority(1);
                    } else if (l.d()) {
                        Thread currentThread3 = Thread.currentThread();
                        h.f.b.l.b(currentThread3, "");
                        currentThread3.setPriority(2);
                    } else if (l.e()) {
                        Thread currentThread4 = Thread.currentThread();
                        h.f.b.l.b(currentThread4, "");
                        currentThread4.setPriority(3);
                    }
                }
            } else if (((com.ss.android.ugc.aweme.lego.a) this.f107329a).d() > 1) {
                Thread currentThread5 = Thread.currentThread();
                h.f.b.l.b(currentThread5, "");
                currentThread5.setPriority(((com.ss.android.ugc.aweme.lego.a) this.f107329a).d() + 4);
            }
            f.f107537b.b(this.f107329a);
            Thread currentThread6 = Thread.currentThread();
            h.f.b.l.b(currentThread6, "");
            currentThread6.setPriority(priority);
            MethodCollector.o(13139);
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        h.f.b.l.d(list, "");
        super.a(list);
        if (com.ss.android.ugc.aweme.lego.a.b.f107371a != com.ss.android.ugc.aweme.lego.a.a.COLD_BOOT_BEGIN) {
            f.f107537b.a();
            if (!Keva.getRepo("ab_repo_cold_boot").getBoolean("lego_boot_finish_commit_opt", i.f107567a)) {
                for (n nVar : f.f107537b.a(ae.BOOT_FINISH, list)) {
                    Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                    w wVar = (w) nVar;
                    h.f.b.l.d(wVar, "");
                    p.a(z.b()).execute(new d(wVar));
                }
            } else if (!this.f107326a.hasMessages(1201)) {
                this.f107326a.a(1201, 0);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        ExecutorService a2;
        h.f.b.l.d(message, "");
        w b2 = f.f107537b.b(ae.BOOT_FINISH);
        w c2 = f.f107537b.c(ae.BOOT_FINISH);
        if (!l.b() || this.f107328d != 2 || ((c2 instanceof com.ss.android.ugc.aweme.lego.a) && ((com.ss.android.ugc.aweme.lego.a) c2).d() != 1)) {
            z = false;
        } else {
            this.f107328d = 1;
            z = true;
        }
        if (b2 != null) {
            if (b2 instanceof com.ss.android.ugc.aweme.lego.a) {
                ac e2 = ((com.ss.android.ugc.aweme.lego.a) b2).e();
                if (e2 != null) {
                    int i2 = h.f107333a[e2.ordinal()];
                    if (i2 == 1) {
                        a2 = com.ss.android.ugc.aweme.cw.g.a();
                        h.f.b.l.b(a2, "");
                    } else if (i2 == 2) {
                        if (f.c()) {
                            a2 = p.b(z.b());
                        } else {
                            a2 = p.a(z.b());
                        }
                    }
                    a2.execute(new a(b2));
                }
                throw new h.n();
            } else if (f.c()) {
                p.b(z.b()).execute(new b(b2));
            } else {
                p.a(z.b()).execute(new c(b2));
            }
            b2.h();
        }
        if (f.f107537b.a(ae.BOOT_FINISH)) {
            long j2 = Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_sparse", j.f107569a);
            if (z) {
                j2 += Keva.getRepo("ab_repo_cold_boot").getLong("lego_boot_finish_trigger_delay", k.f107571a);
            }
            this.f107326a.a(1201, j2);
        }
        return true;
    }
}
