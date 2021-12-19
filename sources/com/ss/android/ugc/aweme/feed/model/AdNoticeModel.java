package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AdNoticeModel implements Serializable {
    @c(a = "status_code")
    private final int statusCode;
    @c(a = "status_msg")
    private final String statusMsg = "";
    @c(a = "subscription_status")
    private final int subscriptionStatus;

    static {
        Covode.recordClassIndex(59292);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
}
