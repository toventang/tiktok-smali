package com.ss.android.ugc.aweme.ecommerce.coupon.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuVoucher;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, CouponCache> f85753a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final a f85754b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(53627);
    }

    public static int a(String str) {
        l.d(str, "");
        CouponCache couponCache = f85753a.get(str);
        if (couponCache != null) {
            return couponCache.getClaimStatus();
        }
        return -1;
    }

    public static List<String> a(VoucherInfo voucherInfo, SkuVoucher skuVoucher) {
        List<Voucher> vouchers;
        Integer valueOf;
        List<String> bestVoucherTypeIds;
        if (voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : vouchers) {
            T t2 = t;
            if (!(skuVoucher == null || (bestVoucherTypeIds = skuVoucher.getBestVoucherTypeIds()) == null || !bestVoucherTypeIds.contains(t2.getVoucherTypeID()))) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String voucherID = ((Voucher) obj).getVoucherID();
            if (voucherID == null || !hl.a(voucherID)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            CouponCache couponCache = f85753a.get(((Voucher) obj2).getVoucherTypeID());
            if (couponCache == null || (valueOf = Integer.valueOf(couponCache.getClaimStatus())) == null || !(valueOf.intValue() == 3 || valueOf.intValue() == 4)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Voucher> arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
        for (Voucher voucher : arrayList4) {
            arrayList5.add(voucher.getVoucherTypeID());
        }
        return arrayList5;
    }
}
