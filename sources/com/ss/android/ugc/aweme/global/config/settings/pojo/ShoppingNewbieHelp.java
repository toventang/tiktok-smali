package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ShoppingNewbieHelp {
    @c(a = "shop_url")
    private String shopUrl;

    static {
        Covode.recordClassIndex(63078);
    }

    public String getShopUrl() {
        String str = this.shopUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
