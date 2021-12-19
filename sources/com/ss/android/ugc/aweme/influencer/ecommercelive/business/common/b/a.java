package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104549a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(66980);
    }

    public static void a(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a aVar) {
        l.d(aVar, "");
        r.a("livesdk_tiktokec_product_icon_show", c(aVar).f66730a);
    }

    public static void b(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a aVar) {
        l.d(aVar, "");
        r.a("livesdk_tiktokec_product_icon_click", c(aVar).f66730a);
    }

    private static d c(com.ss.android.ugc.aweme.influencer.ecommercelive.framework.a.a aVar) {
        String a2;
        if (l.a((Object) aVar.a("room_id"), (Object) "0")) {
            a2 = "";
        } else {
            a2 = aVar.a("room_id");
        }
        d a3 = new d().a("anchor_id", aVar.a("anchor_id")).a("EVENT_ORIGIN_FEATURE", "TEMAI").a("room_id", a2).a("live_status", aVar.a("live_status"));
        String a4 = aVar.a("page_type");
        if (a4 == null) {
            a4 = "";
        }
        d a5 = a3.a("page_type", a4);
        String a6 = aVar.a("anchor_show_type");
        if (a6 == null) {
            a6 = "";
        }
        d a7 = a5.a("anchor_show_type", a6);
        l.b(a7, "");
        return a7;
    }
}
