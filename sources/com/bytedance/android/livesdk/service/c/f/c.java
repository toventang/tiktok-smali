package com.bytedance.android.livesdk.service.c.f;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.utils.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21410a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(12606);
    }

    public static void a(long j2, String str, String str2, long j3, String str3, String str4) {
        String str5;
        l.d(str2, "");
        long a2 = a.a();
        b a3 = b.a.a("send_gift_response").a();
        Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
        if (map == null || (str5 = (String) map.get("anchor_id")) == null) {
            str5 = "0";
        }
        a3.a("anchor_id", str5).a("response_receive_ms", a2).a("duration", a2 - j3).a("status_code", str3).a("status_msg", str4).a("send_click_duration", a.a() - j2).a(e.a(str)).b();
    }
}
