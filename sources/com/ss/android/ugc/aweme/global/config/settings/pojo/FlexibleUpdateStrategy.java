package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FlexibleUpdateStrategy {
    @c(a = "allow_show_all_times")
    private Integer allowShowAllTimes = 0;
    @c(a = "interval_days")
    private Integer intervalDays = 0;

    static {
        Covode.recordClassIndex(63036);
    }

    public Integer getAllowShowAllTimes() {
        return this.allowShowAllTimes;
    }

    public Integer getIntervalDays() {
        return this.intervalDays;
    }
}
