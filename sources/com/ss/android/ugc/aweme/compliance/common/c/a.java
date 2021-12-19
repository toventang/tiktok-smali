package com.ss.android.ugc.aweme.compliance.common.c;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77318a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47811);
    }

    public static void a(String str, int i2) {
        l.d(str, "");
        a("compliance_api_status", str, i2);
    }

    public static void b(String str, int i2) {
        l.d(str, "");
        a("tns_api_status", str, i2);
    }

    private static void a(String str, String str2, int i2) {
        n.a(str, "", new c().a(StringSet.type, str2).a("status", Integer.valueOf(i2)).a());
    }

    public static void a(Integer num, t<Integer> tVar, t<Integer> tVar2) {
        Integer value;
        l.d(tVar, "");
        l.d(tVar2, "");
        if (num != null && num.intValue() == 0) {
            Integer value2 = tVar.getValue();
            if ((value2 != null && value2.intValue() == 1) || ((value = tVar2.getValue()) != null && value.intValue() == 1)) {
                n.a("unexpectable_personalize_ad_settings", "", new c().a("pers_ad_third_party_networks_mode", tVar.getValue()).a("pers_ad_third_party_networks_mode", tVar2.getValue()).a());
            }
        }
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        a("compliance_api_status", str, 1, str2, str3);
    }

    public static void a(String str, boolean z, Map<String, ? extends Object> map) {
        l.d(str, "");
        if (!z) {
            c a2 = new c().a(StringSet.type, str);
            if (map != null) {
                a2.a("error_message", map.toString());
            }
            n.a("compliance_assert", "", a2.a());
        }
    }

    public static void a(String str, int i2, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        a("tns_api_status", str, i2, str2, str3);
    }

    private static void a(String str, String str2, int i2, String str3, String str4) {
        n.a(str, "", new c().a(StringSet.type, str2).a("status", Integer.valueOf(i2)).a("error_message", str4).a("tns_logId", str3).a());
    }
}
