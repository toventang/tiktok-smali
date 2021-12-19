package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class BindWindowsStruct {
    @c(a = "bind_desc")
    private String bindDesc;
    @c(a = "bind_title")
    private String bindTitle;
    @c(a = "interval")
    private Integer interval;
    @c(a = "login_platform")
    private Integer loginPlatform;
    @c(a = "open_window")
    private Boolean openWindow;
    @c(a = "total_times")
    private Integer totalTimes;

    static {
        Covode.recordClassIndex(63016);
    }

    public String getBindDesc() {
        String str = this.bindDesc;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getBindTitle() {
        String str = this.bindTitle;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
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

    public Boolean getOpenWindow() {
        Boolean bool = this.openWindow;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getTotalTimes() {
        Integer num = this.totalTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
