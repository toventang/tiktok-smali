package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class SubscribeInfo {
    @c(a = "enable_subscription")
    boolean anchorEnableSubscription;
    @c(a = "qualification")
    boolean isAnchorQualified;
    @c(a = "is_subscribe")
    boolean isSubscribed;
    @c(a = "badge")
    SubscribeBadge subscribeBadge;
    @c(a = "subscriber_count")
    int subscriberCount;

    static {
        Covode.recordClassIndex(3627);
    }

    public SubscribeBadge getSubscribeBadge() {
        return this.subscribeBadge;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public boolean isAnchorQualified() {
        return this.isAnchorQualified;
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public void setAnchorQualified(boolean z) {
        this.isAnchorQualified = z;
    }

    public void setSubscribeBadge(SubscribeBadge subscribeBadge2) {
        this.subscribeBadge = subscribeBadge2;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public void setSubscriberCount(int i2) {
        this.subscriberCount = i2;
    }
}
