package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public final class f implements Parcelable.Creator<GoogleSignInOptions> {
    static {
        Covode.recordClassIndex(31109);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i2) {
        return new GoogleSignInOptions[i2];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int a2 = a.a(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = a.d(parcel, readInt);
                    break;
                case 2:
                    arrayList = a.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) a.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    z2 = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    z3 = a.c(parcel, readInt);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str2 = a.f(parcel, readInt);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    arrayList2 = a.c(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str3 = a.f(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        a.k(parcel, a2);
        return new GoogleSignInOptions(i2, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }
}
