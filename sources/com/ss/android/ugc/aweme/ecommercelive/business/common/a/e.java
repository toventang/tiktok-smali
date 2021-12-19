package com.ss.android.ugc.aweme.ecommercelive.business.common.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import h.f.b.l;

public final class e {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public final GImage f87972a;
    @c(a = "promotion_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f87973b;

    static {
        Covode.recordClassIndex(55304);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f87972a, eVar.f87972a) && l.a(this.f87973b, eVar.f87973b);
    }

    public final int hashCode() {
        GImage gImage = this.f87972a;
        int i2 = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        String str = this.f87973b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PromotionSkin(image=" + this.f87972a + ", promotionId=" + this.f87973b + ")";
    }
}
