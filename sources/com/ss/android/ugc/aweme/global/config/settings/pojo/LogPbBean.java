package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LogPbBean {
    @c(a = "impr_id")
    private String imprId;

    static {
        Covode.recordClassIndex(63059);
    }

    public String getImprId() {
        String str = this.imprId;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
