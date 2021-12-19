package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "rating_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f133211a;
    @c(a = "rating_value")

    /* renamed from: b  reason: collision with root package name */
    public final int f133212b;
    @c(a = "rating_text")

    /* renamed from: c  reason: collision with root package name */
    public final String f133213c;
    @c(a = "uid")

    /* renamed from: d  reason: collision with root package name */
    public final String f133214d;
    @c(a = "user_avatar")

    /* renamed from: e  reason: collision with root package name */
    public final String f133215e;
    @c(a = "user_name")

    /* renamed from: f  reason: collision with root package name */
    public final String f133216f;
    @c(a = "created_time")

    /* renamed from: g  reason: collision with root package name */
    public final String f133217g;
    @c(a = "user_verified")

    /* renamed from: h  reason: collision with root package name */
    public final boolean f133218h;
    @c(a = "user_secuid")

    /* renamed from: i  reason: collision with root package name */
    public final String f133219i;

    static {
        Covode.recordClassIndex(87117);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f133211a, eVar.f133211a) && this.f133212b == eVar.f133212b && l.a(this.f133213c, eVar.f133213c) && l.a(this.f133214d, eVar.f133214d) && l.a(this.f133215e, eVar.f133215e) && l.a(this.f133216f, eVar.f133216f) && l.a(this.f133217g, eVar.f133217g) && this.f133218h == eVar.f133218h && l.a(this.f133219i, eVar.f133219i);
    }

    public final int hashCode() {
        String str = this.f133211a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f133212b) * 31;
        String str2 = this.f133213c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f133214d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f133215e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f133216f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f133217g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.f133218h;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str7 = this.f133219i;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ShoutoutsProductRating(ratingId=" + this.f133211a + ", ratingValue=" + this.f133212b + ", ratingText=" + this.f133213c + ", uid=" + this.f133214d + ", userAvatar=" + this.f133215e + ", userName=" + this.f133216f + ", createdTime=" + this.f133217g + ", userVerified=" + this.f133218h + ", userSecUid=" + this.f133219i + ")";
    }
}
