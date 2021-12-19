package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class TCMInfo implements Serializable {
    @c(a = "review_status")
    private Integer reviewStatus = 0;

    static {
        Covode.recordClassIndex(59456);
    }

    public final Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public final void setReviewStatus(Integer num) {
        this.reviewStatus = num;
    }
}
