package com.ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "video_duration_from")

    /* renamed from: a  reason: collision with root package name */
    public final long f143735a = 0;
    @c(a = "video_duration_to")

    /* renamed from: b  reason: collision with root package name */
    public final long f143736b = 0;
    @c(a = "remain_to_stop")

    /* renamed from: c  reason: collision with root package name */
    public final long f143737c = 10000;
    @c(a = "remain_to_start")

    /* renamed from: d  reason: collision with root package name */
    public final long f143738d = 15000;
    @c(a = "preload_safe_pos_offset")

    /* renamed from: e  reason: collision with root package name */
    public final long f143739e = 0;
    @c(a = "cache_duration")

    /* renamed from: f  reason: collision with root package name */
    public final int f143740f = 15;
    @c(a = "net_speed_factor")

    /* renamed from: g  reason: collision with root package name */
    public final float f143741g = 3.0f;

    static {
        Covode.recordClassIndex(94050);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f143735a == bVar.f143735a && this.f143736b == bVar.f143736b && this.f143737c == bVar.f143737c && this.f143738d == bVar.f143738d && this.f143739e == bVar.f143739e && this.f143740f == bVar.f143740f && Float.compare(this.f143741g, bVar.f143741g) == 0;
    }

    public final String toString() {
        return "BufferThreshold(videoDurationFrom=" + this.f143735a + ", videoDurationTo=" + this.f143736b + ", remainToStop=" + this.f143737c + ", remainToStart=" + this.f143738d + ", preloadSafePosOffset=" + this.f143739e + ", cacheDuration=" + this.f143740f + ", netSpeedFactor=" + this.f143741g + ")";
    }

    private b() {
    }

    public final int hashCode() {
        long j2 = this.f143735a;
        long j3 = this.f143736b;
        long j4 = this.f143737c;
        long j5 = this.f143738d;
        long j6 = this.f143739e;
        return (((((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f143740f) * 31) + Float.floatToIntBits(this.f143741g);
    }
}
