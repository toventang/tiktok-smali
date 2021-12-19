package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.b  reason: invalid package */
public abstract class b extends o implements a {
    static {
        Covode.recordClassIndex(31515);
    }

    public b() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000authapi.o
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        a((Status) q.a(parcel, Status.CREATOR), (BeginSignInResult) q.a(parcel, BeginSignInResult.CREATOR));
        return true;
    }
}
