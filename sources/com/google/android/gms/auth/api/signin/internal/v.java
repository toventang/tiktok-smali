package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p000authapi.p;
import com.google.android.gms.internal.p000authapi.q;

public final class v extends p implements s {
    static {
        Covode.recordClassIndex(31136);
    }

    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
        MethodCollector.i(2464);
        MethodCollector.o(2464);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.s
    public final void a(q qVar, GoogleSignInOptions googleSignInOptions) {
        MethodCollector.i(2465);
        Parcel a2 = a();
        q.a(a2, qVar);
        q.a(a2, googleSignInOptions);
        a(102, a2);
        MethodCollector.o(2465);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.s
    public final void b(q qVar, GoogleSignInOptions googleSignInOptions) {
        MethodCollector.i(2467);
        Parcel a2 = a();
        q.a(a2, qVar);
        q.a(a2, googleSignInOptions);
        a(103, a2);
        MethodCollector.o(2467);
    }
}
