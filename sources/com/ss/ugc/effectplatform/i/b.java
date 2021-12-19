package com.ss.ugc.effectplatform.i;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.model.Effect;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(102418);
    }

    public static final void a(a aVar, boolean z, a aVar2, Map<String, ? extends Object> map, String str) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(map, "");
        p[] pVarArr = new p[3];
        String str2 = aVar2.f153411k;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[0] = v.a("app_id", str2);
        String str3 = aVar2.f153402b;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[1] = v.a("access_key", str3);
        pVarArr[2] = v.a("effect_platform_type", 1);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str == null) {
                str = "";
            }
            b2.put("error_msg", str);
        }
        aVar.monitorStatusRate("hot_list_success_rate", !z ? 1 : 0, b2);
    }

    public static final void a(a aVar, boolean z, a aVar2, Effect effect, String str) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(effect, "");
        p[] pVarArr = new p[5];
        pVarArr[0] = v.a("effect_id", effect.getEffect_id());
        pVarArr[1] = v.a("effect_name", effect.getName());
        pVarArr[2] = v.a("effect_platform_type", 1);
        String str2 = aVar2.f153411k;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[3] = v.a("app_id", str2);
        String str3 = aVar2.f153402b;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[4] = v.a("access_key", str3);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        if (!z) {
            if (str == null) {
                str = "";
            }
            b2.put("error_msg", str);
        }
        aVar.monitorStatusRate("effect_resource_unzip_success_rate", !z ? 1 : 0, b2);
    }

    public static final void a(a aVar, boolean z, a aVar2, String str, String str2) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        p[] pVarArr = new p[4];
        String str3 = aVar2.f153411k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = v.a("app_id", str3);
        String str4 = aVar2.f153402b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = v.a("access_key", str4);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("model_name", str);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b2.put("error_msg", str2);
        }
        aVar.monitorStatusRate("find_resource_uri_success_rate", !z ? 1 : 0, b2);
    }

    public static final void b(a aVar, boolean z, a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        l.c(map, "");
        p[] pVarArr = new p[4];
        String str3 = aVar2.f153411k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = v.a("app_id", str3);
        String str4 = aVar2.f153402b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = v.a("access_key", str4);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("panel", str);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b2.put("error_msg", str2);
        }
        aVar.monitorStatusRate("effect_list_success_rate", !z ? 1 : 0, b2);
    }

    public static final void c(a aVar, boolean z, a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        l.c(map, "");
        p[] pVarArr = new p[5];
        String str3 = aVar2.f153411k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = v.a("app_id", str3);
        String str4 = aVar2.f153402b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = v.a("access_key", str4);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("effect_id", str);
        pVarArr[4] = v.a("lru_max_size", String.valueOf(aVar2.I));
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b2.put("error_msg", str2);
        }
        aVar.monitorStatusRate("effect_download_success_rate", !z ? 1 : 0, b2);
    }

    public static final void a(a aVar, boolean z, a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        l.c(map, "");
        p[] pVarArr = new p[4];
        String str3 = aVar2.f153411k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = v.a("app_id", str3);
        String str4 = aVar2.f153402b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = v.a("access_key", str4);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("panel", str);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b2.put("error_msg", str2);
        }
        aVar.monitorStatusRate("panel_info_success_rate", !z ? 1 : 0, b2);
    }

    public static final void a(a aVar, boolean z, a aVar2, String str, String str2, Map<String, ? extends Object> map, String str3) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(map, "");
        p[] pVarArr = new p[5];
        String str4 = aVar2.f153411k;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[0] = v.a("app_id", str4);
        String str5 = aVar2.f153402b;
        if (str5 == null) {
            str5 = "";
        }
        pVarArr[1] = v.a("access_key", str5);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("panel", str);
        pVarArr[4] = v.a("category", str2);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            b2.put("error_msg", str3);
        }
        aVar.monitorStatusRate("category_list_success_rate", !z ? 1 : 0, b2);
    }

    public static final void a(a aVar, boolean z, a aVar2, String str, String str2, String str3, Map<String, ? extends Object> map, String str4) {
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(str, "");
        l.c(str3, "");
        l.c(map, "");
        p[] pVarArr = new p[6];
        String str5 = aVar2.f153411k;
        if (str5 == null) {
            str5 = "";
        }
        pVarArr[0] = v.a("app_id", str5);
        String str6 = aVar2.f153402b;
        if (str6 == null) {
            str6 = "";
        }
        pVarArr[1] = v.a("access_key", str6);
        pVarArr[2] = v.a("effect_platform_type", 1);
        pVarArr[3] = v.a("resource_name", str);
        pVarArr[4] = v.a("resource_type", str3);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[5] = v.a("resource_version", str2);
        Map<String, ? extends Object> b2 = ag.b(pVarArr);
        b2.putAll(map);
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            b2.put("error_msg", str4);
        }
        aVar.monitorStatusRate("resource_download_success_rate", !z ? 1 : 0, b2);
    }
}
