package com.google.android.gms.internal.b;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;

public abstract class f extends b implements e {
    static {
        Covode.recordClassIndex(31546);
    }

    public f() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.b.b
    public final boolean a(int i2, Parcel parcel) {
        if (i2 != 1) {
            return false;
        }
        a(parcel.readInt() == 0 ? null : Status.CREATOR.createFromParcel(parcel));
        return true;
    }
}
