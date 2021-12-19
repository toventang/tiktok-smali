package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LinkPlan {
    @c(a = "info")
    private String info;
    @c(a = "publish")
    private String publish;
    @c(a = "settings")
    private String settings;

    static {
        Covode.recordClassIndex(63054);
    }

    public String getInfo() {
        String str = this.info;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getPublish() {
        String str = this.publish;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getSettings() {
        String str = this.settings;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
