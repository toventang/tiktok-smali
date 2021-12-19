package com.ss.android.ugc.aweme.notification.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(73050);
    }

    public static final String a(Comment comment) {
        if (comment == null || TextUtils.isEmpty(comment.getCid())) {
            return "";
        }
        if (comment.getUser() == null) {
            return NoticeCommentHelperServiceImpl.a().a(comment);
        }
        StringBuilder sb = new StringBuilder();
        User user = comment.getUser();
        l.b(user, "");
        return sb.append(j.a(user)).append(": ").append(NoticeCommentHelperServiceImpl.a().a(comment)).toString();
    }
}
