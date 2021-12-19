package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f116478a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(75186);
    }

    public static String a(String str) {
        StringBuilder append = new StringBuilder().append(str).append('_');
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return append.append(g2.getCurUserId()).toString();
    }
}
