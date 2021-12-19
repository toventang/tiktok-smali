package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class BusinessEC {
    @c(a = "page_eshop_toolbox")
    private String pageEshopToolbox;
    @c(a = "page_home")
    private String pageHome;

    static {
        Covode.recordClassIndex(63018);
    }

    public String getPageEshopToolbox() {
        String str = this.pageEshopToolbox;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getPageHome() {
        String str = this.pageHome;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
