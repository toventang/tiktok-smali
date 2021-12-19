package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.h;

/* renamed from: com.google.android.gms.internal.auth-api.c  reason: invalid package */
public interface c extends IInterface {
    static {
        Covode.recordClassIndex(31516);
    }

    void a(h hVar, String str);

    void a(a aVar, BeginSignInRequest beginSignInRequest);
}
