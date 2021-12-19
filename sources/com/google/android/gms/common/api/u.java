package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;

public final class u extends UnsupportedOperationException {
    private final Feature zzbj;

    static {
        Covode.recordClassIndex(31343);
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.zzbj);
        return new StringBuilder(String.valueOf(valueOf).length() + 8).append("Missing ").append(valueOf).toString();
    }

    public u(Feature feature) {
        this.zzbj = feature;
    }
}
