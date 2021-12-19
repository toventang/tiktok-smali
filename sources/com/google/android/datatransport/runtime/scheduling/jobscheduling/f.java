package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JobInfoSchedulerService f49569a;

    /* renamed from: b  reason: collision with root package name */
    private final JobParameters f49570b;

    static {
        Covode.recordClassIndex(31010);
    }

    f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f49569a = jobInfoSchedulerService;
        this.f49570b = jobParameters;
    }

    public final void run() {
        this.f49569a.jobFinished(this.f49570b, false);
    }
}
