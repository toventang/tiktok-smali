package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public abstract class ar extends bs implements as {
    static {
        Covode.recordClassIndex(32799);
    }

    public ar() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.b.bs
    public final boolean a(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                a(parcel.readInt(), (Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                bt.a(parcel, Bundle.CREATOR);
                a(readInt);
                return true;
            case 4:
                b(parcel.readInt(), (Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                c(parcel.readInt(), (Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                a((Bundle) bt.a(parcel, Bundle.CREATOR));
                return true;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                parcel.createTypedArrayList(Bundle.CREATOR);
                a();
                return true;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                b();
                return true;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                c();
                return true;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                g();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                bt.a(parcel, Bundle.CREATOR);
                f();
                return true;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                bt.a(parcel, Bundle.CREATOR);
                d();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                bt.a(parcel, Bundle.CREATOR);
                e();
                return true;
            default:
                return false;
        }
    }
}
