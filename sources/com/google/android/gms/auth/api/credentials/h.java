package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.safeparcel.a;

public final class h implements Parcelable.Creator<CredentialRequest> {
    static {
        Covode.recordClassIndex(31074);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest[] newArray(int i2) {
        return new CredentialRequest[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CredentialRequest createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != 1000) {
                switch (i3) {
                    case 1:
                        z = a.c(parcel, readInt);
                        continue;
                    case 2:
                        strArr = a.i(parcel, readInt);
                        continue;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) a.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        continue;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) a.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        continue;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        z2 = a.c(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = a.f(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        str2 = a.f(parcel, readInt);
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        z3 = a.c(parcel, readInt);
                        continue;
                    default:
                        a.b(parcel, readInt);
                        continue;
                }
            } else {
                i2 = a.d(parcel, readInt);
            }
        }
        a.k(parcel, a2);
        return new CredentialRequest(i2, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }
}
