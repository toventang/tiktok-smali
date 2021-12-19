package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.a;

public final class p implements Parcelable.Creator<RemoteMessage> {
    static {
        Covode.recordClassIndex(33896);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoteMessage[] newArray(int i2) {
        return new RemoteMessage[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                a.b(parcel, readInt);
            } else {
                bundle = a.h(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new RemoteMessage(bundle);
    }
}
