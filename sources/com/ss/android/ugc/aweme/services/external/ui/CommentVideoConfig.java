package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import java.io.Serializable;

public final class CommentVideoConfig implements Serializable {
    private CommentVideoModel commentVideoModel;

    static {
        Covode.recordClassIndex(79685);
    }

    public final CommentVideoModel getCommentVideoModel() {
        return this.commentVideoModel;
    }

    public final void setCommentVideoModel(CommentVideoModel commentVideoModel2) {
        this.commentVideoModel = commentVideoModel2;
    }
}
