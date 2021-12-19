package com.ss.android.ugc.aweme.comment.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.comment.model.Comment;

public final class a {
    static {
        Covode.recordClassIndex(44231);
    }

    public static boolean a(Comment comment) {
        if (comment != null && b.g().isLogin()) {
            return true;
        }
        return false;
    }
}
