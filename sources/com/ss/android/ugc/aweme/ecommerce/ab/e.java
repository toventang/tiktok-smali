package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class e {
    @c(a = "pdp_cache_timeout_config")

    /* renamed from: a  reason: collision with root package name */
    public final int f84212a;
    @c(a = "pdp_prefetch_cache_timeout_config")

    /* renamed from: b  reason: collision with root package name */
    public final int f84213b;
    @c(a = "coupon_popup_bg_2x")

    /* renamed from: c  reason: collision with root package name */
    public final String f84214c;
    @c(a = "coupon_popup_bg_3x")

    /* renamed from: d  reason: collision with root package name */
    public final String f84215d;

    static {
        Covode.recordClassIndex(52521);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f84212a == eVar.f84212a && this.f84213b == eVar.f84213b && l.a(this.f84214c, eVar.f84214c) && l.a(this.f84215d, eVar.f84215d);
    }

    public final int hashCode() {
        int i2 = ((this.f84212a * 31) + this.f84213b) * 31;
        String str = this.f84214c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84215d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "EComPdpConfig(cacheTimeout=" + this.f84212a + ", prefetchTimeout=" + this.f84213b + ", couponPopupBg2xUrl=" + this.f84214c + ", couponPopupBg3xUrl=" + this.f84215d + ")";
    }

    private e() {
        this.f84212a = 120;
        this.f84213b = 10;
        this.f84214c = null;
        this.f84215d = null;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
