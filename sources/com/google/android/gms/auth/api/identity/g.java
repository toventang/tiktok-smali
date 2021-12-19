package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;

public final class g implements Parcelable.Creator<SignInCredential> {
    static {
        Covode.recordClassIndex(31095);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInCredential[] newArray(int i2) {
        return new SignInCredential[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInCredential createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = a.f(parcel, readInt);
                    break;
                case 2:
                    str2 = a.f(parcel, readInt);
                    break;
                case 3:
                    str3 = a.f(parcel, readInt);
                    break;
                case 4:
                    str4 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    uri = (Uri) a.a(parcel, readInt, Uri.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str5 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str6 = a.f(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6);
    }
}
