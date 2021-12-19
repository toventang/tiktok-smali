package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "exempt_host")

    /* renamed from: a  reason: collision with root package name */
    public boolean f20637a;
    @c(a = "exempt_current_audience")

    /* renamed from: b  reason: collision with root package name */
    public boolean f20638b;
    @c(a = "exempt_audience_top")

    /* renamed from: c  reason: collision with root package name */
    public int f20639c;

    static {
        Covode.recordClassIndex(12194);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20637a == aVar.f20637a && this.f20638b == aVar.f20638b && this.f20639c == aVar.f20639c;
    }

    public final int hashCode() {
        boolean z = this.f20637a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f20638b) {
            i2 = 0;
        }
        return ((i6 + i2) * 31) + this.f20639c;
    }

    public final String toString() {
        return "ExemptConfig(exemptHost=" + this.f20637a + ", exemptCurrentAudience=" + this.f20638b + ", exemptAudienceTop=" + this.f20639c + ")";
    }
}
