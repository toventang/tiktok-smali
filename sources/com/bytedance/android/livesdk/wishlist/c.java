package com.bytedance.android.livesdk.wishlist;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f22829a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22830b;

    static {
        Covode.recordClassIndex(13476);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22829a == cVar.f22829a && this.f22830b == cVar.f22830b;
    }

    public final String toString() {
        return "SendGiftSuccessEventData(giftId=" + this.f22829a + ", count=" + this.f22830b + ")";
    }

    public final int hashCode() {
        long j2 = this.f22829a;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f22830b;
    }

    public c(long j2, int i2) {
        this.f22829a = j2;
        this.f22830b = i2;
    }
}
