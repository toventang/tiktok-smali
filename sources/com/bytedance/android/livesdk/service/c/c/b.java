package com.bytedance.android.livesdk.service.c.c;

import android.os.Build;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.utils.a.a;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21368a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(12588);
    }

    static String a() {
        long a2 = a.a();
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(h.class);
        l.b(a3, "");
        Map<String, Double> a4 = ((h) a3).a();
        long a5 = a.a() - a2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                jSONObject.put("cpu_speed", a4.get("cpu_speed"));
            } else {
                jSONObject.put("cpu_rate", a4.get("cpu_rate"));
            }
            jSONObject.put("cost", a5);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    static String b() {
        long a2 = a.a();
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(h.class);
        l.b(a3, "");
        Map<String, Long> b2 = ((h) a3).b();
        long a4 = a.a() - a2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("java_total", b2.get("mem_java_total"));
            jSONObject.put("java_free", b2.get("mem_java_free"));
            jSONObject.put("java_used", b2.get("mem_java_used"));
            jSONObject.put("pss_dalvik", b2.get("mem_pss_dalvik"));
            jSONObject.put("pss_native", b2.get("mem_pss_native"));
            jSONObject.put("pss_total", b2.get("mem_pss_total"));
            jSONObject.put("graphics", b2.get("mem_graphics"));
            jSONObject.put("vmsize", b2.get("mem_vmsize"));
            jSONObject.put("cost", a4);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    static String a(boolean z) {
        JSONObject e2;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            try {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(d.class);
                l.b(a2, "");
                k livePlayController = ((d) a2).getLivePlayController();
                if (!(livePlayController == null || (e2 = livePlayController.e()) == null)) {
                    jSONObject.put("preview_fps", e2.optDouble("render_fps:", -1.0d));
                    jSONObject.put("real_fps", e2.optDouble("push_client_fps:", -1.0d));
                    jSONObject.put("pull_cdn_ip", e2.optString("cdn_ip:", ""));
                    jSONObject.put("pull_play_url", e2.optString("url:", ""));
                    jSONObject.put("pull_download_speed", e2.optLong("download_Speed:", -1));
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject.toString();
    }
}
