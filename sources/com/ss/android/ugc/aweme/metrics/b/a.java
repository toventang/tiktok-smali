package com.ss.android.ugc.aweme.metrics.b;

import android.content.Context;
import android.content.SharedPreferences;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.statisticlogger.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109531a = fq.a.f142946a.a(fp.VIDEO_REQ);

    /* renamed from: b  reason: collision with root package name */
    private static volatile long f109532b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f109533c = false;

    static {
        Covode.recordClassIndex(70117);
    }

    private static void b() {
        d.a(com.bytedance.ies.ugc.appcontext.d.a(), "ies_log_flag", 0).edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
    }

    public static boolean a() {
        long j2;
        if (f109533c) {
            return true;
        }
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (f109532b <= 0) {
            SharedPreferences a3 = d.a(a2, "ies_log_flag", 0);
            if (s.f93857a) {
                j2 = -1;
            } else {
                j2 = 1;
            }
            long j3 = a3.getLong("first_install_time_key", j2);
            f109532b = j3;
            if (j3 <= 0) {
                f109532b = System.currentTimeMillis();
                b();
            }
        }
        if (f109532b + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!f109533c) {
            f109533c = true;
            d.a(a2, "ies_log_flag", 0).edit().putLong("first_install_time_key", 1).apply();
        }
        return true;
    }

    public static void a(String str, JSONObject jSONObject) {
        a(str, jSONObject, System.currentTimeMillis());
    }

    public static void a(String str, String str2, String str3) {
        if (!a()) {
            i.b(new c(str, str2, str3, com.bytedance.ies.ugc.appcontext.d.a()), i.f4824a);
        }
    }

    public static void a(String str, JSONObject jSONObject, long j2) {
        if (!a()) {
            Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
            try {
                jSONObject.put("local_time", j2 / 1000);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a(a2, str, "low_retain", jSONObject);
        }
    }

    private static void a(Context context, String str, String str2, JSONObject jSONObject) {
        i.b(new d(jSONObject, str, str2, context), i.f4824a);
    }

    static final /* synthetic */ Object a(JSONObject jSONObject, String str, String str2, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", e.f35345b);
        jSONObject2.put("scene", str2);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    static final /* synthetic */ Object a(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put(str2, str3);
        jSONObject2.put("session_id", e.f35345b);
        jSONObject2.put("scene", "low_retain");
        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }
}
