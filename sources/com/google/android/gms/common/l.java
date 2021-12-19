package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class l implements Parcelable.Creator<Feature> {
    static {
        Covode.recordClassIndex(31441);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature[] newArray(int i2) {
        return new Feature[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                str = a.f(parcel, readInt);
            } else if (i3 == 2) {
                i2 = a.d(parcel, readInt);
            } else if (i3 != 3) {
                a.b(parcel, readInt);
            } else {
                j2 = a.e(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new Feature(str, i2, j2);
    }
}
