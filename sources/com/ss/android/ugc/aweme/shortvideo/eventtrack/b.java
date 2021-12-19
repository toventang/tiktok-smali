package com.ss.android.ugc.aweme.shortvideo.eventtrack;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f128468a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(84234);
    }

    public static void a(String str, String str2) {
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (str == null) {
            str = "";
        }
        r.a("show_transl_auth_intro", bVar.a("shoot_way", str).a("creation_id", str2).f149193a);
    }

    public static void b(String str, String str2) {
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (str == null) {
            str = "";
        }
        r.a("accept_transl_auth", bVar.a("shoot_way", str).a("creation_id", str2).f149193a);
    }

    public static void c(String str, String str2) {
        l.d(str2, "");
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (str == null) {
            str = "";
        }
        r.a("decline_transl_auth", bVar.a("shoot_way", str).a("creation_id", str2).f149193a);
    }
}
