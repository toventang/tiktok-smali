package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.datatransport.d;
import com.google.android.datatransport.runtime.e.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.scheduling.a.c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

public final class e implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49566a;

    /* renamed from: b  reason: collision with root package name */
    private final c f49567b;

    /* renamed from: c  reason: collision with root package name */
    private final g f49568c;

    static {
        Covode.recordClassIndex(31009);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5100);
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
                            com.bytedance.crash.c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5100);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public final void a(k kVar, int i2) {
        try {
            ComponentName componentName = new ComponentName(this.f49566a, JobInfoSchedulerService.class);
            JobScheduler jobScheduler = (JobScheduler) a(this.f49566a, "jobscheduler");
            Adler32 adler32 = new Adler32();
            adler32.update(this.f49566a.getPackageName().getBytes(Charset.forName("UTF-8")));
            adler32.update(kVar.a().getBytes(Charset.forName("UTF-8")));
            adler32.update(ByteBuffer.allocate(4).putInt(a.a(kVar.c())).array());
            if (kVar.b() != null) {
                adler32.update(kVar.b());
            }
            int value = (int) adler32.getValue();
            if (a(jobScheduler, value, i2)) {
                com.google.android.datatransport.runtime.a.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", kVar);
                return;
            }
            long a2 = this.f49567b.a(kVar);
            g gVar = this.f49568c;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            d c2 = kVar.c();
            builder.setMinimumLatency(gVar.a(c2, a2, i2));
            Set<g.c> c3 = gVar.b().get(c2).c();
            if (c3.contains(g.c.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (c3.contains(g.c.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (c3.contains(g.c.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", kVar.a());
            persistableBundle.putInt("priority", a.a(kVar.c()));
            if (kVar.b() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(kVar.b(), 0));
            }
            builder.setExtras(persistableBundle);
            com.google.android.datatransport.runtime.a.a.a("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", kVar, Integer.valueOf(value), Long.valueOf(this.f49568c.a(kVar.c(), a2, i2)), Long.valueOf(a2), Integer.valueOf(i2));
            jobScheduler.schedule(builder.build());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public e(Context context, c cVar, g gVar) {
        this.f49566a = context;
        this.f49567b = cVar;
        this.f49568c = gVar;
    }

    private static boolean a(JobScheduler jobScheduler, int i2, int i3) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i4 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i2) {
                if (i4 >= i3) {
                    return true;
                }
            }
        }
        return false;
    }
}
