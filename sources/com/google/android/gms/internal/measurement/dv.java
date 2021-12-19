package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class dv extends a implements bv {
    static {
        Covode.recordClassIndex(31742);
    }

    public dv(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        MethodCollector.i(7216);
        MethodCollector.o(7216);
    }

    @Override // com.google.android.gms.internal.measurement.bv
    public final Bundle a(Bundle bundle) {
        MethodCollector.i(7221);
        Parcel F_ = F_();
        z.a(F_, bundle);
        Parcel a2 = a(1, F_);
        Bundle bundle2 = (Bundle) z.a(a2, Bundle.CREATOR);
        a2.recycle();
        MethodCollector.o(7221);
        return bundle2;
    }
}
