package com.google.android.gms.internal.a;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d extends a implements c {
    static {
        Covode.recordClassIndex(31508);
    }

    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        MethodCollector.i(9627);
        MethodCollector.o(9627);
    }

    @Override // com.google.android.gms.internal.a.c
    public final String a() {
        MethodCollector.i(9628);
        Parcel a2 = a(1, E_());
        String readString = a2.readString();
        a2.recycle();
        MethodCollector.o(9628);
        return readString;
    }

    @Override // com.google.android.gms.internal.a.c
    public final boolean c() {
        MethodCollector.i(9974);
        Parcel a2 = a(6, E_());
        boolean a3 = b.a(a2);
        a2.recycle();
        MethodCollector.o(9974);
        return a3;
    }

    @Override // com.google.android.gms.internal.a.c
    public final boolean b() {
        MethodCollector.i(9804);
        Parcel E_ = E_();
        E_.writeInt(1);
        Parcel a2 = a(2, E_);
        boolean a3 = b.a(a2);
        a2.recycle();
        MethodCollector.o(9804);
        return a3;
    }
}
