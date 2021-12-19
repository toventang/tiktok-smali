package com.ss.android.ugc.aweme.ecommerce.sku.model;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87403a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(54894);
    }

    public static String a(Integer num) {
        if (num == null) {
            return "unknow";
        }
        if (num.intValue() == 0) {
            return "select_sku_specs";
        }
        if (num.intValue() == 2) {
            return "add_to_cart";
        }
        if (num.intValue() == 1) {
            return "buy_now";
        }
        if (num.intValue() == 3) {
            return "cart_select_sku_specs";
        }
        return "unknow";
    }
}
