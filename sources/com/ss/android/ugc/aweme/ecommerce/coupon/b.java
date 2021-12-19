package com.ss.android.ugc.aweme.ecommerce.coupon;

import android.content.Context;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.ecommerce.ab.h;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f85755a = a.f85756a;

    static {
        Covode.recordClassIndex(53628);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f85756a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(53629);
        }

        public static void a(Context context, int i2, String str, int i3, String str2, HashMap<String, Object> hashMap, VoucherInfo voucherInfo, Integer num) {
            l.d(context, "");
            l.d(str, "");
            String a2 = h.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", Integer.valueOf(i2));
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("from_type", Integer.valueOf(i3));
            if (str2 != null) {
                linkedHashMap.put("entrance_info", str2);
            }
            if (hashMap != null) {
                linkedHashMap.put("trackParams", hashMap);
            }
            if (voucherInfo != null) {
                linkedHashMap.put("voucher_info", voucherInfo);
            }
            if (num != null) {
                num.intValue();
                linkedHashMap.put("voucher_type", num);
            }
            linkedHashMap.put("height", Integer.valueOf(n.c(d.a(), com.ss.android.ugc.aweme.ecommerce.util.h.a())));
            j.a(context, a2, linkedHashMap, false).open();
        }
    }
}
