package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.e.b;
import com.google.android.gms.internal.e.c;

public final class am extends b implements n {
    static {
        Covode.recordClassIndex(31377);
    }

    am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
        MethodCollector.i(10155);
        MethodCollector.o(10155);
    }

    @Override // com.google.android.gms.common.internal.n
    public final void a(int i2, Bundle bundle) {
        MethodCollector.i(10324);
        Parcel c2 = c();
        c2.writeInt(i2);
        c.a(c2, bundle);
        b(2, c2);
        MethodCollector.o(10324);
    }

    @Override // com.google.android.gms.common.internal.n
    public final void a(int i2, IBinder iBinder, Bundle bundle) {
        MethodCollector.i(10323);
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeStrongBinder(iBinder);
        c.a(c2, bundle);
        b(1, c2);
        MethodCollector.o(10323);
    }

    @Override // com.google.android.gms.common.internal.n
    public final void a(int i2, IBinder iBinder, zza zza) {
        MethodCollector.i(10472);
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeStrongBinder(iBinder);
        c.a(c2, zza);
        b(3, c2);
        MethodCollector.o(10472);
    }
}
