package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LiveNewAudienceEndModel {
    @c(a = "enable_count_down")
    public int enableCountDown;
    @c(a = "enable")
    public int enableLab;
    @c(a = "count_down_delay_time")
    public int timeCountDown = 3;
    @c(a = "count_down_total_time")
    public int timeJumpRoom = 8;

    static {
        Covode.recordClassIndex(11282);
    }
}
