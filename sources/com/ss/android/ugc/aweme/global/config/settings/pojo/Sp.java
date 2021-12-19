package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class Sp {
    @c(a = "estr")
    private String estr;

    static {
        Covode.recordClassIndex(63080);
    }

    public String getEstr() {
        String str = this.estr;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
