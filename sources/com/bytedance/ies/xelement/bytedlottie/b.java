package com.bytedance.ies.xelement.bytedlottie;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36815b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f36816a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Long> f36817c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Long> f36818d = new HashMap<>();

    static {
        Covode.recordClassIndex(22095);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22096);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.f36818d.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public b(String str) {
        this.f36816a = str;
    }

    public final void b(String str) {
        if (str != null && this.f36818d.containsKey(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = this.f36818d.get(str);
            if (l2 != null) {
                l.a((Object) l2, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resource_url", str);
                jSONObject.put("lottie_url", str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cost", currentTimeMillis - l2.longValue());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("virtual_aid", this.f36816a);
                HybridMonitor.getInstance().customReport(str, "", "lottie_fetch_total_cost", jSONObject, jSONObject2, null, jSONObject3, true);
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "1");
        jSONObject.put("resource_url", str2);
        jSONObject.put("lottie_url", str);
        jSONObject.put("message", str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.f36816a);
        HybridMonitor.getInstance().customReport(str, "", "lottie_fetch_error", jSONObject, null, null, jSONObject2, true);
    }

    public final void a(String str, String str2, Float f2, Float f3, Float f4, Float f5, Boolean bool) {
        if (!l.a(f2, 0.0f)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bid", str2);
            jSONObject.put("lottie_src", str);
            jSONObject.put("frame_rate", String.valueOf(f3));
            jSONObject.put("frame_num", String.valueOf(f4));
            jSONObject.put("real_frame", String.valueOf(f2));
            jSONObject.put("ideal_time", String.valueOf(f5));
            jSONObject.put("loop", String.valueOf(bool));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("virtual_aid", this.f36816a);
            LLog.a("byted-lottie", "lottieUrl is " + str + ", bid is " + str2 + ", realFrame is " + f2);
            HybridMonitor.getInstance().customReport(str, "", "lottie_animation_performance", jSONObject, null, null, jSONObject2, true);
        }
    }
}
