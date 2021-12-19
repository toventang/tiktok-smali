package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class UrgeNotice {
    @c(a = "blcok_urge_setting")
    private int blcokUrgeSetting;
    @c(a = "content")
    private String content;
    @c(a = "urge_unread_count")
    private long urgeUnreadCount;

    static {
        Covode.recordClassIndex(72543);
    }

    public int getBlcokUrgeSetting() {
        return this.blcokUrgeSetting;
    }

    public String getContent() {
        return this.content;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public void setBlcokUrgeSetting(int i2) {
        this.blcokUrgeSetting = i2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUrgeUnreadCount(long j2) {
        this.urgeUnreadCount = j2;
    }
}
