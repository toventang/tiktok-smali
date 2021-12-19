package com.ss.android.ugc.aweme.ay;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b.i;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a.a;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ttnet.d.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements k {
    static {
        Covode.recordClassIndex(41736);
    }

    private static void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", c.a.f28835a.a());
                jSONObject.put("cdn_nt_band_width", a.C0619a.f28827a.a());
                jSONObject.put("cronet_open", com.bytedance.ttnet.a.a.a(d.a()).g());
                jSONObject.put("cronet_plugin_install", false);
                jSONObject.put("cronet_plugin_version", -1);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f28917e);
                jSONObject.put("responseBack", bVar.f28918f);
                jSONObject.put("completeReadResponse", bVar.f28919g);
                jSONObject.put("appLevelRequestStart", bVar.f28915c);
                jSONObject.put("beforeAllInterceptors", bVar.f28916d);
                jSONObject.put("requestEnd", bVar.f28920h);
                jSONObject.put("recycleCount", bVar.f28921i);
                if (com.bytedance.ttnet.c.a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                if (bVar.v == 0) {
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
                }
                if (bVar.z != null) {
                    jSONObject.put("req_info", bVar.z);
                }
                jSONObject.put("download", bVar.A);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ay.k
    public final void a(final long j2, final long j3, final String str, final b bVar, final Throwable th) {
        i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.ay.g.AnonymousClass1 */

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ JSONObject f67802f = null;

            static {
                Covode.recordClassIndex(41737);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                b bVar;
                o.b("aweme_image_api", "", g.a(false, j2, j3, str, bVar, th));
                try {
                    String[] strArr = new String[1];
                    com.bytedance.ies.b.a.a.a(th, strArr);
                    if (m.a(strArr[0]) && (bVar = bVar) != null) {
                        strArr[0] = bVar.f28913a;
                    }
                    JSONObject jSONObject = this.f67802f;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    g.a(bVar, jSONObject);
                    com.bytedance.c.a.a.a.a();
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.ay.k
    public final void a(long j2, long j3, String str, b bVar, JSONObject jSONObject) {
        o.b("aweme_image_api", "", a(true, j2, j3, str, bVar, null));
        try {
            String[] strArr = new String[1];
            if (m.a(strArr[0]) && bVar != null) {
                strArr[0] = bVar.f28913a;
            }
            a(bVar, jSONObject);
            com.bytedance.c.a.a.a.a();
        } catch (Throwable unused) {
        }
    }

    public static JSONObject a(boolean z, long j2, long j3, String str, b bVar, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
            strArr[0] = bVar.f28913a;
            if (bVar.f28914b != null) {
                if (((com.bytedance.ttnet.d.d) bVar.f28914b).s > 0) {
                    jSONObject.put("index", ((com.bytedance.ttnet.d.d) bVar.f28914b).s);
                }
                if (((com.bytedance.ttnet.d.d) bVar.f28914b).r > 0) {
                    jSONObject.put("httpIndex", ((com.bytedance.ttnet.d.d) bVar.f28914b).r);
                }
            }
        }
        if (bVar != null) {
            jSONObject.put("requestStart", bVar.f28917e);
            jSONObject.put("responseBack", bVar.f28918f);
            jSONObject.put("completeReadResponse", bVar.f28919g);
            jSONObject.put("requestEnd", bVar.f28920h);
            jSONObject.put("recycleCount", bVar.f28921i);
            if (bVar.v == 0) {
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
            }
            jSONObject.put("download", bVar.A);
        }
        if (com.bytedance.ttnet.c.a()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        jSONObject.put("networkQuality", c.a.f28835a.a().toString());
        jSONObject.put("downloadSpeed", (int) c.a.f28835a.b());
        if (!z && th != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", Uri.parse(str));
        }
        if (j3 > 0) {
            jSONObject.put("timestamp", j3);
        }
        int i2 = 200;
        if (!z) {
            i2 = com.bytedance.ies.b.a.a.a(th, strArr);
        }
        jSONObject.put("status", i2);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        Context applicationContext = d.a().getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        if (j.f107228g == NetworkUtils.h.NONE || !j.b() || j.c()) {
            j.f107228g = NetworkUtils.getNetworkType(applicationContext);
        }
        jSONObject.put("network_type", j.f107228g.getValue());
        return jSONObject;
    }
}
