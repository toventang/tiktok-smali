package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class k implements Parcelable.Creator<ConnectionResult> {
    static {
        Covode.recordClassIndex(31440);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult[] newArray(int i2) {
        return new ConnectionResult[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = a.d(parcel, readInt);
            } else if (i4 == 2) {
                i3 = a.d(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) a.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                a.b(parcel, readInt);
            } else {
                str = a.f(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new ConnectionResult(i2, i3, pendingIntent, str);
    }
}
