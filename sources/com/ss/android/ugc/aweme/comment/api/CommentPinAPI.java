package com.ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.c.j;
import f.a.ab;
import l.b.c;
import l.b.e;
import l.b.o;

public interface CommentPinAPI {
    static {
        Covode.recordClassIndex(43972);
    }

    @o(a = "/tiktok/comment/pin/v1")
    @e
    ab<j> pinComment(@c(a = "item_id") String str, @c(a = "comment_id") String str2, @c(a = "pinned_at") long j2, @c(a = "op") int i2, @c(a = "pin_anyway") boolean z);
}
