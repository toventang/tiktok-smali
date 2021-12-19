package com.ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.commercialize.log.b;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {
    static {
        Covode.recordClassIndex(46115);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public AwemeRawAd f74815a;

        /* renamed from: b  reason: collision with root package name */
        public String f74816b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f74817c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f74818d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f74819e;

        static {
            Covode.recordClassIndex(46116);
        }

        public final JSONObject a() {
            try {
                JSONObject jSONObject = this.f74818d;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    AwemeRawAd awemeRawAd = this.f74815a;
                    if (awemeRawAd != null) {
                        String logExtra = awemeRawAd.getLogExtra();
                        if (!TextUtils.isEmpty(logExtra)) {
                            jSONObject.put("log_extra", logExtra);
                        }
                        jSONObject.put("is_ad_event", "1");
                        Context a2 = d.a();
                        if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                            j.f107227f = NetworkUtils.getNetworkAccessType(a2);
                        }
                        String str = j.f107227f;
                        if (!m.a(str)) {
                            jSONObject.put("nt", str);
                        }
                    }
                    if (this.f74817c) {
                        jSONObject.put("has_v3", "1");
                    }
                    Map<String, String> map = this.f74819e;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (TextUtils.isEmpty(this.f74816b)) {
                        return jSONObject;
                    }
                    jSONObject.put("refer", this.f74816b);
                    return jSONObject;
                } catch (Throwable unused) {
                    return jSONObject;
                }
            } catch (Throwable unused2) {
                return null;
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            o j2 = q.a(jSONObject.getString("log_extra")).j();
            JSONObject jSONObject2 = new JSONObject();
            if (j2.c("rit") != null) {
                jSONObject2.put("ctr_rit", j2.c("rit").c());
            }
            return jSONObject2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String str2, long j2, JSONObject jSONObject) {
        long j3;
        try {
            j3 = Long.parseLong(str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            j3 = 0;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next) && !TextUtils.equals("category", next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        b.a aVar = new b.a();
        aVar.f74760c = str;
        aVar.f74759b = "realtime_click";
        aVar.f74762e = j3;
        aVar.f74764g = j2;
        aVar.f74758a = "event_v3";
        aVar.f74766i = jSONObject2;
        aVar.a().a();
        ag.a("ctr_monitor", "ctr_click", a(jSONObject));
    }

    public static void a(String str, String str2, JSONObject jSONObject, String str3, long j2) {
        com.bytedance.ies.ugc.aweme.rich.a.a.a.f35121a.a(str, str2, str3, jSONObject);
        if (TextUtils.equals("click", str2)) {
            a(str, str3, j2, jSONObject);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            String a2 = com.bytedance.ies.abmock.b.a().a(true, "enable_send_staging_adlog", "v3");
            if (!TextUtils.equals(a2, "v3")) {
                if (TextUtils.equals(a2, "all")) {
                    try {
                        jSONObject.put("_ad_staging_flag", "1");
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
        if (com.bytedance.ies.android.base.runtime.a.f31872a != null) {
            com.bytedance.ies.android.base.runtime.a.f31872a.onEventV1(d.a(), str, null, str2, str3, j2, jSONObject);
        }
    }
}
