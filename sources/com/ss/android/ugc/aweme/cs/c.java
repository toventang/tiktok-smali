package com.ss.android.ugc.aweme.cs;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78999a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(49031);
    }

    public static boolean b() {
        if (c() >= 3) {
            return true;
        }
        return false;
    }

    public static int c() {
        return a().getInt("show_storage_manager_count", 0);
    }

    public static boolean d() {
        if (e() >= 3) {
            return true;
        }
        return false;
    }

    public static int e() {
        return a().getInt("show_system_clean_count", 0);
    }

    public static Keva a() {
        Keva repoFromSp = Keva.getRepoFromSp(d.a(), "DiskManager", 0);
        l.b(repoFromSp, "");
        return repoFromSp;
    }
}
