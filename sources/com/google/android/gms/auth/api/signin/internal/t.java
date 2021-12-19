package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.o;
import com.google.android.gms.internal.p000authapi.q;

public abstract class t extends o implements q {
    static {
        Covode.recordClassIndex(31134);
    }

    public t() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.o
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 101:
                q.a(parcel, GoogleSignInAccount.CREATOR);
                q.a(parcel, Status.CREATOR);
                a();
                break;
            case 102:
                a((Status) q.a(parcel, Status.CREATOR));
                break;
            case 103:
                b((Status) q.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
