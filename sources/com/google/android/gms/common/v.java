package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class v implements Parcelable.Creator<zzj> {
    static {
        Covode.recordClassIndex(31481);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i2) {
        return new zzj[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = a.f(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = a.g(parcel, readInt);
            } else if (i2 == 3) {
                z = a.c(parcel, readInt);
            } else if (i2 != 4) {
                a.b(parcel, readInt);
            } else {
                z2 = a.c(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new zzj(str, iBinder, z, z2);
    }
}
