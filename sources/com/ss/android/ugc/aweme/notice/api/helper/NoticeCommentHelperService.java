package com.ss.android.ugc.aweme.notice.api.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;

public interface NoticeCommentHelperService {
    static {
        Covode.recordClassIndex(72482);
    }

    String a(Comment comment);
}
