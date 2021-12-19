package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class DownloadDialogSettings {
    @c(a = "is_enable_back_dialog")
    private Integer isEnableBackDialog;

    static {
        Covode.recordClassIndex(63029);
    }

    public Integer getIsEnableBackDialog() {
        Integer num = this.isEnableBackDialog;
        if (num != null) {
            return num;
        }
        throw new a();
    }
}
