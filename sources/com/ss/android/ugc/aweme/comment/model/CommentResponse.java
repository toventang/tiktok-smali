package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.a.c;

public class CommentResponse extends BaseCommentResponse {
    @c(a = UGCMonitor.EVENT_COMMENT)
    public Comment comment;
    @c(a = "rethink_popup")
    public CommentRethinkPopup commentRethinkPopup;
    @c(a = "label_info")
    public String starFakeLabel;

    static {
        Covode.recordClassIndex(44305);
    }

    public void setStarFakeLabel(String str) {
        this.starFakeLabel = str;
        this.comment.setLabelInfo(str);
    }
}
