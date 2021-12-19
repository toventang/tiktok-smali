package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CompleteProfilePolicy {
    @c(a = "interval")
    private Integer interval;
    @c(a = "times")
    private Integer times;

    static {
        Covode.recordClassIndex(63024);
    }

    public Integer getInterval() {
        Integer num = this.interval;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getTimes() {
        Integer num = this.times;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
