package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ApiConfigEntity {
    @c(a = "api_name")
    private String apiName;
    @c(a = "delay_time")
    private Long delayTime;
    @c(a = "is_banned")
    private Boolean isBanned;

    static {
        Covode.recordClassIndex(63011);
    }

    public String getApiName() {
        return this.apiName;
    }

    public Long getDelayTime() {
        Long l2 = this.delayTime;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Boolean getIsBanned() {
        Boolean bool = this.isBanned;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
