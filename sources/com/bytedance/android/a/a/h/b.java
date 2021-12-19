package com.bytedance.android.a.a.h;

import android.text.TextUtils;
import com.bytedance.android.a.a.d.a;
import com.bytedance.android.a.a.e;
import com.bytedance.android.a.a.f;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(3205);
    }

    public static void onEventExpired(com.bytedance.android.a.a.d.b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", new JSONArray((Collection) bVar.f6624f)).put("is_retry", bVar.f6628j);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a("track_url_expired", bVar, jSONObject);
    }

    public static boolean a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void a(String str, com.bytedance.android.a.a.d.b bVar, JSONObject jSONObject) {
        a(jSONObject, "track_url_list", "");
        a(jSONObject, "track_status", (Object) -1);
        a(jSONObject, "ts", Long.valueOf(bVar.f6627i));
        a(jSONObject, "local_time_ms", String.valueOf(System.currentTimeMillis()));
        a(jSONObject, "is_retry", (Object) 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            optJSONObject.put("expire_seconds", bVar.n).put("is_c2s_sdk", 1);
            jSONObject.put("ad_extra_data", optJSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(str, (a) bVar, jSONObject);
    }

    private static void a(String str, a aVar, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2;
        Object opt;
        com.bytedance.android.a.a.a.a aVar2 = e.d().f6649g;
        if (aVar2 == null) {
            a.a("EventCallback not initialized.....");
            return;
        }
        long j2 = -1;
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = "";
        if (aVar != null) {
            str3 = aVar.a();
            j2 = aVar.f6621c;
            str2 = aVar.f6625g;
            currentTimeMillis = aVar.f6627i;
        } else {
            str2 = str3;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
            jSONObject.put("tag", "track_ad").put("value", j2).put("track_label", str3).put("log_extra", str2).put("category", "event_v3").put("is_ad_event", "1").put("ad_event_type", "monitor");
            f fVar = e.d().f6650h;
            if (fVar != null) {
                jSONObject.put("user_agent", f.c(fVar.a()));
            }
            if (aVar != null) {
                if (!jSONObject.has("ad_extra_data") || (jSONObject2 = jSONObject.optJSONObject("ad_extra_data")) == null) {
                    jSONObject2 = new JSONObject();
                }
                boolean z = false;
                if (aVar.f6626h != null) {
                    JSONObject jSONObject3 = aVar.f6626h;
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next) && (opt = jSONObject3.opt(next)) != null && a(jSONObject2, next, opt)) {
                            z = true;
                        }
                    }
                }
                if (!aVar.f6622d && aVar.f6623e > 0) {
                    jSONObject2.put("non_std_ad_id", aVar.f6623e);
                } else if (z) {
                }
                jSONObject.put("ad_extra_data", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        aVar2.a(str, jSONObject);
    }
}
