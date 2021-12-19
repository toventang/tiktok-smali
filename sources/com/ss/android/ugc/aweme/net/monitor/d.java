package com.ss.android.ugc.aweme.net.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a.a;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.d.b;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.net.c.a;
import com.ss.android.ugc.aweme.net.j;
import com.toutiao.proxyserver.net.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a {
    static {
        Covode.recordClassIndex(72276);
    }

    public d(Context context) {
        super(context);
    }

    private static void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("url", "");
        if (!TextUtils.isEmpty(optString) && !optString.endsWith("jpeg")) {
            if (optString.contains("/aweme/v") || optString.contains("/tfe/api/") || optString.contains("/user/info/") || optString.contains("/passport/") || optString.contains("/ies/speed/")) {
                o.a("api_libra", jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.net.c.a
    public final void a(b bVar, JSONObject jSONObject) {
        if (bVar != null) {
            try {
                jSONObject.put("nt_band_width", c.a.f28835a.a());
                jSONObject.put("cdn_nt_band_width", a.C0619a.f28827a.a());
                jSONObject.put("cronet_open", com.bytedance.ttnet.a.a.a(TTNetInit.getTTNetDepend().a()).g());
                TTNetInit.getTTNetDepend();
                jSONObject.put("cronet_plugin_install", true);
            } catch (Throwable unused) {
            }
            try {
                jSONObject.put("requestStart", bVar.f28917e);
                jSONObject.put("responseBack", bVar.f28918f);
                jSONObject.put("completeReadResponse", bVar.f28919g);
                jSONObject.put("appLevelRequestStart", bVar.f28915c);
                jSONObject.put("beforeAllInterceptors", bVar.f28916d);
                jSONObject.put("requestEnd", bVar.f28920h);
                jSONObject.put("recycleCount", bVar.f28921i);
                jSONObject.put("timing_dns", bVar.f28922j);
                jSONObject.put("timing_connect", bVar.f28923k);
                jSONObject.put("timing_ssl", bVar.f28924l);
                jSONObject.put("timing_send", bVar.f28925m);
                jSONObject.put("timing_waiting", bVar.q);
                jSONObject.put("timing_receive", bVar.o);
                jSONObject.put("timing_total", bVar.r);
                jSONObject.put("timing_isSocketReused", bVar.p);
                jSONObject.put("timing_totalSendBytes", bVar.s);
                jSONObject.put("timing_totalReceivedBytes", bVar.t);
                jSONObject.put("timing_remoteIP", bVar.f28913a);
                jSONObject.put("request_log", bVar.y);
                if (bVar.z != null) {
                    jSONObject.put("req_info", bVar.z);
                }
                jSONObject.put("download", bVar.A);
                if (bVar instanceof f) {
                    jSONObject.put("player_id", ((f) bVar).O);
                    jSONObject.put("video_cache_use_ttnet", ((f) bVar).P);
                    jSONObject.put("video_cache_retry_count", ((f) bVar).Q);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.net.c.a
    public final void a(long j2, long j3, String str, String str2, String str3, b bVar, JSONObject jSONObject) {
        try {
            if (com.bytedance.ttnet.c.a()) {
                jSONObject.put("netClientType", "CronetClient");
            } else {
                jSONObject.put("netClientType", "TTOkhttp3Client");
            }
            jSONObject.put("networkQuality", c.a.f28835a.a().toString());
            jSONObject.put("downloadSpeed", (int) c.a.f28835a.b());
            jSONObject.put("cronet_plugin_install", j.a().b().o.a());
            jSONObject.put("cronet_plugin_version", j.a().b().p.a());
            if (bVar != null) {
                jSONObject.put("addExecutorToAllInterceptors", bVar.f28916d - bVar.f28915c);
                jSONObject.put("addExecutorTime", bVar.f28915c);
                jSONObject.put("allInterceptorsTime", bVar.f28917e - bVar.f28916d);
                jSONObject.put("fallback", bVar.w);
                jSONObject.put("requestHeader", bVar.B);
                jSONObject.put("responseHeader", bVar.C);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        o.a(j2, j3, str, str3, str2, 200, jSONObject);
        try {
            int intValue = j.a().b().n.a().intValue();
            if (intValue > 0) {
                jSONObject.put("libra_id", intValue);
                jSONObject.put("status", "200");
                jSONObject.put("duration", j2);
                jSONObject.put("url", str);
                jSONObject.put("trace_code", str2);
                a(jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0370, code lost:
        if (r3 >= 0) goto L_0x0386;
     */
    @Override // com.ss.android.ugc.aweme.net.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r15, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.bytedance.ttnet.d.b r22, java.lang.Throwable r23, org.json.JSONObject r24) {
        /*
        // Method dump skipped, instructions count: 1111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.monitor.d.a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.d.b, java.lang.Throwable, org.json.JSONObject):void");
    }
}
