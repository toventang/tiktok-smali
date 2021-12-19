package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class aq implements Parcelable.Creator<zzs> {
    static {
        Covode.recordClassIndex(31381);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs[] newArray(int i2) {
        return new zzs[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.b(parcel, readInt);
            } else {
                i2 = a.d(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new zzs(i2);
    }
}
