package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.google.android.gms.measurement.internal.eb;
import com.google.android.gms.measurement.internal.ff;
import com.google.android.gms.measurement.internal.fg;
import com.google.android.gms.measurement.internal.iv;
import com.google.android.gms.measurement.internal.iw;
import com.google.android.gms.measurement.internal.ja;
import com.google.android.gms.measurement.internal.jo;

public final class AppMeasurementService extends Service implements ja {

    /* renamed from: a  reason: collision with root package name */
    private iw<AppMeasurementService> f51311a;

    static {
        Covode.recordClassIndex(32081);
    }

    private final iw<AppMeasurementService> a() {
        if (this.f51311a == null) {
            this.f51311a = new iw<>(this);
        }
        return this.f51311a;
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
    public final void a(Intent intent) {
        AppMeasurementReceiver.a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.ja
    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }

    @Override // com.google.android.gms.measurement.internal.ja
    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    public final IBinder onBind(Intent intent) {
        iw<AppMeasurementService> a2 = a();
        if (intent == null) {
            a2.c().f51468c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new fg(jo.a(a2.f51896a));
        }
        a2.c().f51471f.a("onBind received unknown action", action);
        return null;
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        iw<AppMeasurementService> a2 = a();
        ff a3 = ff.a(a2.f51896a, null, null);
        eb q = a3.q();
        if (intent == null) {
            q.f51471f.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a3.t();
        q.f51476k.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a2.a(new iv(a2, i3, q, intent));
        return 2;
    }
}
