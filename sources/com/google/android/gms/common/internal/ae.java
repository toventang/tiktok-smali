package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ae implements Parcelable.Creator<zza> {
    static {
        Covode.recordClassIndex(31369);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza[] newArray(int i2) {
        return new zza[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zza createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                bundle = a.h(parcel, readInt);
            } else if (i3 == 2) {
                featureArr = (Feature[]) a.b(parcel, readInt, Feature.CREATOR);
            } else if (i3 != 3) {
                a.b(parcel, readInt);
            } else {
                i2 = a.d(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new zza(bundle, featureArr, i2);
    }
}
