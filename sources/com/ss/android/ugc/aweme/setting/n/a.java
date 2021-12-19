package com.ss.android.ugc.aweme.setting.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122356a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(80226);
    }

    public static Keva a() {
        Keva repoFromSp = Keva.getRepoFromSp(d.a(), "DiskManager", 0);
        l.b(repoFromSp, "");
        return repoFromSp;
    }

    public static boolean a(boolean z) {
        return a().getBoolean("has_show_disk_manager_dot", z);
    }
}
