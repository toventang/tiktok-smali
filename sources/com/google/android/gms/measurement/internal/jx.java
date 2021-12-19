package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;

public final class jx implements Parcelable.Creator<zzkr> {
    static {
        Covode.recordClassIndex(32354);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkr[] newArray(int i2) {
        return new zzkr[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzkr createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
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
                    j2 = a.e(parcel, readInt);
                    break;
                case 4:
                    int a3 = a.a(parcel, readInt);
                    if (a3 != 0) {
                        a.b(parcel, a3, 8);
                        l2 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l2 = null;
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int a4 = a.a(parcel, readInt);
                    if (a4 != 0) {
                        a.b(parcel, a4, 4);
                        f2 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f2 = null;
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str2 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    int a5 = a.a(parcel, readInt);
                    if (a5 != 0) {
                        a.b(parcel, a5, 8);
                        d2 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d2 = null;
                        break;
                    }
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new zzkr(i2, str, j2, l2, f2, str2, str3, d2);
    }
}
