package com.ss.android.ugc.aweme.at;

import com.bytedance.apm.trace.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.slardar.config.IConfigManager;
import com.ss.android.common.applog.t;
import com.ss.android.ugc.aweme.at.j;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.experiment.gx;
import com.ss.android.ugc.aweme.power.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i implements b.c, b.d, com.bytedance.services.slardar.config.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f67064d = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private static volatile boolean f67065i;

    /* renamed from: a  reason: collision with root package name */
    public long f67066a = -1;

    /* renamed from: b  reason: collision with root package name */
    public double f67067b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, String> f67068c = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f67069e;

    /* renamed from: f  reason: collision with root package name */
    private String f67070f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f67071g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f67072h;

    static {
        Covode.recordClassIndex(41324);
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void a(JSONObject jSONObject, boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41325);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            l.d(str, "");
            if (l.a((Object) str, (Object) "system_launch") || l.a((Object) str, (Object) "system_launch_1_minute") || l.a((Object) str, (Object) "system_launch_1_minute_feed") || l.a((Object) str, (Object) "system_launch_2_minute") || l.a((Object) str, (Object) "system_launch_2_minute_feed")) {
                return true;
            }
            return false;
        }
    }

    private final void a() {
        this.f67068c.clear();
        this.f67066a = -1;
        this.f67067b = -1.0d;
        this.f67071g = null;
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void d() {
        f67065i = true;
        ((IConfigManager) c.a(IConfigManager.class)).unregisterConfigListener(this);
        if (this.f67071g != null) {
            b();
        }
    }

    private final void b() {
        String str;
        String str2 = this.f67070f;
        l.d(str2, "");
        if (!com.bytedance.apm.n.c.a("fps", str2) || this.f67066a <= 0 || this.f67067b <= 0.0d || this.f67071g == null) {
            a();
            return;
        }
        HashMap<String, String> hashMap = this.f67068c;
        d a2 = d.a();
        l.b(a2, "");
        if (a2.f115709a) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_battery_saver", str);
        String str3 = this.f67070f;
        double d2 = this.f67067b;
        long j2 = this.f67066a;
        JSONObject jSONObject = this.f67071g;
        HashMap<String, String> hashMap2 = this.f67068c;
        l.d(str3, "");
        l.d(hashMap2, "");
        s sVar = new s();
        if (hashMap2.size() > 0) {
            for (String str4 : hashMap2.keySet()) {
                sVar.a(str4, hashMap2.get(str4));
            }
        }
        t.a().b(new j.a(sVar, str3, j2, d2, jSONObject));
        a();
    }

    @Override // com.bytedance.apm.trace.b.b.d
    public final void a(double d2) {
        this.f67067b = d2;
    }

    public i(String str) {
        l.d(str, "");
        this.f67070f = str;
        this.f67069e = false;
    }

    @Override // com.bytedance.apm.trace.b.b.c
    public final void a(JSONObject jSONObject) {
        String str;
        this.f67071g = jSONObject;
        if (!f67065i && gx.f() && !this.f67072h && a.a(this.f67070f)) {
            this.f67072h = true;
            ((IConfigManager) c.a(IConfigManager.class)).registerConfigListener(this);
        }
        boolean a2 = a.a(this.f67070f);
        if (a2) {
            HashMap<String, String> hashMap = this.f67068c;
            d a3 = d.a();
            l.b(a3, "");
            if (a3.f115709a) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_battery_saver", str);
            String str2 = this.f67070f;
            double d2 = this.f67067b;
            long j2 = this.f67066a;
            JSONObject jSONObject2 = this.f67071g;
            HashMap<String, String> hashMap2 = this.f67068c;
            l.d(str2, "");
            s sVar = new s();
            if (hashMap2 != null) {
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    sVar.a(entry.getKey(), entry.getValue());
                }
            }
            j.a(sVar, str2, j2, d2, jSONObject2);
            JSONObject a4 = sVar.a();
            JSONObject jSONObject3 = new JSONObject();
            Object remove = a4.remove("ui_scene");
            if (remove != null) {
                jSONObject3.put("ui_scene", remove);
            }
            Object remove2 = a4.remove("is_battery_saver");
            if (remove2 != null) {
                jSONObject3.put("is_battery_saver", remove2);
            }
            com.bytedance.apm.b.a("system_launch_ui_sample_report", jSONObject3, a4, (JSONObject) null);
        }
        if (!gx.f() || !a2 || f67065i) {
            b();
        }
    }
}
