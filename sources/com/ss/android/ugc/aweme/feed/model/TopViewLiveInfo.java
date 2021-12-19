package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class TopViewLiveInfo implements Serializable {
    @c(a = "comment_count")
    private Long commentCount = 0L;
    private transient int currentIndex;
    @c(a = "gift_count")
    private Long giftCount = 0L;
    @c(a = "status_code")
    private int statusCode;
    @c(a = "status_msg")
    private String statusMsg;
    @c(a = "viewer_count")
    private Long viewerCount = 0L;

    static {
        Covode.recordClassIndex(59460);
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final Long getGiftCount() {
        return this.giftCount;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final Long getViewerCount() {
        return this.viewerCount;
    }

    public final void setCommentCount(Long l2) {
        this.commentCount = l2;
    }

    public final void setCurrentIndex(int i2) {
        this.currentIndex = i2;
    }

    public final void setGiftCount(Long l2) {
        this.giftCount = l2;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setViewerCount(Long l2) {
        this.viewerCount = l2;
    }
}
