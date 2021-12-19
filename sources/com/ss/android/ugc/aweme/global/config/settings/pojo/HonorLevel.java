package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class HonorLevel {
    @c(a = "schema")
    private String schema;

    static {
        Covode.recordClassIndex(63044);
    }

    public String getSchema() {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
