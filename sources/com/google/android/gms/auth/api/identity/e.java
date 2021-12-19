package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.a;

public final class e implements Parcelable.Creator<BeginSignInRequest.PasswordRequestOptions> {
    static {
        Covode.recordClassIndex(31092);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.PasswordRequestOptions[] newArray(int i2) {
        return new BeginSignInRequest.PasswordRequestOptions[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.PasswordRequestOptions createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        boolean z = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.b(parcel, readInt);
            } else {
                z = a.c(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new BeginSignInRequest.PasswordRequestOptions(z);
    }
}
