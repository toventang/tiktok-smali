package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.gms.measurement.internal.eb;
import com.google.android.gms.measurement.internal.ff;
import com.google.android.gms.measurement.internal.iw;
import com.google.android.gms.measurement.internal.iy;
import com.google.android.gms.measurement.internal.ja;

public final class AppMeasurementJobService extends JobService implements ja {

    /* renamed from: a  reason: collision with root package name */
    private iw<AppMeasurementJobService> f51309a;

    static {
        Covode.recordClassIndex(32079);
    }

    @Override // com.google.android.gms.measurement.internal.ja
    public final void a(Intent intent) {
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    private final iw<AppMeasurementJobService> a() {
        if (this.f51309a == null) {
            this.f51309a = new iw<>(this);
        }
        return this.f51309a;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    @Override // com.google.android.gms.measurement.internal.ja
    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.ja
    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        iw<AppMeasurementJobService> a2 = a();
        ff a3 = ff.a(a2.f51896a, null, null);
        eb q = a3.q();
        String string = jobParameters.getExtras().getString("action");
        a3.t();
        q.f51476k.a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a2.a(new iy(a2, q, jobParameters));
        return true;
    }
}
