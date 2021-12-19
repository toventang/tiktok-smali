package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e {
    @c(a = "user")

    /* renamed from: a  reason: collision with root package name */
    public final User f83022a;
    @c(a = "timestamp")

    /* renamed from: b  reason: collision with root package name */
    public final Long f83023b;
    @c(a = "user_amount")

    /* renamed from: c  reason: collision with root package name */
    public final String f83024c;
    @c(a = "tiktok_amount")

    /* renamed from: d  reason: collision with root package name */
    public final String f83025d;
    @c(a = "anonymous")

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f83026e;
    @c(a = "is_top_donor")

    /* renamed from: f  reason: collision with root package name */
    public final boolean f83027f;

    static {
        Covode.recordClassIndex(51763);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f83022a, eVar.f83022a) && l.a(this.f83023b, eVar.f83023b) && l.a(this.f83024c, eVar.f83024c) && l.a(this.f83025d, eVar.f83025d) && l.a(this.f83026e, eVar.f83026e) && this.f83027f == eVar.f83027f;
    }

    public final int hashCode() {
        User user = this.f83022a;
        int i2 = 0;
        int hashCode = (user != null ? user.hashCode() : 0) * 31;
        Long l2 = this.f83023b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f83024c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83025d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f83026e;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z = this.f83027f;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "DonorStruct(user=" + this.f83022a + ", timestamp=" + this.f83023b + ", amount=" + this.f83024c + ", tiktokAmount=" + this.f83025d + ", anonymous=" + this.f83026e + ", isTopDonor=" + this.f83027f + ")";
    }
}
