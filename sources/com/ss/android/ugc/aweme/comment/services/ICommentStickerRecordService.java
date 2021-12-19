package com.ss.android.ugc.aweme.comment.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;

public interface ICommentStickerRecordService {
    static {
        Covode.recordClassIndex(44614);
    }

    void a(Context context, CommentVideoModel commentVideoModel);
}
