package com.bytedance.android.livesdk.service.c.e;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21399a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(12601);
    }

    public static void a(String str) {
        String str2;
        l.d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put(StringSet.type, "gifting");
        if (l.a((Object) str, (Object) "reject")) {
            str2 = "dark_pattern_group";
        } else {
            str2 = "frequency";
        }
        hashMap.put("risk_control_scenario", str2);
        b.a.a("livesdk_hit_risk_control_popup_show").a().a((Map<String, String>) hashMap).b();
    }

    public static void a(String str, String str2) {
        String str3;
        l.d(str, "");
        l.d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put(StringSet.type, "gifting");
        if (l.a((Object) str, (Object) "reject")) {
            str3 = "dark_pattern_group";
        } else {
            str3 = "frequency";
        }
        hashMap.put("risk_control_scenario", str3);
        hashMap.put("click_type", str2);
        b.a.a("livesdk_hit_risk_control_popup_click").a().a((Map<String, String>) hashMap).b();
    }
}
