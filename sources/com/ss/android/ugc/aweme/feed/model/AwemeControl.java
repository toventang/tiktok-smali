package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class AwemeControl implements Serializable {
    @c(a = "can_comment")
    public boolean canComment = true;
    @c(a = "can_forward")
    public boolean canForward = true;
    @c(a = "can_share")
    public boolean canShare = true;
    @c(a = "can_show_comment")
    public boolean canShowComment = true;

    static {
        Covode.recordClassIndex(59320);
    }

    public boolean canComment() {
        return this.canComment;
    }

    public boolean canForward() {
        return this.canForward;
    }

    public boolean canShare() {
        return this.canShare;
    }

    public boolean canShowComment() {
        return this.canShowComment;
    }

    public void setCanComment(boolean z) {
        this.canComment = z;
    }

    public void setCanForward(boolean z) {
        this.canForward = z;
    }

    public void setCanShare(boolean z) {
        this.canShare = z;
    }

    public void setCanShowComment(boolean z) {
        this.canShowComment = z;
    }
}
