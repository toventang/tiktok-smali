package com.google.android.datatransport.runtime.d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class d implements a {
    static {
        Covode.recordClassIndex(30937);
    }

    @Override // com.google.android.datatransport.runtime.d.a
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
