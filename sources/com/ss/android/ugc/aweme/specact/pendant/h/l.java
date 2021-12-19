package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f134314a = new l();

    private l() {
    }

    static {
        Covode.recordClassIndex(87840);
    }

    public static boolean a(Aweme aweme) {
        h.f.b.l.d(aweme, "");
        if (c.a(aweme) || aweme.getAwemeType() == 101 || a.o().a() || !f.a(e.f142364k.a())) {
            return false;
        }
        if (d.a() || d.b()) {
            return true;
        }
        return false;
    }
}
