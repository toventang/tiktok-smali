package com.bytedance.im.core.internal;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f38172a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38173b;

    /* renamed from: c  reason: collision with root package name */
    public static long f38174c = 60;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f38175d;

    /* renamed from: e  reason: collision with root package name */
    public static long f38176e = 86400000;

    /* renamed from: f  reason: collision with root package name */
    public static long f38177f;

    /* renamed from: g  reason: collision with root package name */
    public static int f38178g = 100;

    /* renamed from: h  reason: collision with root package name */
    public static float f38179h = 0.2f;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f38180i = true;

    /* renamed from: j  reason: collision with root package name */
    public static long f38181j = 100;

    /* renamed from: k  reason: collision with root package name */
    public static Float f38182k;

    /* renamed from: l  reason: collision with root package name */
    public static Map<String, String> f38183l;

    /* renamed from: m  reason: collision with root package name */
    public static JSONObject f38184m;
    private static JSONObject n;

    public static boolean m() {
        if (n != null) {
            return true;
        }
        return false;
    }

    public static long c() {
        JSONObject jSONObject = f38184m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("defaultPollingMsgInterval");
        }
        return f38174c;
    }

    public static long e() {
        JSONObject jSONObject = f38184m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("conversationMsgRepairInterval");
        }
        return f38176e;
    }

    public static long f() {
        JSONObject jSONObject = f38184m;
        if (jSONObject != null) {
            return (long) jSONObject.optInt("conversationMsgRepairStart");
        }
        return f38177f;
    }

    public static int g() {
        JSONObject jSONObject = f38184m;
        if (jSONObject != null) {
            return jSONObject.optInt("conversationMsgRepairCount");
        }
        return f38178g;
    }

    public static boolean n() {
        return "1".equals(b("only_check_not_repair"));
    }

    public static boolean a() {
        JSONObject jSONObject = f38184m;
        if (jSONObject == null) {
            return f38172a;
        }
        if (jSONObject.optInt("autoPollingMsgEnabled") == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        JSONObject jSONObject = f38184m;
        if (jSONObject == null) {
            return f38173b;
        }
        if (jSONObject.optInt("triggerPollingMsgEnabled") == 1) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        JSONObject jSONObject = f38184m;
        if (jSONObject == null) {
            return f38175d;
        }
        if (jSONObject.optInt("repairEnabled") == 1) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (d.a().b().aE || "1".equals(b("applog_2_alog"))) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (d.a().b().aF || "1".equals(b("is_switch_to_foreground_pull_msg"))) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (d.a().b().aG || "1".equals(b("is_net_change_pull_msg"))) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (d.a().b().aL || "1".equals(b("auto_polling_when_no_ws"))) {
            return true;
        }
        return false;
    }

    public static double h() {
        JSONObject jSONObject = f38184m;
        if (jSONObject != null) {
            return jSONObject.optDouble("dbReportRate");
        }
        if (f38182k == null) {
            s.a();
            f38182k = Float.valueOf(s.f38859a.b("db_report_rate", Float.valueOf(0.02f)).floatValue());
        }
        return (double) f38182k.floatValue();
    }

    static {
        Covode.recordClassIndex(22863);
        if (f38184m == null) {
            s.a();
            String b2 = s.f38860b.b(s.a("key_imsdk_settings"), "");
            if (!TextUtils.isEmpty(b2)) {
                try {
                    JSONObject jSONObject = new JSONObject(b2);
                    n = jSONObject;
                    if (jSONObject.has("im_config")) {
                        f38184m = n.optJSONObject("im_config");
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static int o() {
        String b2 = b("ws_report_interval");
        if (TextUtils.isEmpty(b2)) {
            return -1;
        }
        try {
            return Integer.parseInt(b2);
        } catch (Exception e2) {
            if (e.f37627a == null || !d.a().b().af) {
                new i().a("imsdk_exception").a("error_stack", Log.getStackTraceString(e2)).a("error_msg", "getWsReportIntervalSec").b();
            } else {
                e.f37627a.a((Throwable) e2);
            }
            return -1;
        }
    }

    public static Map<String, String> a(List<Config> list) {
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (Config config : list) {
                hashMap.put(config.conf_name, config.conf_value);
            }
        }
        return hashMap;
    }

    public static double a(String str) {
        String b2 = b("app_log_rate");
        try {
            if (TextUtils.isEmpty(b2)) {
                return d.a().b().aH;
            }
            JSONObject jSONObject = new JSONObject(b2);
            double optDouble = jSONObject.optDouble("default_rate", 0.0d);
            if (jSONObject.has(str)) {
                return jSONObject.optDouble(str, 0.0d);
            }
            return optDouble;
        } catch (Exception e2) {
            f.b("imsdk", "getEvenSample err ", e2);
            e2.printStackTrace();
            return d.a().b().aH;
        }
    }

    private static String b(String str) {
        Object opt;
        JSONObject jSONObject = f38184m;
        if (jSONObject != null && (opt = jSONObject.opt(str)) != null) {
            return opt.toString();
        }
        if (f38183l == null) {
            com.google.gson.f fVar = h.f38770a;
            s.a();
            GetConfigsResponseBody getConfigsResponseBody = (GetConfigsResponseBody) fVar.a(s.f38859a.b(s.a("imsdk_cloud_config"), ""), GetConfigsResponseBody.class);
            if (getConfigsResponseBody != null) {
                f38183l = a(getConfigsResponseBody.configs);
            } else {
                f38183l = new HashMap();
            }
        }
        return f38183l.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(org.json.JSONObject r2) {
        /*
            java.lang.String r1 = "data"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x000e
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 == 0) goto L_0x0052
        L_0x000e:
            java.lang.String r1 = "app"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0053
            org.json.JSONObject r2 = r2.optJSONObject(r1)
        L_0x001a:
            if (r2 == 0) goto L_0x0052
        L_0x001c:
            java.lang.String r1 = "sdk_key_imsdk"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0052
            org.json.JSONObject r0 = r2.optJSONObject(r1)
            com.bytedance.im.core.internal.a.n = r0
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003e
            com.bytedance.im.core.internal.utils.s.a()
            java.lang.String r0 = r2.toString()
            com.bytedance.im.core.internal.utils.s.c(r0)
        L_0x003e:
            org.json.JSONObject r0 = com.bytedance.im.core.internal.a.n
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "im_config"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x0052
            org.json.JSONObject r0 = com.bytedance.im.core.internal.a.n
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            com.bytedance.im.core.internal.a.f38184m = r0
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r1 = "settings"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x001c
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.a(org.json.JSONObject):void");
    }
}
