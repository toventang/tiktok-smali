package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LiveInnerPushConfig {
    @c(a = "live_push_display_intervals")
    private Integer livePushDisplayIntervals = 3;
    @c(a = "live_push_display_unclicked_most_times")
    private Integer livePushDisplayUnclickedMostTimes = 3;
    @c(a = "live_push_most_display_times")
    private Integer livePushMostDisplayTimes = 3;

    static {
        Covode.recordClassIndex(63057);
    }

    public Integer getLivePushDisplayIntervals() {
        return this.livePushDisplayIntervals;
    }

    public Integer getLivePushDisplayUnclickedMostTimes() {
        return this.livePushDisplayUnclickedMostTimes;
    }

    public Integer getLivePushMostDisplayTimes() {
        return this.livePushMostDisplayTimes;
    }

    public LiveInnerPushConfig(Integer num, Integer num2, Integer num3) {
        this.livePushMostDisplayTimes = num;
        this.livePushDisplayUnclickedMostTimes = num2;
        this.livePushDisplayIntervals = num3;
    }
}
