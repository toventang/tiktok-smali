package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class MpTab {
    @c(a = "publish")
    private String publish;

    static {
        Covode.recordClassIndex(63061);
    }

    public String getPublish() {
        String str = this.publish;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
