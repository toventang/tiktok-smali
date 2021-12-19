package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class c implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    static {
        Covode.recordClassIndex(31117);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable[] newArray(int i2) {
        return new GoogleSignInOptionsExtensionParcelable[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptionsExtensionParcelable createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        int i2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i4 == 2) {
                i3 = a.d(parcel, readInt);
            } else if (i4 != 3) {
                a.b(parcel, readInt);
            } else {
                bundle = a.h(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new GoogleSignInOptionsExtensionParcelable(i2, i3, bundle);
    }
}
