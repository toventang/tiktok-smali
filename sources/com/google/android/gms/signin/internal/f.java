package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.d.a;
import com.google.android.gms.internal.d.c;

public abstract class f extends a implements c {
    static {
        Covode.recordClassIndex(32403);
    }

    public f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.d.a
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 3) {
            c.a(parcel, ConnectionResult.CREATOR);
            c.a(parcel, zab.CREATOR);
        } else if (i2 == 4) {
            c.a(parcel, Status.CREATOR);
        } else if (i2 == 6) {
            c.a(parcel, Status.CREATOR);
        } else if (i2 == 7) {
            c.a(parcel, Status.CREATOR);
            c.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i2 != 8) {
            return false;
        } else {
            a((zak) c.a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
