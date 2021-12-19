package com.ss.android.ugc.aweme.shoutouts.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class g {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f133225a;
    @c(a = "product_detail")

    /* renamed from: b  reason: collision with root package name */
    public final ShoutoutsProduct f133226b;

    static {
        Covode.recordClassIndex(87119);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f133225a == gVar.f133225a && l.a(this.f133226b, gVar.f133226b);
    }

    public final int hashCode() {
        int i2 = this.f133225a * 31;
        ShoutoutsProduct shoutoutsProduct = this.f133226b;
        return i2 + (shoutoutsProduct != null ? shoutoutsProduct.hashCode() : 0);
    }

    public final String toString() {
        return "ShoutoutsProductResp(statusCode=" + this.f133225a + ", productDetail=" + this.f133226b + ")";
    }
}
