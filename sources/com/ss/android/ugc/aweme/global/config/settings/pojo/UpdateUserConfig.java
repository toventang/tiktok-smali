package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UpdateUserConfig {
    @c(a = "wx_toast_content")
    private String wxToastContent;
    @c(a = "wx_toast_enable")
    private Boolean wxToastEnable;
    @c(a = "wx_toast_frequence")
    private Integer wxToastFrequence;
    @c(a = "wx_toast_position")
    private Integer wxToastPosition;

    static {
        Covode.recordClassIndex(63102);
    }

    public String getWxToastContent() {
        String str = this.wxToastContent;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Boolean getWxToastEnable() {
        Boolean bool = this.wxToastEnable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Integer getWxToastFrequence() {
        Integer num = this.wxToastFrequence;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getWxToastPosition() {
        Integer num = this.wxToastPosition;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
