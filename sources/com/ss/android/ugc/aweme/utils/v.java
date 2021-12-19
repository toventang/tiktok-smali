package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f143190a = new v();

    private v() {
    }

    static {
        Covode.recordClassIndex(93727);
    }

    public static final boolean b(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (b.ao(aweme) || b.d(aweme) || a(aweme) || b.ar(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean a(Aweme aweme) {
        s sVar = s.a.f66880a;
        l.b(sVar, "");
        aj<Boolean> p = sVar.p();
        l.b(p, "");
        Boolean c2 = p.c();
        l.b(c2, "");
        if (!c2.booleanValue() || aweme == null || aweme.getStatus() == null || aweme.getPromotions().size() <= 0 || !g.b().shouldShowCard() || !g.f().a(aweme)) {
            return false;
        }
        return true;
    }
}
