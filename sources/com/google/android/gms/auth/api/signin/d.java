package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public final class d implements Parcelable.Creator<GoogleSignInAccount> {
    static {
        Covode.recordClassIndex(31107);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.d(parcel, readInt);
                    break;
                case 2:
                    str = a.f(parcel, readInt);
                    break;
                case 3:
                    str2 = a.f(parcel, readInt);
                    break;
                case 4:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str4 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    uri = (Uri) a.a(parcel, readInt, Uri.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str5 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    j2 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str6 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    arrayList = a.c(parcel, readInt, Scope.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    str7 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str8 = a.f(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }
}
