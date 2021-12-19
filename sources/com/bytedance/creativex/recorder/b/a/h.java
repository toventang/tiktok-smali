package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f28190a;

    /* renamed from: b  reason: collision with root package name */
    public final long f28191b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28192c;

    static {
        Covode.recordClassIndex(16522);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f28190a == hVar.f28190a && this.f28191b == hVar.f28191b && this.f28192c == hVar.f28192c;
    }

    public final int hashCode() {
        long j2 = this.f28190a;
        long j3 = this.f28191b;
        long j4 = this.f28192c;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return "FirstFrameData(frameTimeMillis=" + this.f28190a + ", effectTimeMillis=" + this.f28191b + ", uiCurrentTimeMillis=" + this.f28192c + ")";
    }

    public h(long j2, long j3, long j4) {
        this.f28190a = j2;
        this.f28191b = j3;
        this.f28192c = j4;
    }
}
