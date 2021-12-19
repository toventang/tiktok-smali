package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ShareChannelSettings {
    @c(a = "id")
    private String id;

    static {
        Covode.recordClassIndex(63074);
    }

    public String getId() {
        String str = this.id;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
