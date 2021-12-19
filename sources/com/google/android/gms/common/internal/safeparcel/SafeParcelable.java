package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public interface SafeParcelable extends Parcelable {
    static {
        Covode.recordClassIndex(31425);
    }
}
