package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.a;

public final class i implements Parcelable.Creator<zak> {
    static {
        Covode.recordClassIndex(32406);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i2) {
        return new zak[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i3 == 2) {
                connectionResult = (ConnectionResult) a.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i3 != 3) {
                a.b(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) a.a(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        a.k(parcel, a2);
        return new zak(i2, connectionResult, resolveAccountResponse);
    }
}
