package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public final class CommentStatusResponse extends BaseResponse {
    @c(a = "comment_status_list")
    private List<CommentStatus> commentStatus;

    static {
        Covode.recordClassIndex(64030);
    }

    public final List<CommentStatus> getCommentStatus() {
        return this.commentStatus;
    }

    public final void setCommentStatus(List<CommentStatus> list) {
        this.commentStatus = list;
    }
}
