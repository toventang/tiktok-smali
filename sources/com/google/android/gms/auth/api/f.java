package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.List;

final class f extends a.AbstractC1206a<g, GoogleSignInOptions> {
    static {
        Covode.recordClassIndex(31079);
    }

    f() {
    }

    @Override // com.google.android.gms.common.api.a.e
    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.a();
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ g a(Context context, Looper looper, d dVar, GoogleSignInOptions googleSignInOptions, i.b bVar, i.c cVar) {
        return new g(context, looper, dVar, googleSignInOptions, bVar, cVar);
    }
}
