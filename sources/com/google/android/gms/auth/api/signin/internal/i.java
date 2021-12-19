package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.a.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static a f49868a = new a("GoogleSignInCommon");

    static {
        Covode.recordClassIndex(31123);
    }

    public static void a(Context context) {
        p.a(context).a();
        for (com.google.android.gms.common.api.i iVar : com.google.android.gms.common.api.i.a()) {
            iVar.d();
        }
        f.b();
    }

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f49868a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static k<Status> a(com.google.android.gms.common.api.i iVar, Context context, boolean z) {
        f49868a.a("Signing out", new Object[0]);
        a(context);
        if (z) {
            return l.a(Status.f49960a, iVar);
        }
        return iVar.b(new j(iVar));
    }
}
