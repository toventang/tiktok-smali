package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ad implements Parcelable.Creator<ResolveAccountResponse> {
    static {
        Covode.recordClassIndex(31368);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse[] newArray(int i2) {
        return new ResolveAccountResponse[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i3 == 2) {
                iBinder = a.g(parcel, readInt);
            } else if (i3 == 3) {
                connectionResult = (ConnectionResult) a.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (i3 == 4) {
                z = a.c(parcel, readInt);
            } else if (i3 != 5) {
                a.b(parcel, readInt);
            } else {
                z2 = a.c(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new ResolveAccountResponse(i2, iBinder, connectionResult, z, z2);
    }
}
