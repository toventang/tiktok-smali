package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.a;

public final class b implements Parcelable.Creator<BeginSignInRequest> {
    static {
        Covode.recordClassIndex(31089);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest[] newArray(int i2) {
        return new BeginSignInRequest[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) a.a(parcel, readInt, BeginSignInRequest.PasswordRequestOptions.CREATOR);
            } else if (i2 == 2) {
                googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) a.a(parcel, readInt, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
            } else if (i2 == 3) {
                str = a.f(parcel, readInt);
            } else if (i2 != 4) {
                a.b(parcel, readInt);
            } else {
                z = a.c(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z);
    }
}
