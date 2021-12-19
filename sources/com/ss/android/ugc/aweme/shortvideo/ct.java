package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.b;
import java.io.Serializable;

public final class ct extends BaseResponse implements Serializable {
    @b
    @c(a = "is_passed")
    private Boolean isPassed;
    @c(a = "reason_body")
    private String reasonBody;
    @c(a = "reason_title")
    private String reasonTitle;

    static {
        Covode.recordClassIndex(82273);
    }

    public final String getReasonBody() {
        return this.reasonBody;
    }

    public final String getReasonTitle() {
        return this.reasonTitle;
    }

    public final Boolean isPassed() {
        return this.isPassed;
    }

    public final void setPassed(Boolean bool) {
        this.isPassed = bool;
    }

    public final void setReasonBody(String str) {
        this.reasonBody = str;
    }

    public final void setReasonTitle(String str) {
        this.reasonTitle = str;
    }
}
