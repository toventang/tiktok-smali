package com.ss.android.ugc.aweme.ecommerce.ordercenter.event;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public final class j extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86242b = new a((byte) 0);

    static {
        Covode.recordClassIndex(53971);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public j(Integer num) {
        super("tiktokec_ecommerce_centre_entry_click");
        LinkedHashMap<String, Object> linkedHashMap = this.f87523k;
        linkedHashMap.put("button_for", "orders");
        if (num != null && num.intValue() > 0) {
            linkedHashMap.put("copywriting", "review_orders");
            linkedHashMap.put("to_review_cnt", num);
        }
    }
}
