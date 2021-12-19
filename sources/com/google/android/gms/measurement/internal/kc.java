package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import com.ss.android.ugc.playerkit.model.v;
import java.util.ArrayList;

public final class kc implements Parcelable.Creator<zzn> {
    static {
        Covode.recordClassIndex(32360);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i2) {
        return new zzn[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn createFromParcel(Parcel parcel) {
        boolean z;
        int a2 = a.a(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j7 = -2147483648L;
        boolean z2 = true;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
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
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str4 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    j2 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    j3 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str5 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    z2 = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    z3 = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    j7 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str6 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    j4 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    j5 = a.e(parcel, readInt);
                    break;
                case 15:
                    i2 = a.d(parcel, readInt);
                    break;
                case 16:
                    z4 = a.c(parcel, readInt);
                    break;
                case 17:
                    z5 = a.c(parcel, readInt);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    z6 = a.c(parcel, readInt);
                    break;
                case 19:
                    str7 = a.f(parcel, readInt);
                    break;
                case v.U /*{ENCODED_INT: 20}*/:
                default:
                    a.b(parcel, readInt);
                    break;
                case 21:
                    int a3 = a.a(parcel, readInt);
                    if (a3 != 0) {
                        a.b(parcel, a3, 4);
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bool = Boolean.valueOf(z);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j6 = a.e(parcel, readInt);
                    break;
                case 23:
                    arrayList = a.j(parcel, readInt);
                    break;
                case 24:
                    str8 = a.f(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new zzn(str, str2, str3, str4, j2, j3, str5, z2, z3, j7, str6, j4, j5, i2, z4, z5, z6, str7, bool, j6, arrayList, str8);
    }
}
