package com.google.android.gms.internal.b;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d extends a implements c {
    static {
        Covode.recordClassIndex(31544);
    }

    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        MethodCollector.i(824);
        MethodCollector.o(824);
    }

    @Override // com.google.android.gms.internal.b.c
    public final void a(e eVar) {
        MethodCollector.i(827);
        Parcel a2 = a();
        a2.writeStrongBinder(eVar.asBinder());
        a(a2);
        MethodCollector.o(827);
    }
}
