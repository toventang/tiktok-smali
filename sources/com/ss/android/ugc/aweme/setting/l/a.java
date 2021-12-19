package com.ss.android.ugc.aweme.setting.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122254a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80156);
    }

    public static Keva a() {
        Keva repoFromSp = Keva.getRepoFromSp(d.a(), "referral_code", 0);
        l.b(repoFromSp, "");
        return repoFromSp;
    }
}
