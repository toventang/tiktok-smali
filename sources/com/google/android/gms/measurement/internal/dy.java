package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.c;

public final class dy extends c<dt> {
    static {
        Covode.recordClassIndex(32192);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.c
    public final int e() {
        return 12451000;
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ dt a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof dt) {
            return queryLocalInterface;
        }
        return new dv(iBinder);
    }

    public dy(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, aVar, bVar);
    }
}
