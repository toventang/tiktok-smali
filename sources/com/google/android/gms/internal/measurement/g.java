package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;

public final class g implements Parcelable.Creator<zzae> {
    static {
        Covode.recordClassIndex(31807);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i2) {
        return new zzae[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        long j2 = 0;
        long j3 = 0;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j2 = a.e(parcel, readInt);
                    break;
                case 2:
                    j3 = a.e(parcel, readInt);
                    break;
                case 3:
                    z = a.c(parcel, readInt);
                    break;
                case 4:
                    str = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str2 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    bundle = a.h(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new zzae(j2, j3, z, str, str2, str3, bundle);
    }
}
