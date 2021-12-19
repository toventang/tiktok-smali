package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f134282a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f134283b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f134284c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f134285d;

    private b() {
    }

    static {
        Covode.recordClassIndex(87819);
    }

    public static void a(int i2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i2);
            jSONObject.put("taskId", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.apm.b.a("campaign_task_finish_monitor", jSONObject, (JSONObject) null, (JSONObject) null);
    }

    public static void a(int i2, int i3) {
        if (i2 == 4) {
            if (!f134283b) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 4);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.apm.b.a("pendant_self_show_monitor", jSONObject, (JSONObject) null, (JSONObject) null);
                r.a("pendant_feed_page_show", new d().a("pendant_version", i3).f66730a);
                f134283b = true;
            }
        } else if (i2 == 6) {
            if (!f134284c) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("status", 6);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                com.bytedance.apm.b.a("pendant_self_show_monitor", jSONObject2, (JSONObject) null, (JSONObject) null);
                r.a("pendant_self_show", new d().a("pendant_version", i3).f66730a);
                f134284c = true;
            }
        } else if (i2 == 5 && !f134285d) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("status", 5);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            com.bytedance.apm.b.a("pendant_self_show_monitor", jSONObject3, (JSONObject) null, (JSONObject) null);
            r.a("overall_switch_show", new d().a("pendant_version", i3).f66730a);
            f134285d = true;
        }
    }
}
