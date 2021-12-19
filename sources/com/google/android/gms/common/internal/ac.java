package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ac implements Parcelable.Creator<ResolveAccountRequest> {
    static {
        Covode.recordClassIndex(31367);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest[] newArray(int i2) {
        return new ResolveAccountRequest[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i4 == 2) {
                account = (Account) a.a(parcel, readInt, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = a.d(parcel, readInt);
            } else if (i4 != 4) {
                a.b(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) a.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        a.k(parcel, a2);
        return new ResolveAccountRequest(i2, account, i3, googleSignInAccount);
    }
}
