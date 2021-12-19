package com.ss.android.ugc.aweme.trending;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141037a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92074);
    }

    public static Keva a() {
        Keva repo = Keva.getRepo("trending_keva");
        l.b(repo, "");
        return repo;
    }

    public static boolean b() {
        if (a().getInt("ever_next", -1) == 1) {
            return true;
        }
        return false;
    }
}
