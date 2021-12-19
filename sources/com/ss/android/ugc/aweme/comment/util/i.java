package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f72841a = new i();

    private i() {
    }

    public static boolean a() {
        if (a.f96671a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(44871);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            a.a(4, str, str2);
        }
    }

    public static final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (a()) {
            a.a(6, str, str2);
        }
    }
}
