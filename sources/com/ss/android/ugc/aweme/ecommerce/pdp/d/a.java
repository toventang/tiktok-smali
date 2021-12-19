package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f86445a;

    /* renamed from: b  reason: collision with root package name */
    public final SellerInfo f86446b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f86447c;

    static {
        Covode.recordClassIndex(54147);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86445a == aVar.f86445a && l.a(this.f86446b, aVar.f86446b) && l.a(this.f86447c, aVar.f86447c);
    }

    public final int hashCode() {
        int i2 = this.f86445a * 31;
        SellerInfo sellerInfo = this.f86446b;
        int i3 = 0;
        int hashCode = (i2 + (sellerInfo != null ? sellerInfo.hashCode() : 0)) * 31;
        Boolean bool = this.f86447c;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "BottomBarVO(status=" + this.f86445a + ", sellerInfo=" + this.f86446b + ", isCouponPriceShowed=" + this.f86447c + ")";
    }

    public a(int i2, SellerInfo sellerInfo, Boolean bool) {
        this.f86445a = i2;
        this.f86446b = sellerInfo;
        this.f86447c = bool;
    }
}
