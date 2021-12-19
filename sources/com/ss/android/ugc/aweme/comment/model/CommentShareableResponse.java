package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class CommentShareableResponse extends BaseCommentResponse {
    @c(a = "share_status")
    public int shareStatus;
    @c(a = "toast")
    public String toast;

    static {
        Covode.recordClassIndex(44307);
    }
}
