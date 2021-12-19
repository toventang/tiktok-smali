package com.ss.android.ugc.aweme.geofencing.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.geofencing.c.a;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f99050a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(62979);
    }

    private static Keva b() {
        Keva repo = Keva.getRepo("geofencing_region_list");
        l.b(repo, "");
        return repo;
    }

    public static List<a> a() {
        String string = b().getString("regions", "");
        if (string == null || string.length() == 0) {
            return z.INSTANCE;
        }
        List<a> b2 = dg.b(string, a[].class);
        l.b(b2, "");
        return b2;
    }

    public static void a(List<a> list) {
        l.d(list, "");
        b().storeString("regions", dg.a().b(list));
    }
}
