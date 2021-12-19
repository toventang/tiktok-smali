package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class j implements Parcelable.Creator<IdToken> {
    static {
        Covode.recordClassIndex(31076);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IdToken[] newArray(int i2) {
        return new IdToken[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ IdToken createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.f(parcel, readInt);
            } else if (i2 != 2) {
                a.b(parcel, readInt);
            } else {
                str2 = a.f(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new IdToken(str, str2);
    }
}
