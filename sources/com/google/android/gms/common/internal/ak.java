package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import com.google.android.gms.internal.e.b;

public final class ak extends b implements aj {
    static {
        Covode.recordClassIndex(31375);
    }

    @Override // com.google.android.gms.common.internal.aj
    public final a a() {
        MethodCollector.i(11718);
        Parcel a2 = a(1, c());
        a a3 = a.AbstractBinderC1201a.a(a2.readStrongBinder());
        a2.recycle();
        MethodCollector.o(11718);
        return a3;
    }

    @Override // com.google.android.gms.common.internal.aj
    public final int b() {
        MethodCollector.i(11719);
        Parcel a2 = a(2, c());
        int readInt = a2.readInt();
        a2.recycle();
        MethodCollector.o(11719);
        return readInt;
    }

    public ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
        MethodCollector.i(11717);
        MethodCollector.o(11717);
    }
}
