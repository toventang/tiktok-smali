package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.aa  reason: invalid package */
public abstract class aa extends o implements ab {
    static {
        Covode.recordClassIndex(31510);
    }

    public aa() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p000authapi.o
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            a((Status) q.a(parcel, Status.CREATOR), (Credential) q.a(parcel, Credential.CREATOR));
        } else if (i2 == 2) {
            a((Status) q.a(parcel, Status.CREATOR));
        } else if (i2 != 3) {
            return false;
        } else {
            q.a(parcel, Status.CREATOR);
            parcel.readString();
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
