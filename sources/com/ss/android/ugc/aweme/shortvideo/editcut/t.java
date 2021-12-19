package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f128412a;

    /* renamed from: b  reason: collision with root package name */
    public final long f128413b;

    /* renamed from: c  reason: collision with root package name */
    public final long f128414c;

    static {
        Covode.recordClassIndex(84207);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f128412a == tVar.f128412a && this.f128413b == tVar.f128413b && this.f128414c == tVar.f128414c;
    }

    public final String toString() {
        return "RestoreUIConfig(isMulti=" + this.f128412a + ", startTime=" + this.f128413b + ", selectTime=" + this.f128414c + ")";
    }

    public final int hashCode() {
        boolean z = this.f128412a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f128413b;
        long j3 = this.f128414c;
        return (((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public t(boolean z, long j2, long j3) {
        this.f128412a = z;
        this.f128413b = j2;
        this.f128414c = j3;
    }
}
