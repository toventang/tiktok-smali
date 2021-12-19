package com.bytedance.helios.sdk.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.c;
import com.bytedance.helios.api.b.e;
import com.bytedance.helios.api.b.f;
import com.bytedance.helios.api.b.m;
import com.bytedance.helios.api.b.q;
import com.bytedance.helios.api.b.r;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30819a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String[] f30820b = {"EventName"};

    /* renamed from: c  reason: collision with root package name */
    private final String[] f30821c = {"MethodTimeCost"};

    static {
        Covode.recordClassIndex(17905);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(17906);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.helios.api.b.c
    public final void a(f fVar) {
        l.c(fVar, "");
        if (fVar instanceof m) {
            m mVar = (m) fVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(this.f30820b[0], "MethodTimeCost");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f30821c[0] + '_' + mVar.f30670a, mVar.f30671b);
            com.bytedance.apm.b.a("sky_eye_apm_log", jSONObject, jSONObject2, (JSONObject) null);
        } else if (fVar instanceof q) {
            a((q) fVar);
        } else if (fVar instanceof r) {
            r rVar = (r) fVar;
            JSONObject jSONObject3 = new JSONObject();
            String str = rVar.f30703a;
            if (str == null) {
                str = "null";
            }
            jSONObject3.put("code", str);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("message", rVar.f30704b);
            com.bytedance.apm.b.a("helios_upload_alog", jSONObject3, (JSONObject) null, jSONObject4);
            com.bytedance.helios.sdk.utils.f.a("Helios-Apm-Monitor-Event", "helios_upload_alog\n" + jSONObject3 + '\n' + jSONObject4, (String) null, 12);
        } else if (fVar instanceof com.bytedance.helios.api.b.a.a) {
            com.bytedance.helios.api.b.a.a aVar = (com.bytedance.helios.api.b.a.a) fVar;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("appops_api_name", aVar.f30645a + '-' + aVar.f30646b);
            com.bytedance.apm.b.a("helios_appops_api_count", jSONObject5, (JSONObject) null, (JSONObject) null);
            com.bytedance.helios.sdk.utils.f.a("Helios-Apm-Monitor-Event", "helios_appops_api_count\n".concat(String.valueOf(jSONObject5)), (String) null, 12);
        }
    }

    private static void a(q qVar) {
        l.c(qVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("date", qVar.f30697a);
        jSONObject.put("app_ops_config", qVar.f30700d.f30693a);
        jSONObject.put("auto_start_config", qVar.f30700d.f30694b);
        e eVar = qVar.f30700d.f30696d;
        jSONObject.put("default_monitor_normal", eVar.f30656a);
        jSONObject.put("default_monitor_error", eVar.f30657b);
        jSONObject.put("default_intercept_error", eVar.f30658c);
        for (Map.Entry<String, e> entry : qVar.f30701e.entrySet()) {
            jSONObject.put(entry.getKey() + "_monitor_normal", entry.getValue().f30656a);
            jSONObject.put(entry.getKey() + "_monitor_error", entry.getValue().f30657b);
            jSONObject.put(entry.getKey() + "_intercept_error", entry.getValue().f30658c);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("device_id", qVar.f30698b);
        jSONObject2.put("hash_code", qVar.f30699c);
        for (Map.Entry<Integer, e> entry2 : qVar.f30702f.entrySet()) {
            jSONObject.put(entry2.getKey().intValue() + "_monitor_normal", entry2.getValue().f30656a);
            jSONObject.put(entry2.getKey().intValue() + "_monitor_error", entry2.getValue().f30657b);
            jSONObject.put(entry2.getKey().intValue() + "_intercept_error", entry2.getValue().f30658c);
        }
        com.bytedance.apm.b.a("helios_sample_rate", jSONObject, (JSONObject) null, jSONObject2);
        com.bytedance.helios.sdk.utils.f.a("Helios-Apm-Monitor-Event", "helios_sample_rate\n" + jSONObject + '\n' + jSONObject2, (String) null, 12);
    }
}
