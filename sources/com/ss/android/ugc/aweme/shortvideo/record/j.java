package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f130119a = 7;

    /* renamed from: b  reason: collision with root package name */
    public final int f130120b = 30;

    static {
        Covode.recordClassIndex(85367);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f130119a == jVar.f130119a && this.f130120b == jVar.f130120b;
    }

    public final int hashCode() {
        return (this.f130119a * 31) + this.f130120b;
    }

    public final String toString() {
        return "CameraFpsRange(min=" + this.f130119a + ", max=" + this.f130120b + ")";
    }
}
