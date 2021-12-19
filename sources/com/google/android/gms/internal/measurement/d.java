package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d extends a implements b {
    static {
        Covode.recordClassIndex(31720);
    }

    @Override // com.google.android.gms.internal.measurement.b
    public final int a() {
        MethodCollector.i(380);
        Parcel a2 = a(2, F_());
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.o(380);
        return readInt;
    }

    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        MethodCollector.i(373);
        MethodCollector.o(373);
    }

    @Override // com.google.android.gms.internal.measurement.b
    public final void a(String str, String str2, Bundle bundle, long j2) {
        MethodCollector.i(376);
        Parcel F_ = F_();
        F_.writeString(str);
        F_.writeString(str2);
        z.a(F_, bundle);
        F_.writeLong(j2);
        b(1, F_);
        MethodCollector.o(376);
    }
}
