package com.bytedance.b.g.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f26254a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26255b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26256c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26257d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26258e;

    /* renamed from: f  reason: collision with root package name */
    private double f26259f;

    static {
        Covode.recordClassIndex(15247);
    }

    public final double a() {
        double d2 = this.f26259f;
        if (d2 > 0.5d) {
            return d2;
        }
        return 0.8d;
    }

    public final String toString() {
        return "MemoryConfig{memoryCollectionInterval=" + this.f26254a + ", memoryTopCheckThreshold=" + this.f26259f + ", isStopWhenBackground=" + this.f26255b + ", isRealTimeMemEnable=" + this.f26256c + ", isUploadEnable=" + this.f26257d + ", isApm6SampleEnable=" + this.f26258e + '}';
    }

    public a(long j2, double d2, boolean z, boolean z2) {
        if (j2 <= 0) {
            this.f26254a = 120;
        } else {
            this.f26254a = j2;
        }
        this.f26259f = d2;
        this.f26258e = z2;
        this.f26255b = false;
        this.f26256c = false;
        this.f26257d = z;
    }
}
