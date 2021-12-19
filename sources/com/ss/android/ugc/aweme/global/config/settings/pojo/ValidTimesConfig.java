package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ValidTimesConfig {
    @c(a = "end_time")
    private Long endTime = 0L;
    @c(a = "start_time")
    private Long startTime = 0L;

    static {
        Covode.recordClassIndex(63108);
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Long getStartTime() {
        return this.startTime;
    }
}
