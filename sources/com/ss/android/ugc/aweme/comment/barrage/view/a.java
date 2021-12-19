package com.ss.android.ugc.aweme.comment.barrage.view;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.barrage.b.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(44114);
    }

    public static final com.bytedance.ies.powerlist.b.a a(Comment comment, com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        l.d(comment, "");
        return new com.ss.android.ugc.aweme.comment.barrage.b.a(comment, false, aVar);
    }

    public static final c a(User user, com.ss.android.ugc.aweme.comment.barrage.a aVar) {
        l.d(user, "");
        return new c(user, n.a((Object) 1001), aVar);
    }
}
