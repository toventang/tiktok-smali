package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class ShopTab implements Serializable {
    @c(a = "shop_schema")
    public String shopSchema;
    @c(a = "show_shop_tab")
    public boolean showShopTab;

    static {
        Covode.recordClassIndex(75257);
    }
}
