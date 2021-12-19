package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final g f50507a = new g();

    private g() {
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.e
    public final long c() {
        return System.nanoTime();
    }

    static {
        Covode.recordClassIndex(31469);
    }
}
