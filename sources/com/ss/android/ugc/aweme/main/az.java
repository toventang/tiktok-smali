package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static final az f109175a = new az();

    private az() {
    }

    static {
        Covode.recordClassIndex(69914);
    }

    public static final void a() {
        Keva repoFromSp = Keva.getRepoFromSp(d.a(), "NotificationSharePreferences", 0);
        l.b(repoFromSp, "");
        repoFromSp.storeBoolean("noticeGuideShown", true);
    }
}
