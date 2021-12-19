package com.ss.android.ugc.aweme.comment.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f71776a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(44137);
    }

    public static final boolean a() {
        int a2 = b.a().a(false, "add_comments_to_favorites", 0);
        if (a2 == 3 || a2 == 1 || a2 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        int a2 = b.a().a(false, "add_comments_to_favorites", 0);
        if (a2 == 3 || a2 == 1) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        int a2 = b.a().a(false, "add_comments_to_favorites", 0);
        if (a2 == 2 || a2 == 1) {
            return true;
        }
        return false;
    }
}
