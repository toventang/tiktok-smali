package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public abstract class cb extends bs implements cc {
    static {
        Covode.recordClassIndex(32837);
    }

    public cb() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.b.bs
    public final boolean a(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                int readInt = parcel.readInt();
                bt.a(parcel, Bundle.CREATOR);
                a(readInt);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                bt.a(parcel, Bundle.CREATOR);
                b(readInt2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                bt.a(parcel, Bundle.CREATOR);
                c(readInt3);
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                bt.a(parcel, Bundle.CREATOR);
                b((Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                a((Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                c((Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            default:
                return false;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                d((Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                a((Bundle) bt.a(parcel, Bundle.CREATOR), (Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                b((Bundle) bt.a(parcel, Bundle.CREATOR), (Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                bt.a(parcel, Bundle.CREATOR);
                bt.a(parcel, Bundle.CREATOR);
                a();
                return true;
            case ABRConfig.ABR_SELECT_SCENE:
                bt.a(parcel, Bundle.CREATOR);
                bt.a(parcel, Bundle.CREATOR);
                c();
                return true;
            case 15:
                bt.a(parcel, Bundle.CREATOR);
                b();
                return true;
        }
    }
}
