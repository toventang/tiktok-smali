package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class HotSearchDisplay {
    @c(a = "most_display_times")
    private Integer mostDisplayTimes;
    @c(a = "one_display_intervals")
    private Long oneDisplayIntervals;
    @c(a = "op_most_display_times")
    private Integer opMostDisplayTimes;
    @c(a = "op_one_display_intervals")
    private Long opOneDisplayIntervals;

    static {
        Covode.recordClassIndex(63045);
    }

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Long getOneDisplayIntervals() {
        Long l2 = this.oneDisplayIntervals;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Integer getOpMostDisplayTimes() {
        Integer num = this.opMostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Long getOpOneDisplayIntervals() {
        Long l2 = this.opOneDisplayIntervals;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }
}
