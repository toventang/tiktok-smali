package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class VideoAuth {
    @c(a = "auth")
    private String auth;
    @c(a = "code")
    private String code;

    static {
        Covode.recordClassIndex(63110);
    }

    public String getAuth() {
        String str = this.auth;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
