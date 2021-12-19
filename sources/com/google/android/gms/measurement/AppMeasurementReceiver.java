package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.a.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.measurement.internal.eb;
import com.google.android.gms.measurement.internal.ev;
import com.google.android.gms.measurement.internal.ew;
import com.google.android.gms.measurement.internal.ff;

public final class AppMeasurementReceiver extends a implements ev {

    /* renamed from: a  reason: collision with root package name */
    private ew f51310a;

    static {
        Covode.recordClassIndex(32080);
    }

    @Override // com.google.android.gms.measurement.internal.ev
    public final void b(Context context, Intent intent) {
        a(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f51310a == null) {
            this.f51310a = new ew(this);
        }
        ew ewVar = this.f51310a;
        ff a2 = ff.a(context, null, null);
        eb q = a2.q();
        if (intent == null) {
            q.f51471f.a("Receiver called with null intent");
            return;
        }
        a2.t();
        String action = intent.getAction();
        q.f51476k.a("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            q.f51476k.a("Starting wakeful intent.");
            ewVar.f51563a.b(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            q.f51471f.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
