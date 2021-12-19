package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public final class d implements Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> {
    static {
        Covode.recordClassIndex(31091);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.GoogleIdTokenRequestOptions[] newArray(int i2) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInRequest.GoogleIdTokenRequestOptions createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList<String> arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = a.c(parcel, readInt);
                    break;
                case 2:
                    str = a.f(parcel, readInt);
                    break;
                case 3:
                    str2 = a.f(parcel, readInt);
                    break;
                case 4:
                    z2 = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    arrayList = a.j(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z, str, str2, z2, str3, arrayList);
    }
}
