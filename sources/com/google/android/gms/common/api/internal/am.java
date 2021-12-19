package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.signin.internal.zak;

final class am extends av {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ae f50048a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zak f50049b;

    static {
        Covode.recordClassIndex(31229);
    }

    @Override // com.google.android.gms.common.api.internal.av
    public final void a() {
        ae aeVar = this.f50048a;
        zak zak = this.f50049b;
        if (aeVar.b(0)) {
            ConnectionResult connectionResult = zak.f52123a;
            if (connectionResult.b()) {
                ResolveAccountResponse resolveAccountResponse = zak.f52124b;
                ConnectionResult connectionResult2 = resolveAccountResponse.f50324b;
                if (!connectionResult2.b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    Log.wtf("GACConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                    aeVar.b(connectionResult2);
                    return;
                }
                aeVar.f50029g = true;
                aeVar.f50030h = l.a.a(resolveAccountResponse.f50323a);
                aeVar.f50031i = resolveAccountResponse.f50325c;
                aeVar.f50032j = resolveAccountResponse.f50326d;
                aeVar.e();
            } else if (aeVar.a(connectionResult)) {
                aeVar.f();
                aeVar.e();
            } else {
                aeVar.b(connectionResult);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    am(at atVar, ae aeVar, zak zak) {
        super(atVar);
        this.f50048a = aeVar;
        this.f50049b = zak;
    }
}
