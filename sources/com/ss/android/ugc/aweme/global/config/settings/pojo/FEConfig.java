package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FEConfig {
    @c(a = "fallback_url")
    private String fallbackUrl;
    @c(a = "schema")
    private String schema;

    static {
        Covode.recordClassIndex(63033);
    }

    public String getFallbackUrl() {
        String str = this.fallbackUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getSchema() {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
