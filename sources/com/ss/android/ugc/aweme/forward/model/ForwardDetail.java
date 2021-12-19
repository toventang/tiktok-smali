package com.ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class ForwardDetail extends BaseResponse implements d {
    @c(a = "aweme_info")
    private Aweme aweme;
    @c(a = "comment_info")
    private Comment comment;
    @c(a = "label_info")
    private String labelInfo;
    String requestId;

    static {
        Covode.recordClassIndex(61322);
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setComment(Comment comment2) {
        this.comment = comment2;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            aweme2.setRequestId(str);
        }
        this.requestId = str;
    }
}
