package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class iy implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final iw f51899a;

    /* renamed from: b  reason: collision with root package name */
    private final eb f51900b;

    /* renamed from: c  reason: collision with root package name */
    private final JobParameters f51901c;

    static {
        Covode.recordClassIndex(32327);
    }

    public iy(iw iwVar, eb ebVar, JobParameters jobParameters) {
        this.f51899a = iwVar;
        this.f51900b = ebVar;
        this.f51901c = jobParameters;
    }

    public final void run() {
        iw iwVar = this.f51899a;
        eb ebVar = this.f51900b;
        JobParameters jobParameters = this.f51901c;
        ebVar.f51476k.a("AppMeasurementJobService processed last upload request.");
        iwVar.f51896a.a(jobParameters);
    }
}
