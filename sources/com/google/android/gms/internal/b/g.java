package com.google.android.gms.internal.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;

public final class g extends com.google.android.gms.common.internal.g<c> {
    static {
        Covode.recordClassIndex(31547);
    }

    public g(Context context, Looper looper, d dVar, i.b bVar, i.c cVar) {
        super(context, looper, 126, dVar, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof c ? queryLocalInterface : new d(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12451000;
    }
}
