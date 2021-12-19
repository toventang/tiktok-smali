package com.ss.android.ugc.aweme.comment.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f71270a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(43877);
    }

    public static final boolean a() {
        if (b.a().a(true, "enable_comment_batch_management_tool", 0) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (b.a().a(true, "enable_comment_batch_management_tool", 0) == 1) {
            return true;
        }
        return false;
    }
}
