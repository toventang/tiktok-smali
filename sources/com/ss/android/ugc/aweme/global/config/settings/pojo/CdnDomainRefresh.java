package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CdnDomainRefresh {
    @c(a = "keepalive_timeout")
    private Integer keepaliveTimeout;
    @c(a = "refresh_interval")
    private Integer refreshInterval;
    @c(a = "refresh_switch")
    private Boolean refreshSwitch;

    static {
        Covode.recordClassIndex(63021);
    }

    public Integer getKeepaliveTimeout() {
        Integer num = this.keepaliveTimeout;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getRefreshInterval() {
        Integer num = this.refreshInterval;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getRefreshSwitch() {
        Boolean bool = this.refreshSwitch;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
