package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.a;
import androidx.work.impl.a.c;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.background.systemalarm.g;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class d implements a, c, g.a {

    /* renamed from: h  reason: collision with root package name */
    private static final String f4643h = androidx.work.g.a("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    final Context f4644a;

    /* renamed from: b  reason: collision with root package name */
    final int f4645b;

    /* renamed from: c  reason: collision with root package name */
    final String f4646c;

    /* renamed from: d  reason: collision with root package name */
    final e f4647d;

    /* renamed from: e  reason: collision with root package name */
    final androidx.work.impl.a.d f4648e;

    /* renamed from: f  reason: collision with root package name */
    PowerManager.WakeLock f4649f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4650g = false;

    /* renamed from: i  reason: collision with root package name */
    private final Object f4651i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private boolean f4652j = false;

    static {
        Covode.recordClassIndex(1830);
    }

    private void b() {
        synchronized (this.f4651i) {
            this.f4647d.f4655c.a(this.f4646c);
            PowerManager.WakeLock wakeLock = this.f4649f;
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.g.a();
                com.a.a("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f4649f, this.f4646c});
                this.f4649f.release();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.f4651i) {
            if (!this.f4652j) {
                androidx.work.g.a();
                com.a.a("Stopping work for workspec %s", new Object[]{this.f4646c});
                this.f4647d.a(new e.a(this.f4647d, b.c(this.f4644a, this.f4646c), this.f4645b));
                if (this.f4647d.f4656d.c(this.f4646c)) {
                    androidx.work.g.a();
                    com.a.a("WorkSpec %s needs to be rescheduled", new Object[]{this.f4646c});
                    this.f4647d.a(new e.a(this.f4647d, b.a(this.f4644a, this.f4646c), this.f4645b));
                } else {
                    androidx.work.g.a();
                    com.a.a("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f4646c});
                }
                this.f4652j = true;
            } else {
                androidx.work.g.a();
                com.a.a("Already stopped work for %s", new Object[]{this.f4646c});
            }
        }
    }

    @Override // androidx.work.impl.a.c
    public final void b(List<String> list) {
        a();
    }

    @Override // androidx.work.impl.background.systemalarm.g.a
    public final void a(String str) {
        androidx.work.g.a();
        com.a.a("Exceeded time limits on execution for %s", new Object[]{str});
        a();
    }

    @Override // androidx.work.impl.a.c
    public final void a(List<String> list) {
        if (list.contains(this.f4646c)) {
            androidx.work.g.a();
            com.a.a("onAllConstraintsMet for %s", new Object[]{this.f4646c});
            if (this.f4647d.f4656d.a(this.f4646c, (WorkerParameters.a) null)) {
                g gVar = this.f4647d.f4655c;
                String str = this.f4646c;
                synchronized (gVar.f4674d) {
                    androidx.work.g.a();
                    com.a.a("Starting timer for %s", new Object[]{str});
                    gVar.a(str);
                    g.b bVar = new g.b(gVar, str);
                    gVar.f4672b.put(str, bVar);
                    gVar.f4673c.put(str, this);
                    gVar.f4671a.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
                }
                return;
            }
            b();
        }
    }

    @Override // androidx.work.impl.a
    public final void a(String str, boolean z) {
        androidx.work.g.a();
        com.a.a("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        b();
        if (z) {
            this.f4647d.a(new e.a(this.f4647d, b.a(this.f4644a, this.f4646c), this.f4645b));
        }
        if (this.f4650g) {
            this.f4647d.a(new e.a(this.f4647d, b.a(this.f4644a), this.f4645b));
        }
    }

    d(Context context, int i2, String str, e eVar) {
        this.f4644a = context;
        this.f4645b = i2;
        this.f4647d = eVar;
        this.f4646c = str;
        this.f4648e = new androidx.work.impl.a.d(context, this);
    }
}
