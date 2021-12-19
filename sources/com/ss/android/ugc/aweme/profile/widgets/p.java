package com.ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f118033a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f118034b = new p();

    private p() {
    }

    static String b() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        return g2.getCurUserId();
    }

    static {
        Covode.recordClassIndex(76592);
        Keva repo = Keva.getRepo("profile_private_account_guide");
        l.b(repo, "");
        f118033a = repo;
    }

    public static void a() {
        f118033a.storeBoolean(b() + "-guide_disabled", true);
    }
}
