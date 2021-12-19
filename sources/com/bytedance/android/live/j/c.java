package com.bytedance.android.live.j;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f9916a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9917b;

    static {
        Covode.recordClassIndex(5121);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9916a == cVar.f9916a && this.f9917b == cVar.f9917b;
    }

    public final String toString() {
        return "MicRoomJumpEvent(roomId=" + this.f9916a + ", autoJump=" + this.f9917b + ")";
    }

    public final int hashCode() {
        long j2 = this.f9916a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        boolean z = this.f9917b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public c(long j2, boolean z) {
        this.f9916a = j2;
        this.f9917b = z;
    }
}
