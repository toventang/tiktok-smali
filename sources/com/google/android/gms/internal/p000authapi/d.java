package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.h;

/* renamed from: com.google.android.gms.internal.auth-api.d  reason: invalid package */
public final class d extends p implements c {
    static {
        Covode.recordClassIndex(31517);
    }

    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
        MethodCollector.i(1132);
        MethodCollector.o(1132);
    }

    @Override // com.google.android.gms.internal.p000authapi.c
    public final void a(h hVar, String str) {
        MethodCollector.i(1134);
        Parcel a2 = a();
        q.a(a2, hVar);
        a2.writeString(str);
        a(2, a2);
        MethodCollector.o(1134);
    }

    @Override // com.google.android.gms.internal.p000authapi.c
    public final void a(a aVar, BeginSignInRequest beginSignInRequest) {
        MethodCollector.i(1133);
        Parcel a2 = a();
        q.a(a2, aVar);
        q.a(a2, beginSignInRequest);
        a(1, a2);
        MethodCollector.o(1133);
    }
}
