package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;

public final class e {
    static {
        Covode.recordClassIndex(43880);
    }

    public static void b(String str) {
        a("NOTICE:".concat(String.valueOf(str)));
    }

    public static void a(String str) {
        n.a("comment_not_show", new c().a("comment_not_show_message", str).a());
    }
}
