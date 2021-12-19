package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PushPrePermissionView {
    @c(a = "toast_text")
    private String toastText;
    @c(a = "toast_title")
    private String toastTitle;

    static {
        Covode.recordClassIndex(63068);
    }

    public String getToastText() {
        return this.toastText;
    }

    public String getToastTitle() {
        return this.toastTitle;
    }
}
