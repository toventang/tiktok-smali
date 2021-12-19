package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.fl;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class jk extends jp {

    /* renamed from: a  reason: collision with root package name */
    private final AlarmManager f51930a = ((AlarmManager) a(m(), "alarm"));

    /* renamed from: b  reason: collision with root package name */
    private final h f51931b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f51932c;

    static {
        Covode.recordClassIndex(32340);
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ ey I_() {
        return super.I_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ e J_() {
        return super.J_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ kd K_() {
        return super.K_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ jv L_() {
        return super.L_();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    private final void j() {
        ((JobScheduler) a(m(), "jobscheduler")).cancel(u());
    }

    private final PendingIntent v() {
        Context m2 = m();
        return PendingIntent.getBroadcast(m2, 0, new Intent().setClassName(m2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
    public final boolean d() {
        this.f51930a.cancel(v());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        j();
        return false;
    }

    private final int u() {
        String str;
        if (this.f51932c == null) {
            String valueOf = String.valueOf(m().getPackageName());
            if (valueOf.length() != 0) {
                str = "measurement".concat(valueOf);
            } else {
                str = new String("measurement");
            }
            this.f51932c = Integer.valueOf(str.hashCode());
        }
        return this.f51932c.intValue();
    }

    public final void e() {
        B();
        q().f51476k.a("Unscheduling upload");
        this.f51930a.cancel(v());
        this.f51931b.c();
        if (Build.VERSION.SDK_INT >= 24) {
            j();
        }
    }

    protected jk(jo joVar) {
        super(joVar);
        this.f51931b = new jn(this, joVar.f51940b, joVar);
    }

    public final void a(long j2) {
        B();
        t();
        Context m2 = m();
        if (!ew.a(m2)) {
            q().f51475j.a("Receiver not registered/enabled");
        }
        if (!jz.a(m2)) {
            q().f51475j.a("Service not registered/enabled");
        }
        e();
        q().f51476k.a("Scheduling upload, millis", Long.valueOf(j2));
        long b2 = l().b() + j2;
        if (j2 < Math.max(0L, p.x.a(null).longValue()) && !this.f51931b.b()) {
            this.f51931b.a(j2);
        }
        t();
        if (Build.VERSION.SDK_INT >= 24) {
            Context m3 = m();
            ComponentName componentName = new ComponentName(m3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int u = u();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(u, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build();
            JobScheduler jobScheduler = (JobScheduler) fl.a(m3, "jobscheduler");
            if (fl.f50861a == null || m3.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
                jobScheduler.schedule(build);
            } else {
                new fl(jobScheduler).a(build, "com.google.android.gms", fl.a(), "UploadAlarm");
            }
        } else {
            this.f51930a.setInexactRepeating(2, b2, Math.max(p.s.a(null).longValue(), j2), v());
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2168);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2168);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
