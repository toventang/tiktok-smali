package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;

public final class kn implements Parcelable.Creator<zzw> {
    static {
        Covode.recordClassIndex(32371);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw[] newArray(int i2) {
        return new zzw[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzw createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str2 = null;
        zzkr zzkr = null;
        String str3 = null;
        zzao zzao = null;
        zzao zzao2 = null;
        zzao zzao3 = null;
        boolean z = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = a.f(parcel, readInt);
                    break;
                case 3:
                    str2 = a.f(parcel, readInt);
                    break;
                case 4:
                    zzkr = (zzkr) a.a(parcel, readInt, zzkr.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    j2 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    z = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    zzao = (zzao) a.a(parcel, readInt, zzao.CREATOR);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    j3 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    zzao2 = (zzao) a.a(parcel, readInt, zzao.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    j4 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    zzao3 = (zzao) a.a(parcel, readInt, zzao.CREATOR);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new zzw(str, str2, zzkr, j2, z, str3, zzao, j3, zzao2, j4, zzao3);
    }
}
