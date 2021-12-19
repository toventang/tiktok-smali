package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;

final class bd extends ContentObserver {
    static {
        Covode.recordClassIndex(31670);
    }

    bd() {
        super(null);
    }

    public final void onChange(boolean z) {
        bb.f50684d.set(true);
    }
}
