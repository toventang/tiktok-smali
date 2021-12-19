package com.ss.android.ugc.aweme.ecommerce.coupon.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f85757a;

    /* renamed from: b  reason: collision with root package name */
    public int f85758b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final Voucher f85759c;

    static {
        Covode.recordClassIndex(53630);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f85759c, ((a) obj).f85759c);
        }
        return true;
    }

    public final int hashCode() {
        Voucher voucher = this.f85759c;
        if (voucher != null) {
            return voucher.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CouponModel(voucherAttached=" + this.f85759c + ")";
    }

    public a(Voucher voucher) {
        l.d(voucher, "");
        this.f85759c = voucher;
    }
}
