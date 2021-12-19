package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AdCouponConfig {
    @c(a = "show")
    private Integer show;

    static {
        Covode.recordClassIndex(63007);
    }

    public Integer getShow() {
        Integer num = this.show;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
