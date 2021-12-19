package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.ac  reason: invalid package */
public final class ac extends p implements ad {
    static {
        Covode.recordClassIndex(31512);
    }

    ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        MethodCollector.i(1650);
        MethodCollector.o(1650);
    }

    @Override // com.google.android.gms.internal.p000authapi.ad
    public final void a(ab abVar, CredentialRequest credentialRequest) {
        MethodCollector.i(1657);
        Parcel a2 = a();
        q.a(a2, abVar);
        q.a(a2, credentialRequest);
        a(1, a2);
        MethodCollector.o(1657);
    }

    @Override // com.google.android.gms.internal.p000authapi.ad
    public final void a(ab abVar, zzz zzz) {
        MethodCollector.i(1661);
        Parcel a2 = a();
        q.a(a2, abVar);
        q.a(a2, zzz);
        a(2, a2);
        MethodCollector.o(1661);
    }
}
