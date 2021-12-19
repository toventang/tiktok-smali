package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class c implements Parcelable.Creator<BeginSignInResult> {
    static {
        Covode.recordClassIndex(31090);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInResult[] newArray(int i2) {
        return new BeginSignInResult[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInResult createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) a.a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        a.k(parcel, a2);
        return new BeginSignInResult(pendingIntent);
    }
}
