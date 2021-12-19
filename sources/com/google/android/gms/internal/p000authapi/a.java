package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.a  reason: invalid package */
public interface a extends IInterface {
    static {
        Covode.recordClassIndex(31509);
    }

    void a(Status status, BeginSignInResult beginSignInResult);
}
