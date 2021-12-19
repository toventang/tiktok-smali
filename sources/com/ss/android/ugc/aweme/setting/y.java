package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class y {
    @c(a = "promotion_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f123069a;
    @c(a = "enable_video_gift")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f123070b;
    @c(a = "privacy_url")

    /* renamed from: c  reason: collision with root package name */
    public final bn f123071c;

    static {
        Covode.recordClassIndex(80830);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return l.a(this.f123069a, yVar.f123069a) && this.f123070b == yVar.f123070b && l.a(this.f123071c, yVar.f123071c);
    }

    public final int hashCode() {
        String str = this.f123069a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f123070b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        bn bnVar = this.f123071c;
        if (bnVar != null) {
            i2 = bnVar.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "GiftSettings(promotionUrl=" + this.f123069a + ", enableVideoGift=" + this.f123070b + ", privacyUrls=" + this.f123071c + ")";
    }
}
