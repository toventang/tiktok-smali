package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public final class f implements Parcelable.Creator<Credential> {
    static {
        Covode.recordClassIndex(31072);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential[] newArray(int i2) {
        return new Credential[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
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
                    uri = (Uri) a.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = a.c(parcel, readInt, IdToken.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str4 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                default:
                    a.b(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str5 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str6 = a.f(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }
}
