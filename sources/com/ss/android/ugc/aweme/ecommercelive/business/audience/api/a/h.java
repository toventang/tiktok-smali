package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import h.f.b.l;

public final class h {
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public final GImage f87778a;
    @c(a = "promotion_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f87779b;

    static {
        Covode.recordClassIndex(55205);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f87778a, hVar.f87778a) && l.a(this.f87779b, hVar.f87779b);
    }

    public final int hashCode() {
        GImage gImage = this.f87778a;
        int i2 = 0;
        int hashCode = (gImage != null ? gImage.hashCode() : 0) * 31;
        String str = this.f87779b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PromotionLogo(image=" + this.f87778a + ", promotionId=" + this.f87779b + ")";
    }
}
