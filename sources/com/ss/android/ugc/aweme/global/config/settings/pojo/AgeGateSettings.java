package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AgeGateSettings {
    @c(a = "initial_date")
    private Integer initialDate;

    static {
        Covode.recordClassIndex(63010);
    }

    public Integer getInitialDate() {
        Integer num = this.initialDate;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
