package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "creative_id")
    private final Long creativeId;
    @c(a = "is_ad")
    private final boolean isAd;
    @c(a = "log_extra")
    private final String logExtra;

    static {
        Covode.recordClassIndex(45457);
    }

    public static /* synthetic */ a copy$default(a aVar, boolean z, Long l2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = aVar.isAd;
        }
        if ((i2 & 2) != 0) {
            l2 = aVar.creativeId;
        }
        if ((i2 & 4) != 0) {
            str = aVar.logExtra;
        }
        return aVar.copy(z, l2, str);
    }

    public final boolean component1() {
        return this.isAd;
    }

    public final Long component2() {
        return this.creativeId;
    }

    public final String component3() {
        return this.logExtra;
    }

    public final a copy(boolean z, Long l2, String str) {
        return new a(z, l2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.isAd == aVar.isAd && l.a(this.creativeId, aVar.creativeId) && l.a(this.logExtra, aVar.logExtra);
    }

    public final int hashCode() {
        boolean z = this.isAd;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Long l2 = this.creativeId;
        int i6 = 0;
        int hashCode = (i5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.logExtra;
        if (str != null) {
            i6 = str.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "ShopifyPdpAdInfo(isAd=" + this.isAd + ", creativeId=" + this.creativeId + ", logExtra=" + this.logExtra + ")";
    }

    public final Long getCreativeId() {
        return this.creativeId;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final boolean isAd() {
        return this.isAd;
    }

    public a(boolean z, Long l2, String str) {
        this.isAd = z;
        this.creativeId = l2;
        this.logExtra = str;
    }
}
