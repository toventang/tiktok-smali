package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgFrequentLimit {
    @c(a = "days_no_show")
    private Integer daysNoShow;
    @c(a = "days_window")
    private Integer daysWindow;
    @c(a = "max_close")
    private Integer maxClose;

    static {
        Covode.recordClassIndex(63092);
    }

    public Integer getDaysNoShow() {
        Integer num = this.daysNoShow;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getDaysWindow() {
        Integer num = this.daysWindow;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getMaxClose() {
        Integer num = this.maxClose;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
