package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.n;

public final class b {
    static {
        Covode.recordClassIndex(31382);
    }

    public static e a(Status status) {
        if (status.b()) {
            return new n(status);
        }
        return new e(status);
    }
}
