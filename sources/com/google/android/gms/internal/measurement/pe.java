package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class pe extends av implements pb {
    static {
        Covode.recordClassIndex(32064);
    }

    public pe() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.av
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        a((Bundle) z.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
