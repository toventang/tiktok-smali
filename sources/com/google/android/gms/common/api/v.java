package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class v implements Parcelable.Creator<Scope> {
    static {
        Covode.recordClassIndex(31344);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i2) {
        return new Scope[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i3 != 2) {
                a.b(parcel, readInt);
            } else {
                str = a.f(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new Scope(i2, str);
    }
}
