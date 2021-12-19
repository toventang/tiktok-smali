package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.g;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b.d;
import androidx.work.impl.c;
import androidx.work.impl.f;
import androidx.work.impl.utils.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.List;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4686a = g.a("SystemJobScheduler");

    /* renamed from: b  reason: collision with root package name */
    private final JobScheduler f4687b;

    /* renamed from: c  reason: collision with root package name */
    private final f f4688c;

    /* renamed from: d  reason: collision with root package name */
    private final a f4689d;

    /* renamed from: e  reason: collision with root package name */
    private final a f4690e;

    static {
        Covode.recordClassIndex(1844);
    }

    @Override // androidx.work.impl.c
    public final void a(String str) {
        List<JobInfo> allPendingJobs = this.f4687b.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f4688c.f4701c.l().b(str);
                    this.f4687b.cancel(jobInfo.getId());
                    if (Build.VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // androidx.work.impl.c
    public final void a(androidx.work.impl.b.g... gVarArr) {
        int i2;
        WorkDatabase workDatabase = this.f4688c.f4701c;
        for (androidx.work.impl.b.g gVar : gVarArr) {
            workDatabase.e();
            try {
                androidx.work.impl.b.g a2 = workDatabase.i().a(gVar.f4578a);
                if (a2 == null) {
                    g.a();
                } else if (a2.f4579b != i.a.ENQUEUED) {
                    g.a();
                } else {
                    d a3 = workDatabase.l().a(gVar.f4578a);
                    if (a3 != null) {
                        JobScheduler jobScheduler = this.f4687b;
                        String str = gVar.f4578a;
                        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                        if (allPendingJobs != null) {
                            for (JobInfo jobInfo : allPendingJobs) {
                                PersistableBundle extras = jobInfo.getExtras();
                                if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                                    g.a();
                                    com.a.a("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{gVar.f4578a});
                                    break;
                                }
                            }
                        }
                        i2 = a3.f4572b;
                    } else {
                        i2 = this.f4689d.a(this.f4688c.f4700b.f4470d, this.f4688c.f4700b.f4471e);
                        this.f4688c.f4701c.l().a(new d(gVar.f4578a, i2));
                    }
                    a(gVar, i2);
                    if (Build.VERSION.SDK_INT == 23) {
                        a(gVar, this.f4689d.a(this.f4688c.f4700b.f4470d, this.f4688c.f4700b.f4471e));
                    }
                    workDatabase.g();
                }
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }

    public b(Context context, f fVar) {
        this(context, fVar, (JobScheduler) a(context, "jobscheduler"), new a(context));
    }

    private void a(androidx.work.impl.b.g gVar, int i2) {
        JobInfo a2 = this.f4690e.a(gVar, i2);
        g.a();
        com.a.a("Scheduling work ID %s Job ID %s", new Object[]{gVar.f4578a, Integer.valueOf(i2)});
        this.f4687b.schedule(a2);
    }

    public static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    private b(Context context, f fVar, JobScheduler jobScheduler, a aVar) {
        this.f4688c = fVar;
        this.f4687b = jobScheduler;
        this.f4689d = new a(context);
        this.f4690e = aVar;
    }
}
