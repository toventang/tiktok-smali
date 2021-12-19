package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class Seeding {
    @c(a = "shop_wish_list_url")
    private String shopWishListUrl;

    static {
        Covode.recordClassIndex(63073);
    }

    public String getShopWishListUrl() {
        String str = this.shopWishListUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
