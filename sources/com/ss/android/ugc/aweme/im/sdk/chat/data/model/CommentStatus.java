package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class CommentStatus {
    @c(a = "cid")
    private Long commentId;
    @c(a = "is_visible")
    private Boolean isVisible = true;
    @c(a = "reason")
    private String reason;
    @c(a = "comment_sharing_status")
    private Integer sharingStatus;

    static {
        Covode.recordClassIndex(64029);
    }

    public final Long getCommentId() {
        return this.commentId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Integer getSharingStatus() {
        return this.sharingStatus;
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final void setCommentId(Long l2) {
        this.commentId = l2;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setSharingStatus(Integer num) {
        this.sharingStatus = num;
    }

    public final void setVisible(Boolean bool) {
        this.isVisible = bool;
    }
}
