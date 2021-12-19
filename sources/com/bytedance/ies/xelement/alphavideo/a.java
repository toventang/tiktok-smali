package com.bytedance.ies.xelement.alphavideo;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0889a f36629a = new C0889a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f36630b;

    static {
        Covode.recordClassIndex(22000);
    }

    /* renamed from: com.bytedance.ies.xelement.alphavideo.a$a  reason: collision with other inner class name */
    public static final class C0889a {
        static {
            Covode.recordClassIndex(22001);
        }

        private C0889a() {
        }

        public /* synthetic */ C0889a(byte b2) {
            this();
        }
    }

    public a(String str) {
        this.f36630b = str;
    }

    public final void a(String str, String str2, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", String.valueOf(i2));
        jSONObject.put("resource_url", str);
        jSONObject.put("message", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", this.f36630b);
        HybridMonitor.getInstance().customReport(str, "", "alpha_video_runtime_error", jSONObject, null, null, jSONObject2, true);
    }
}
