package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final VoucherInfo f84823a;

    static {
        Covode.recordClassIndex(52999);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f84823a, ((d) obj).f84823a);
        }
        return true;
    }

    public final int hashCode() {
        VoucherInfo voucherInfo = this.f84823a;
        if (voucherInfo != null) {
            return voucherInfo.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformCouponVO(voucherInfo=" + this.f84823a + ")";
    }

    public d(VoucherInfo voucherInfo) {
        this.f84823a = voucherInfo;
    }
}
