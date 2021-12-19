package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class UgNewUser {
    @c(a = "active_time_limit")
    private Integer activeTimeLimit;
    @c(a = "download_time_limit")
    private Integer downloadTimeLimit;

    static {
        Covode.recordClassIndex(63095);
    }

    public Integer getActiveTimeLimit() {
        Integer num = this.activeTimeLimit;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getDownloadTimeLimit() {
        Integer num = this.downloadTimeLimit;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
