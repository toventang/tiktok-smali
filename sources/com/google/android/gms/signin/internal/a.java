package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.signin.d;

public final class a extends g<e> implements d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f52117a;
    private final com.google.android.gms.common.internal.d s;
    private final Bundle t;
    private Integer u;

    static {
        Covode.recordClassIndex(32398);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean i() {
        return this.f52117a;
    }

    @Override // com.google.android.gms.signin.d
    public final void u() {
        try {
            ((e) q()).a(this.u.intValue());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.signin.d
    public final void v() {
        a(new c.d());
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle p() {
        if (!this.f50357d.getPackageName().equals(this.s.f50388g)) {
            this.t.putString("com.google.android.gms.signin.internal.realClientPackageName", this.s.f50388g);
        }
        return this.t;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return queryLocalInterface;
        }
        return new g(iBinder);
    }

    @Override // com.google.android.gms.signin.d
    public final void a(c cVar) {
        Account account;
        r.a(cVar, "Expecting a valid ISignInCallbacks");
        try {
            com.google.android.gms.common.internal.d dVar = this.s;
            if (dVar.f50382a != null) {
                account = dVar.f50382a;
            } else {
                account = new Account("<<default account>>", com.bytedance.ies.xbridge.system.b.a.b.a.f36455d);
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = b.a(this.f50357d).a();
            }
            ((e) q()).a(new zai(new ResolveAccountRequest(account, this.u.intValue(), googleSignInAccount)), cVar);
        } catch (RemoteException e2) {
            try {
                cVar.a(new zak());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    @Override // com.google.android.gms.signin.d
    public final void a(l lVar, boolean z) {
        try {
            ((e) q()).a(lVar, this.u.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r9, android.os.Looper r10, com.google.android.gms.common.internal.d r11, com.google.android.gms.common.api.i.b r12, com.google.android.gms.common.api.i.c r13) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.a.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c):void");
    }

    private a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Bundle bundle, i.b bVar, i.c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f52117a = true;
        this.s = dVar;
        this.t = bundle;
        this.u = dVar.f50392k;
    }
}
