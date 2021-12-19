package com.bytedance.ies.bullet.service.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.e.b;
import com.bytedance.ies.bullet.service.base.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32679a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(19428);
    }

    public static /* synthetic */ void a(String str, Uri uri, String str2, String str3, String str4, long j2, int i2) {
        Uri uri2 = uri;
        String str5 = str;
        if ((i2 & 1) != 0) {
            str5 = "default_bid";
        }
        if ((i2 & 4) != 0) {
            uri2 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        l.c(str5, "");
        l.c(str2, "");
        l.c(str3, "");
        Uri uri3 = Uri.EMPTY;
        l.a((Object) uri3, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("schema", "unknown");
        jSONObject.put(StringSet.type, str2);
        jSONObject.put("status", str3);
        if (str4 != null) {
            jSONObject.put("error_message", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j2);
        a(str5, "bdx_monitor_router_close", uri3, uri2, jSONObject, jSONObject2, (String) null);
    }

    private static void a(String str, String str2, Uri uri, Uri uri2, JSONObject jSONObject, JSONObject jSONObject2, String str3) {
        o oVar = (o) e.a.a().a(str, o.class);
        if (oVar != null) {
            Boolean bool = null;
            an anVar = new an(str2, null, null, 254);
            if (!(str3 == null || str3.length() == 0)) {
                com.bytedance.ies.bullet.service.a.e<String, Object> b2 = e.a.a().b(str3);
                if (b2 != null) {
                    bool = b2.getBoolean("res_memory");
                }
                jSONObject.put("res_memory", l.a(bool, true) ? 1 : 0);
            }
            anVar.f32554g = jSONObject;
            anVar.f32555h = jSONObject2;
            if (uri2 == null) {
                anVar.f32552e = uri.toString();
            } else {
                anVar.f32550c = new b(uri2);
            }
            oVar.a(anVar);
        }
    }

    public static void a(String str, Uri uri, Uri uri2, String str2, String str3, String str4, long j2, Long l2, String str5) {
        Uri uri3;
        String str6;
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str5, "");
        if (uri == null) {
            uri3 = Uri.EMPTY;
            l.a((Object) uri3, "");
        } else {
            uri3 = uri;
        }
        JSONObject jSONObject = new JSONObject();
        if (uri == null || (str6 = uri.toString()) == null) {
            str6 = "unknown";
        }
        jSONObject.put("schema", str6);
        jSONObject.put(StringSet.type, str2);
        jSONObject.put("status", str3);
        if (str4 != null) {
            jSONObject.put("error_message", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", j2);
        if (l2 != null) {
            jSONObject2.put("bullet_duration", l2.longValue());
        }
        a(str, "bdx_monitor_router_open", uri3, uri2, jSONObject, jSONObject2, str5);
    }
}
