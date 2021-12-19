package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class w implements Parcelable.Creator<Status> {
    static {
        Covode.recordClassIndex(31345);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i3 = a.d(parcel, readInt);
            } else if (i4 == 2) {
                str = a.f(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) a.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 1000) {
                a.b(parcel, readInt);
            } else {
                i2 = a.d(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new Status(i2, i3, str, pendingIntent);
    }
}
