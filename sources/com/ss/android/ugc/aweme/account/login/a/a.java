package com.ss.android.ugc.aweme.account.login.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f63246a;

    /* renamed from: b  reason: collision with root package name */
    public final long f63247b;

    static {
        Covode.recordClassIndex(38982);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f63246a == aVar.f63246a && this.f63247b == aVar.f63247b;
    }

    public final int hashCode() {
        boolean z = this.f63246a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f63247b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "AnimationContext(shouldAnimate=" + this.f63246a + ", animationDelay=" + this.f63247b + ")";
    }

    public a(boolean z, long j2) {
        this.f63246a = z;
        this.f63247b = j2;
    }
}
