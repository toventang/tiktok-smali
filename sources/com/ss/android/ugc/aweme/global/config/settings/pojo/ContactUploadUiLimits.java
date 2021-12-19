package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class ContactUploadUiLimits {
    @c(a = "max_close_times")
    private Integer maxCloseTimes;
    @c(a = "max_display_times")
    private Integer maxDisplayTimes;

    static {
        Covode.recordClassIndex(63025);
    }

    public Integer getMaxCloseTimes() {
        Integer num = this.maxCloseTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getMaxDisplayTimes() {
        Integer num = this.maxDisplayTimes;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
