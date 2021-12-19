package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgUserLimit {
    @c(a = "active_days")
    private Integer activeDays;
    @c(a = "show_for_active")
    private Boolean showForActive;

    static {
        Covode.recordClassIndex(63100);
    }

    public Integer getActiveDays() {
        Integer num = this.activeDays;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Boolean getShowForActive() {
        Boolean bool = this.showForActive;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
