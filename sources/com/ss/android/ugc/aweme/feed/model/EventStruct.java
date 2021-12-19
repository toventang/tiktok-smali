package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public final class EventStruct implements Serializable {
    @c(a = "desc")
    private String desc;
    @c(a = "duration")
    private long duration;
    @c(a = "enable_update")
    private boolean enableUpdate;
    @c(a = "has_subscribed")
    private boolean hasSubscribed;
    @c(a = "host")
    private User host;
    @c(a = "id")
    private String id;
    @c(a = "start_time")
    private long startTime;
    @c(a = "status")
    private int status;
    @c(a = "subscriber_count")
    private long subscriberCount;
    @c(a = "title")
    private String title;
    @c(a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(59373);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableUpdate() {
        return this.enableUpdate;
    }

    public final boolean getHasSubscribed() {
        return this.hasSubscribed;
    }

    public final User getHost() {
        return this.host;
    }

    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubscriberCount() {
        return this.subscriberCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j2) {
        this.duration = j2;
    }

    public final void setEnableUpdate(boolean z) {
        this.enableUpdate = z;
    }

    public final void setHasSubscribed(boolean z) {
        this.hasSubscribed = z;
    }

    public final void setHost(User user) {
        this.host = user;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setStatus(int i2) {
        this.status = i2;
    }

    public final void setSubscriberCount(long j2) {
        this.subscriberCount = j2;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i2) {
        this.type = i2;
    }
}
