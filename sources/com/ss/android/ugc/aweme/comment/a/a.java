package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71264a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43874);
    }

    public static final boolean a() {
        if (b.a().a(true, "comment_reply_style", 0) == 1 || b.a().a(true, "comment_reply_style", 0) == 2) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (b.a().a(true, "comment_reply_style", 0) >= 2) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (b.a().a(true, "comment_reply_style", 0) == 3) {
            return true;
        }
        return false;
    }
}
