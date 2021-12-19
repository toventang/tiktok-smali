package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.n;

public final class u extends r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f49875a;

    static {
        Covode.recordClassIndex(31135);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.o
    public final void b() {
        c();
        p.a(this.f49875a).a();
    }

    private final void c() {
        if (!n.a(this.f49875a, Binder.getCallingUid())) {
            throw new SecurityException(new StringBuilder(52).append("Calling UID ").append(Binder.getCallingUid()).append(" is not Google Play services.").toString());
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.o
    public final void a() {
        boolean z;
        c();
        b a2 = b.a(this.f49875a);
        GoogleSignInAccount a3 = a2.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f49821f;
        if (a3 != null) {
            googleSignInOptions = a2.b();
        }
        GoogleSignInClient googleSignInClient = new GoogleSignInClient(this.f49875a, (GoogleSignInOptions) r.a(googleSignInOptions));
        if (a3 != null) {
            googleSignInClient.b();
            return;
        }
        i iVar = googleSignInClient.f49982g;
        Context context = googleSignInClient.f49976a;
        if (googleSignInClient.a() == GoogleSignInClient.a.f49813c) {
            z = true;
        } else {
            z = false;
        }
        q.a(i.a(iVar, context, z));
    }

    public u(Context context) {
        this.f49875a = context;
    }
}
