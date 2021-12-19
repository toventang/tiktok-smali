package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class WikipediaExtra implements Serializable {
    @c(a = "language")
    private String language = "";
    @c(a = "review_status")
    private Integer status = 0;
    @c(a = "warning_msg")
    private String warningMsg = "";

    static {
        Covode.recordClassIndex(59475);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setWarningMsg(String str) {
        this.warningMsg = str;
    }
}
