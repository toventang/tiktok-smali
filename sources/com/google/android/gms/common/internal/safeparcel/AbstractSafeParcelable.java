package com.google.android.gms.common.internal.safeparcel;

import com.bytedance.covode.number.Covode;

public abstract class AbstractSafeParcelable implements SafeParcelable {
    static {
        Covode.recordClassIndex(31424);
    }

    public final int describeContents() {
        return 0;
    }
}
