package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;

public final class af implements Parcelable.Creator<GetServiceRequest> {
    static {
        Covode.recordClassIndex(31370);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i2) {
        return new GetServiceRequest[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.d(parcel, readInt);
                    break;
                case 2:
                    i3 = a.d(parcel, readInt);
                    break;
                case 3:
                    i4 = a.d(parcel, readInt);
                    break;
                case 4:
                    str = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    iBinder = a.g(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    scopeArr = (Scope[]) a.b(parcel, readInt, Scope.CREATOR);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    bundle = a.h(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    account = (Account) a.a(parcel, readInt, Account.CREATOR);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                default:
                    a.b(parcel, readInt);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    featureArr = (Feature[]) a.b(parcel, readInt, Feature.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    featureArr2 = (Feature[]) a.b(parcel, readInt, Feature.CREATOR);
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    z = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    i5 = a.d(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new GetServiceRequest(i2, i3, i4, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i5);
    }
}
