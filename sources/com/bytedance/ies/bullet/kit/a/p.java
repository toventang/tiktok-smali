package com.bytedance.ies.bullet.kit.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final long f32295a;

    /* renamed from: b  reason: collision with root package name */
    private long f32296b;

    /* renamed from: c  reason: collision with root package name */
    private long f32297c;

    static {
        Covode.recordClassIndex(18929);
    }

    public final long b() {
        return SystemClock.uptimeMillis() - this.f32295a;
    }

    public p() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f32295a = uptimeMillis;
        this.f32296b = uptimeMillis;
        this.f32297c = uptimeMillis;
    }

    public final long a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f32296b = uptimeMillis;
        long j2 = uptimeMillis - this.f32297c;
        this.f32297c = uptimeMillis;
        return j2;
    }
}
