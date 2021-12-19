package com.ss.android.ugc.aweme.social.widget.card.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.e;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f133773a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(87507);
    }

    public static void a(f fVar, Map<String, String> map) {
        l.d(fVar, "");
        a(fVar, "authorize_card_show", map);
    }

    public static void b(f fVar, Map<String, String> map) {
        l.d(fVar, "");
        Map b2 = ag.b(v.a("platform", e.e(fVar)));
        if (map != null) {
            b2.putAll(map);
        }
        r.a("authorize_card_close", b2);
    }

    public static void a(f fVar, String str, Map<String, String> map) {
        Map b2 = ag.b(v.a("is_auth", a.a(false)), v.a("platform", e.e(fVar)), v.a("did_status", e.d(fVar)), v.a("uid_status", e.c(fVar)));
        if (map != null) {
            b2.putAll(map);
        }
        r.a(str, b2);
    }
}
