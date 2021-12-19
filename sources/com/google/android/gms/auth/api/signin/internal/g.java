package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.p000authapi.n;

public final class g extends com.google.android.gms.common.internal.g<s> {

    /* renamed from: a  reason: collision with root package name */
    public final GoogleSignInOptions f49867a;

    static {
        Covode.recordClassIndex(31121);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final Intent d() {
        return i.a(this.f50357d, this.f49867a);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof s) {
            return queryLocalInterface;
        }
        return new v(iBinder);
    }

    public g(Context context, Looper looper, d dVar, GoogleSignInOptions googleSignInOptions, i.b bVar, i.c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        GoogleSignInOptions.a aVar;
        if (googleSignInOptions != null) {
            aVar = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar = new GoogleSignInOptions.a();
        }
        aVar.f49834f = n.a();
        if (!dVar.f50384c.isEmpty()) {
            for (Scope scope : dVar.f50384c) {
                aVar.a(scope, new Scope[0]);
            }
        }
        this.f49867a = aVar.c();
    }
}
