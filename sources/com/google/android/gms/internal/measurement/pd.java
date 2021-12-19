package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class pd extends a implements pb {
    static {
        Covode.recordClassIndex(32063);
    }

    pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
        MethodCollector.i(619);
        MethodCollector.o(619);
    }

    @Override // com.google.android.gms.internal.measurement.pb
    public final void a(Bundle bundle) {
        MethodCollector.i(620);
        Parcel F_ = F_();
        z.a(F_, bundle);
        b(1, F_);
        MethodCollector.o(620);
    }
}
