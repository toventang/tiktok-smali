package com.bytedance.android.livesdk.event;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17179a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17180b;

    static {
        Covode.recordClassIndex(9535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17179a == bVar.f17179a && this.f17180b == bVar.f17180b;
    }

    public final int hashCode() {
        boolean z = this.f17179a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f17180b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "BanTalkData(isBanned=" + this.f17179a + ", isWholeLive=" + this.f17180b + ")";
    }

    public /* synthetic */ b(boolean z) {
        this(z, true);
    }

    public b(boolean z, boolean z2) {
        this.f17179a = z;
        this.f17180b = z2;
    }
}
