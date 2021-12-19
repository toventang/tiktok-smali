package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.av;
import com.google.android.gms.internal.measurement.z;
import java.util.List;

public abstract class ds extends av implements dt {
    static {
        Covode.recordClassIndex(32186);
    }

    public ds() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.av
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        switch (i2) {
            case 1:
                a((zzao) z.a(parcel, zzao.CREATOR), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((zzkr) z.a(parcel, zzkr.CREATOR), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            default:
                return false;
            case 4:
                a((zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                a((zzao) z.a(parcel, zzao.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                b((zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                List<zzkr> a2 = a((zzn) z.a(parcel, zzn.CREATOR), z.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a2);
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                byte[] a3 = a((zzao) z.a(parcel, zzao.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a3);
                return true;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                String c2 = c((zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c2);
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                a((zzw) z.a(parcel, zzw.CREATOR), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                a((zzw) z.a(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_SELECT_SCENE:
                List<zzkr> a4 = a(parcel.readString(), parcel.readString(), z.a(parcel), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                return true;
            case 15:
                List<zzkr> a5 = a(parcel.readString(), parcel.readString(), parcel.readString(), z.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                return true;
            case 16:
                List<zzw> a6 = a(parcel.readString(), parcel.readString(), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                return true;
            case 17:
                List<zzw> a7 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a7);
                return true;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                d((zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                a((Bundle) z.a(parcel, Bundle.CREATOR), (zzn) z.a(parcel, zzn.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
