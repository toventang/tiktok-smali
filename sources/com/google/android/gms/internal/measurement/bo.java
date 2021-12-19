package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;

final class bo extends ContentObserver {
    static {
        Covode.recordClassIndex(31681);
    }

    bo() {
        super(null);
    }

    public final void onChange(boolean z) {
        br.f50719c.incrementAndGet();
    }
}
