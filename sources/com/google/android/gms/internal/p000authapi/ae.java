package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.a;

/* renamed from: com.google.android.gms.internal.auth-api.ae  reason: invalid package */
public final class ae implements Parcelable.Creator<zzz> {
    static {
        Covode.recordClassIndex(31514);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz[] newArray(int i2) {
        return new zzz[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzz createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                a.b(parcel, readInt);
            } else {
                credential = (Credential) a.a(parcel, readInt, Credential.CREATOR);
            }
        }
        a.k(parcel, a2);
        return new zzz(credential);
    }
}
