package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.android.gms.common.api.j;

public interface a extends j<f> {
    static {
        Covode.recordClassIndex(31088);
    }

    SignInCredential a(Intent intent);

    h<Void> a();

    h<BeginSignInResult> a(BeginSignInRequest beginSignInRequest);
}
