package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class o implements Parcelable.Creator<zzan> {
    static {
        Covode.recordClassIndex(32375);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan[] newArray(int i2) {
        return new zzan[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzan createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                a.b(parcel, readInt);
            } else {
                bundle = a.h(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new zzan(bundle);
    }
}
