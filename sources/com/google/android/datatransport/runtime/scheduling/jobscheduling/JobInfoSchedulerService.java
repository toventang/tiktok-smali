package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.p;
import com.ss.android.ugc.aweme.lancet.a.a;

public class JobInfoSchedulerService extends JobService {
    static {
        Covode.recordClassIndex(31003);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        Context applicationContext = getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        p.a(applicationContext);
        k.a a2 = k.d().a(string).a(com.google.android.datatransport.runtime.e.a.a(i2));
        if (string2 != null) {
            a2.a(Base64.decode(string2, 0));
        }
        p.a().f49460a.a(a2.a(), i3, new f(this, jobParameters));
        return true;
    }
}
