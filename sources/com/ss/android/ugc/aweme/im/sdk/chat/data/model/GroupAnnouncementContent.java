package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class GroupAnnouncementContent extends BaseContent {
    @c(a = "notice_content")
    private String announcement = "";
    @c(a = "notice_title")
    private String title = "";

    static {
        Covode.recordClassIndex(64035);
    }

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getMsgHint() {
        String str = this.announcement;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setAnnouncement(String str) {
        this.announcement = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
