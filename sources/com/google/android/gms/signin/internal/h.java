package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.a;

public final class h implements Parcelable.Creator<zai> {
    static {
        Covode.recordClassIndex(32405);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i2) {
        return new zai[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        int i2 = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i3 != 2) {
                a.b(parcel, readInt);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) a.a(parcel, readInt, ResolveAccountRequest.CREATOR);
            }
        }
        a.k(parcel, a2);
        return new zai(i2, resolveAccountRequest);
    }
}
