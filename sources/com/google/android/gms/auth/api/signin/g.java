package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class g implements Parcelable.Creator<SignInAccount> {
    static {
        Covode.recordClassIndex(31110);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i2) {
        return new SignInAccount[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 4) {
                str = a.f(parcel, readInt);
            } else if (i2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) a.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (i2 != 8) {
                a.b(parcel, readInt);
            } else {
                str2 = a.f(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
