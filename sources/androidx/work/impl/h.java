package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.e;
import androidx.work.f;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.b.k;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.a.c;
import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final String f4710a = g.a("WorkerWrapper");

    /* renamed from: b  reason: collision with root package name */
    androidx.work.impl.b.g f4711b;

    /* renamed from: c  reason: collision with root package name */
    ListenableWorker f4712c;

    /* renamed from: d  reason: collision with root package name */
    ListenableWorker.a f4713d = new ListenableWorker.a.C0066a();

    /* renamed from: e  reason: collision with root package name */
    public c<Boolean> f4714e = new c<>();

    /* renamed from: f  reason: collision with root package name */
    q<ListenableWorker.a> f4715f = null;

    /* renamed from: g  reason: collision with root package name */
    volatile boolean f4716g;

    /* renamed from: h  reason: collision with root package name */
    private Context f4717h;

    /* renamed from: i  reason: collision with root package name */
    private String f4718i;

    /* renamed from: j  reason: collision with root package name */
    private List<c> f4719j;

    /* renamed from: k  reason: collision with root package name */
    private WorkerParameters.a f4720k;

    /* renamed from: l  reason: collision with root package name */
    private b f4721l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.work.impl.utils.b.a f4722m;
    private WorkDatabase n;
    private androidx.work.impl.b.h o;
    private androidx.work.impl.b.b p;
    private k q;
    private List<String> r;
    private String s;

    static {
        Covode.recordClassIndex(1854);
    }

    private void c() {
        i.a d2 = this.o.d(this.f4718i);
        if (d2 == i.a.RUNNING) {
            g.a();
            com.a.a("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f4718i});
            a(true);
            return;
        }
        g.a();
        com.a.a("Status for %s is %s; not doing any work", new Object[]{this.f4718i, d2});
        a(false);
    }

    private boolean d() {
        this.n.e();
        try {
            boolean z = true;
            if (this.o.d(this.f4718i) == i.a.ENQUEUED) {
                this.o.a(i.a.RUNNING, this.f4718i);
                this.o.b(this.f4718i);
            } else {
                z = false;
            }
            this.n.g();
            return z;
        } finally {
            this.n.f();
        }
    }

    private void e() {
        this.n.e();
        try {
            a(this.f4718i);
            this.o.a(this.f4718i, ((ListenableWorker.a.C0066a) this.f4713d).f4451a);
            this.n.g();
        } finally {
            this.n.f();
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        boolean z = false;
        if (!this.f4716g) {
            return false;
        }
        g.a();
        com.a.a("Work interrupted for %s", new Object[]{this.s});
        i.a d2 = this.o.d(this.f4718i);
        if (d2 != null && !d2.isFinished()) {
            z = true;
        }
        a(z);
        return true;
    }

    private void f() {
        this.n.e();
        try {
            this.o.a(i.a.ENQUEUED, this.f4718i);
            this.o.a(this.f4718i, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT < 23) {
                this.o.b(this.f4718i, -1);
            }
            this.n.g();
        } finally {
            this.n.f();
            a(true);
        }
    }

    private void g() {
        this.n.e();
        try {
            this.o.a(this.f4718i, System.currentTimeMillis());
            this.o.a(i.a.ENQUEUED, this.f4718i);
            this.o.c(this.f4718i);
            if (Build.VERSION.SDK_INT < 23) {
                this.o.b(this.f4718i, -1);
            }
            this.n.g();
        } finally {
            this.n.f();
            a(false);
        }
    }

    private void h() {
        this.n.e();
        try {
            this.o.a(i.a.SUCCEEDED, this.f4718i);
            this.o.a(this.f4718i, ((ListenableWorker.a.c) this.f4713d).f4452a);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.p.b(this.f4718i)) {
                if (this.o.d(str) == i.a.BLOCKED && this.p.a(str)) {
                    g.a();
                    com.a.a("Setting status to enqueued for %s", new Object[]{str});
                    this.o.a(i.a.ENQUEUED, str);
                    this.o.a(str, currentTimeMillis);
                }
            }
            this.n.g();
        } finally {
            this.n.f();
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f4722m.b() == Thread.currentThread()) {
            boolean z = false;
            if (!b()) {
                try {
                    this.n.e();
                    i.a d2 = this.o.d(this.f4718i);
                    if (d2 == null) {
                        a(false);
                        z = true;
                    } else if (d2 == i.a.RUNNING) {
                        ListenableWorker.a aVar = this.f4713d;
                        if (aVar instanceof ListenableWorker.a.c) {
                            g.a();
                            com.a.a("Worker result SUCCESS for %s", new Object[]{this.s});
                            if (this.f4711b.a()) {
                                g();
                            } else {
                                h();
                            }
                        } else if (aVar instanceof ListenableWorker.a.b) {
                            g.a();
                            com.a.a("Worker result RETRY for %s", new Object[]{this.s});
                            f();
                        } else {
                            g.a();
                            com.a.a("Worker result FAILURE for %s", new Object[]{this.s});
                            if (this.f4711b.a()) {
                                g();
                            } else {
                                e();
                            }
                        }
                        z = this.o.d(this.f4718i).isFinished();
                    } else if (!d2.isFinished()) {
                        f();
                    }
                    this.n.g();
                } finally {
                    this.n.f();
                }
            }
            List<c> list = this.f4719j;
            if (list != null) {
                if (z) {
                    for (c cVar : list) {
                        cVar.a(this.f4718i);
                    }
                }
                d.a(this.f4721l, this.n, this.f4719j);
                return;
            }
            return;
        }
        throw new IllegalStateException("Needs to be executed on the Background executor thread.");
    }

    public final void run() {
        e a2;
        List<String> a3 = this.q.a(this.f4718i);
        this.r = a3;
        StringBuilder append = new StringBuilder("Work [ id=").append(this.f4718i).append(", tags={ ");
        boolean z = true;
        for (String str : a3) {
            if (z) {
                z = false;
            } else {
                append.append(", ");
            }
            append.append(str);
        }
        append.append(" } ]");
        this.s = append.toString();
        if (!b()) {
            this.n.e();
            try {
                androidx.work.impl.b.g a4 = this.o.a(this.f4718i);
                this.f4711b = a4;
                if (a4 == null) {
                    g.a();
                    com.a.a("Didn't find WorkSpec for id %s", new Object[]{this.f4718i});
                    a(false);
                } else if (a4.f4579b != i.a.ENQUEUED) {
                    c();
                    this.n.g();
                    g.a();
                    com.a.a("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f4711b.f4580c});
                    this.n.f();
                } else {
                    if (this.f4711b.a() || this.f4711b.b()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((Build.VERSION.SDK_INT >= 23 || this.f4711b.f4585h == this.f4711b.f4586i || this.f4711b.n != 0) && currentTimeMillis < this.f4711b.c()) {
                            g.a();
                            com.a.a("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f4711b.f4580c});
                            a(true);
                            this.n.f();
                            return;
                        }
                    }
                    this.n.g();
                    this.n.f();
                    if (this.f4711b.a()) {
                        a2 = this.f4711b.f4582e;
                    } else {
                        f a5 = f.a(this.f4711b.f4581d);
                        if (a5 == null) {
                            g.a();
                            com.a.a("Could not create Input Merger %s", new Object[]{this.f4711b.f4581d});
                            e();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f4711b.f4582e);
                        arrayList.addAll(this.o.e(this.f4718i));
                        a2 = a5.a(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f4718i), a2, this.r, this.f4720k, this.f4711b.f4588k, this.f4721l.f4467a, this.f4722m, this.f4721l.f4468b);
                    if (this.f4712c == null) {
                        this.f4712c = androidx.work.k.a(this.f4717h, this.f4711b.f4580c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f4712c;
                    if (listenableWorker == null) {
                        g.a();
                        com.a.a("Could not create Worker %s", new Object[]{this.f4711b.f4580c});
                        e();
                    } else if (listenableWorker.f4450d) {
                        g.a();
                        com.a.a("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f4711b.f4580c});
                        e();
                    } else {
                        this.f4712c.f4450d = true;
                        if (!d()) {
                            c();
                        } else if (!b()) {
                            final c cVar = new c();
                            this.f4722m.a().execute(new Runnable() {
                                /* class androidx.work.impl.h.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(1855);
                                }

                                public final void run() {
                                    try {
                                        g.a();
                                        com.a.a("Starting work for %s", new Object[]{h.this.f4711b.f4580c});
                                        h hVar = h.this;
                                        hVar.f4715f = hVar.f4712c.a();
                                        cVar.a((q) h.this.f4715f);
                                    } catch (Throwable th) {
                                        cVar.a(th);
                                    }
                                }
                            });
                            final String str2 = this.s;
                            cVar.a(new Runnable() {
                                /* class androidx.work.impl.h.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(1856);
                                }

                                public final void run() {
                                    try {
                                        ListenableWorker.a aVar = (ListenableWorker.a) cVar.get();
                                        if (aVar == null) {
                                            g.a();
                                            com.a.a("%s returned a null result. Treating it as a failure.", new Object[]{h.this.f4711b.f4580c});
                                        } else {
                                            g.a();
                                            com.a.a("%s returned a %s result.", new Object[]{h.this.f4711b.f4580c, aVar});
                                            h.this.f4713d = aVar;
                                        }
                                    } catch (CancellationException e2) {
                                        g.a();
                                        com.a.a("%s was cancelled", new Object[]{str2});
                                        new Throwable[1][0] = e2;
                                    } catch (InterruptedException | ExecutionException e3) {
                                        g.a();
                                        com.a.a("%s failed because it threw an exception/error", new Object[]{str2});
                                        new Throwable[1][0] = e3;
                                    } catch (Throwable th) {
                                        h.this.a();
                                        throw th;
                                    }
                                    h.this.a();
                                }
                            }, this.f4722m.c());
                        }
                    }
                }
            } finally {
                this.n.f();
            }
        }
    }

    private void a(String str) {
        for (String str2 : this.p.b(str)) {
            a(str2);
        }
        if (this.o.d(str) != i.a.CANCELLED) {
            this.o.a(i.a.FAILED, str);
        }
    }

    h(a aVar) {
        this.f4717h = aVar.f4728a;
        this.f4722m = aVar.f4730c;
        this.f4718i = aVar.f4733f;
        this.f4719j = aVar.f4734g;
        this.f4720k = aVar.f4735h;
        this.f4712c = aVar.f4729b;
        this.f4721l = aVar.f4731d;
        WorkDatabase workDatabase = aVar.f4732e;
        this.n = workDatabase;
        this.o = workDatabase.i();
        this.p = this.n.j();
        this.q = this.n.k();
    }

    /* JADX INFO: finally extract failed */
    private void a(boolean z) {
        try {
            this.n.e();
            if (this.n.i().a().isEmpty()) {
                androidx.work.impl.utils.b.a(this.f4717h, RescheduleReceiver.class, false);
            }
            this.n.g();
            this.n.f();
            this.f4714e.a(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.n.f();
            throw th;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        Context f4728a;

        /* renamed from: b  reason: collision with root package name */
        ListenableWorker f4729b;

        /* renamed from: c  reason: collision with root package name */
        androidx.work.impl.utils.b.a f4730c;

        /* renamed from: d  reason: collision with root package name */
        b f4731d;

        /* renamed from: e  reason: collision with root package name */
        WorkDatabase f4732e;

        /* renamed from: f  reason: collision with root package name */
        String f4733f;

        /* renamed from: g  reason: collision with root package name */
        List<c> f4734g;

        /* renamed from: h  reason: collision with root package name */
        WorkerParameters.a f4735h = new WorkerParameters.a();

        static {
            Covode.recordClassIndex(1857);
        }

        public a(Context context, b bVar, androidx.work.impl.utils.b.a aVar, WorkDatabase workDatabase, String str) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f4728a = applicationContext;
            this.f4730c = aVar;
            this.f4731d = bVar;
            this.f4732e = workDatabase;
            this.f4733f = str;
        }
    }
}
