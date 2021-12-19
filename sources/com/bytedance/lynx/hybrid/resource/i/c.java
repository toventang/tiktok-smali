package com.bytedance.lynx.hybrid.resource.i;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f41210a;

    /* renamed from: b  reason: collision with root package name */
    private long f41211b;

    /* renamed from: c  reason: collision with root package name */
    private long f41212c;

    static {
        Covode.recordClassIndex(25245);
    }

    public c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f41210a = uptimeMillis;
        this.f41211b = uptimeMillis;
        this.f41212c = uptimeMillis;
    }

    public final long a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f41211b = uptimeMillis;
        long j2 = uptimeMillis - this.f41212c;
        this.f41212c = uptimeMillis;
        return j2;
    }
}
