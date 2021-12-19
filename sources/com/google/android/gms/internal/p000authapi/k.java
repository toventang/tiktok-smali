package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;

/* renamed from: com.google.android.gms.internal.auth-api.k  reason: invalid package */
public final class k extends g<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f50561a;

    static {
        Covode.recordClassIndex(31524);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final boolean t() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Feature[] o() {
        return l.f50566e;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle p() {
        return this.f50561a;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof c) {
            return queryLocalInterface;
        }
        return new d(iBinder);
    }

    public k(Context context, Looper looper, f fVar, d dVar, e eVar, m mVar) {
        super(context, looper, 212, dVar, eVar, mVar);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", fVar.f49794a);
        this.f50561a = bundle;
    }
}
