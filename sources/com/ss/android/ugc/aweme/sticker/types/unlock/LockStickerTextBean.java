package com.ss.android.ugc.aweme.sticker.types.unlock;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class LockStickerTextBean {
    @c(a = "activity_id")
    String activityId;
    @c(a = "bubble_hint")
    String bubbleHint;
    @c(a = "content")
    String content;
    @c(a = "share_desc")
    String shareDesc;
    @c(a = "share_url")
    String shareUrl;
    @c(a = "title")
    String title;

    static {
        Covode.recordClassIndex(88939);
    }

    public String getActivityId() {
        return this.activityId;
    }

    public String getBubbleHint() {
        return this.bubbleHint;
    }

    public String getContent() {
        return this.content;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setBubbleHint(String str) {
        this.bubbleHint = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
