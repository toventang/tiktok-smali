package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class jq extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(31914);
    }

    jq(int i2, int i3) {
        super(new StringBuilder(54).append("Unpaired surrogate at index ").append(i2).append(" of ").append(i3).toString());
    }
}
