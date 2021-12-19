package com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(53651);
    }

    public static final Voucher a(VoucherInfo voucherInfo) {
        l.d(voucherInfo, "");
        List<Voucher> vouchers = voucherInfo.getVouchers();
        T t = null;
        if (vouchers == null) {
            return null;
        }
        Iterator<T> it = vouchers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (l.a((Object) next.getSelected(), (Object) true)) {
                t = next;
                break;
            }
        }
        return t;
    }
}
