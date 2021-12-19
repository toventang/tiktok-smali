package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class LiveLabelDisplaySettings {
    @c(a = "display_duration")
    private Long displayDuration;
    @c(a = "display_intervals")
    private Long displayIntervals;
    @c(a = "most_display_times")
    private Integer mostDisplayTimes;

    static {
        Covode.recordClassIndex(63058);
    }

    public Long getDisplayDuration() {
        Long l2 = this.displayDuration;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Long getDisplayIntervals() {
        Long l2 = this.displayIntervals;
        if (l2 != null) {
            return l2;
        }
        throw new a();
    }

    public Integer getMostDisplayTimes() {
        Integer num = this.mostDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
