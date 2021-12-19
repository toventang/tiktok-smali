package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.d.b;
import com.google.android.gms.internal.d.c;

public final class g extends b implements e {
    static {
        Covode.recordClassIndex(32404);
    }

    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
        MethodCollector.i(14215);
        MethodCollector.o(14215);
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void a(int i2) {
        MethodCollector.i(14241);
        Parcel a2 = a();
        a2.writeInt(i2);
        a(7, a2);
        MethodCollector.o(14241);
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void a(zai zai, c cVar) {
        MethodCollector.i(14301);
        Parcel a2 = a();
        a2.writeInt(1);
        zai.writeToParcel(a2, 0);
        c.a(a2, cVar);
        a(12, a2);
        MethodCollector.o(14301);
    }

    @Override // com.google.android.gms.signin.internal.e
    public final void a(l lVar, int i2, boolean z) {
        MethodCollector.i(14272);
        Parcel a2 = a();
        c.a(a2, lVar);
        a2.writeInt(i2);
        a2.writeInt(z ? 1 : 0);
        a(9, a2);
        MethodCollector.o(14272);
    }
}
