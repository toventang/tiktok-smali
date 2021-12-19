package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "banner_schema_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f82956a;
    @c(a = "banner_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f82957b;

    static {
        Covode.recordClassIndex(51726);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f82956a, aVar.f82956a) && l.a(this.f82957b, aVar.f82957b);
    }

    public final int hashCode() {
        String str = this.f82956a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f82957b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BannerStruct(bannerSiteUrl=" + this.f82956a + ", bannerImageUrl=" + this.f82957b + ")";
    }
}
