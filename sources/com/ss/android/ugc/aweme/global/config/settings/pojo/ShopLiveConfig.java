package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ShopLiveConfig {
    @c(a = "merch_picker_url")
    private String merchPickerUrl;

    static {
        Covode.recordClassIndex(63075);
    }

    public String getMerchPickerUrl() {
        String str = this.merchPickerUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
