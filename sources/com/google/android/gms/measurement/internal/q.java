package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class q implements Parcelable.Creator<zzao> {
    static {
        Covode.recordClassIndex(32377);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao[] newArray(int i2) {
        return new zzao[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzao createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        zzan zzan = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = a.f(parcel, readInt);
            } else if (i2 == 3) {
                zzan = (zzan) a.a(parcel, readInt, zzan.CREATOR);
            } else if (i2 == 4) {
                str2 = a.f(parcel, readInt);
            } else if (i2 != 5) {
                a.b(parcel, readInt);
            } else {
                j2 = a.e(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new zzao(str, zzan, str2, j2);
    }
}
