package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class CommentUtils {
    public static final CommentUtils INSTANCE = new CommentUtils();

    private CommentUtils() {
    }

    static {
        Covode.recordClassIndex(84424);
    }

    public static final boolean needMob(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !l.a((Object) "comment_reply", (Object) shortVideoContext.r) || shortVideoContext.f124767l == null) {
            return false;
        }
        return true;
    }

    public static final boolean isDataValid(CommentVideoModel commentVideoModel) {
        if (commentVideoModel != null && !TextUtils.isEmpty(commentVideoModel.getUserName()) && !TextUtils.isEmpty(commentVideoModel.getCommentMsg()) && !TextUtils.isEmpty(commentVideoModel.getAwemeId()) && !TextUtils.isEmpty(commentVideoModel.getUserId())) {
            return true;
        }
        return false;
    }

    public static final boolean needMob(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !l.a((Object) "comment_reply", (Object) videoPublishEditModel.mShootWay) || videoPublishEditModel.commentVideoModel == null) {
            return false;
        }
        return true;
    }
}
