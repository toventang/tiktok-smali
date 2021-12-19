package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public final class e implements Parcelable.Creator<WakeLockEvent> {
    static {
        Covode.recordClassIndex(31455);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WakeLockEvent createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.d(parcel, readInt);
                    break;
                case 2:
                    j2 = a.e(parcel, readInt);
                    break;
                case 3:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                default:
                    a.b(parcel, readInt);
                    break;
                case 4:
                    str = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    i4 = a.d(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    arrayList = a.j(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    j3 = a.e(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    i3 = a.d(parcel, readInt);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str2 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    str4 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_SELECT_SCENE:
                    i5 = a.d(parcel, readInt);
                    break;
                case 15:
                    a.a(parcel, readInt, 4);
                    f2 = parcel.readFloat();
                    break;
                case 16:
                    j4 = a.e(parcel, readInt);
                    break;
                case 17:
                    str5 = a.f(parcel, readInt);
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    z = a.c(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new WakeLockEvent(i2, j2, i3, str, i4, arrayList, str2, j3, i5, str3, str4, f2, j4, str5, z);
    }
}
