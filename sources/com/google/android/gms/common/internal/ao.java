package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.a;
import com.google.android.gms.common.zzj;
import com.google.android.gms.internal.e.b;
import com.google.android.gms.internal.e.c;

public final class ao extends b implements an {
    static {
        Covode.recordClassIndex(31379);
    }

    public ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
        MethodCollector.i(11555);
        MethodCollector.o(11555);
    }

    @Override // com.google.android.gms.common.internal.an
    public final boolean a(zzj zzj, a aVar) {
        boolean z;
        MethodCollector.i(11556);
        Parcel c2 = c();
        c.a(c2, zzj);
        c.a(c2, aVar);
        Parcel a2 = a(5, c2);
        if (a2.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        a2.recycle();
        MethodCollector.o(11556);
        return z;
    }
}
