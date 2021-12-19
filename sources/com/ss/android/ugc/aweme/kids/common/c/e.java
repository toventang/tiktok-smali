package com.ss.android.ugc.aweme.kids.common.c;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import h.f.b.l;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f105895a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(67765);
    }

    public static final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        f.a(str, jSONObject);
    }

    public static final void a(String str, int i2, int i3, long j2) {
        l.d(str, "");
        f.a("kids_api_monitor", new c().a(StringSet.type, Integer.valueOf(i2)).a("service", str).a("status", Integer.valueOf(i3)).a("duration", Long.valueOf(System.currentTimeMillis() - j2)).a());
    }
}
