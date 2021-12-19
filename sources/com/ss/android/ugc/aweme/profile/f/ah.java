package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ah {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f116396a;

    /* renamed from: b  reason: collision with root package name */
    public int f116397b;

    /* renamed from: c  reason: collision with root package name */
    public long f116398c;

    /* renamed from: d  reason: collision with root package name */
    public long f116399d;

    /* renamed from: e  reason: collision with root package name */
    public long f116400e;

    /* renamed from: f  reason: collision with root package name */
    public long f116401f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f116402g;

    static {
        Covode.recordClassIndex(75148);
    }

    public ah() {
        this(0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return l.a(this.f116396a, ahVar.f116396a) && this.f116397b == ahVar.f116397b && this.f116398c == ahVar.f116398c && this.f116399d == ahVar.f116399d && this.f116400e == ahVar.f116400e && this.f116401f == ahVar.f116401f && this.f116402g == ahVar.f116402g;
    }

    public final String toString() {
        return "TimeRecorder(isLoadSuccess=" + this.f116396a + ", loadDataCount=" + this.f116397b + ", showFragmentStartAt=" + this.f116398c + ", networkStartAt=" + this.f116399d + ", networkFinishedAt=" + this.f116400e + ", assemStateUpdateFinishedAt=" + this.f116401f + ", isFirstLoad=" + this.f116402g + ")";
    }

    public final long a() {
        long j2 = this.f116399d;
        long j3 = this.f116398c;
        if (1 <= j3 && j2 > j3) {
            return j2 - j3;
        }
        return -1;
    }

    public final long b() {
        long j2 = this.f116400e;
        long j3 = this.f116399d;
        if (1 <= j3 && j2 > j3) {
            return j2 - j3;
        }
        return -1;
    }

    public final long c() {
        long j2 = this.f116401f;
        long j3 = this.f116400e;
        if (1 <= j3 && j2 > j3) {
            return j2 - j3;
        }
        return -1;
    }

    public final long d() {
        long j2 = this.f116398c;
        long j3 = this.f116401f;
        if (1 <= j2 && j3 > j2) {
            return j3 - j2;
        }
        long j4 = this.f116400e;
        if (1 <= j2 && j4 > j2) {
            return j4 - j2;
        }
        return -1;
    }

    public final int hashCode() {
        int i2;
        Boolean bool = this.f116396a;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f116398c;
        long j3 = this.f116399d;
        long j4 = this.f116400e;
        long j5 = this.f116401f;
        int i3 = ((((((((((i2 * 31) + this.f116397b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        boolean z = this.f116402g;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    private ah(long j2) {
        this.f116396a = null;
        this.f116397b = 0;
        this.f116398c = j2;
        this.f116399d = 0;
        this.f116400e = 0;
        this.f116401f = 0;
        this.f116402g = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah(long j2, int i2) {
        this((i2 & 4) != 0 ? 0 : j2);
    }
}
