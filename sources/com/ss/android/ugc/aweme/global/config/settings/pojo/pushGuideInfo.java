package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class pushGuideInfo {
    @c(a = "close_count_limit")
    private Integer closeCountLimit = 3;
    @c(a = "showup_interval")
    private Integer showupInterval = 15;

    static {
        Covode.recordClassIndex(63117);
    }

    public Integer getCloseCountLimit() {
        return this.closeCountLimit;
    }

    public Integer getShowupInterval() {
        return this.showupInterval;
    }
}
