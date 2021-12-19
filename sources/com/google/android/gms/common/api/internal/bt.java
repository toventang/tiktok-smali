package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.signin.internal.zak;

final class bt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zak f50115a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ br f50116b;

    static {
        Covode.recordClassIndex(31263);
    }

    public final void run() {
        br brVar = this.f50116b;
        zak zak = this.f50115a;
        ConnectionResult connectionResult = zak.f52123a;
        if (connectionResult.b()) {
            ResolveAccountResponse resolveAccountResponse = zak.f52124b;
            connectionResult = resolveAccountResponse.f50324b;
            if (!connectionResult.b()) {
                String valueOf = String.valueOf(connectionResult);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
            } else {
                brVar.f50110c.a(l.a.a(resolveAccountResponse.f50323a), brVar.f50108a);
                brVar.f50109b.f();
            }
        }
        brVar.f50110c.b(connectionResult);
        brVar.f50109b.f();
    }

    bt(br brVar, zak zak) {
        this.f50116b = brVar;
        this.f50115a = zak;
    }
}
