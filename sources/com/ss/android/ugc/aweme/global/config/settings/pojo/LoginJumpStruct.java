package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LoginJumpStruct {
    @c(a = "jump_type")
    private Integer jumpType;
    @c(a = "jump_url")
    private String jumpUrl;
    @c(a = "login_platform")
    private Integer loginPlatform;

    static {
        Covode.recordClassIndex(63060);
    }

    public Integer getJumpType() {
        Integer num = this.jumpType;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getJumpUrl() {
        String str = this.jumpUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getLoginPlatform() {
        Integer num = this.loginPlatform;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
