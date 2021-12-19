package com.ss.android.ugc.aweme.bs;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.net.i.g;
import h.f.b.l;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f68803a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(42375);
    }

    public static void a(Request request, String str, a<?> aVar, b bVar) {
        boolean z;
        l.d(request, "");
        l.d(str, "");
        l.d(aVar, "");
        l.d(bVar, "");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wait_duration", aVar.f28916d - aVar.f28915c);
            jSONObject.put("interceptors_pre_duration", aVar.f28917e - aVar.f28916d);
            jSONObject.put("request_duration", aVar.f28918f - aVar.f28917e);
            jSONObject.put("read_response_duration", aVar.f28920h - aVar.f28918f);
            jSONObject.put("parse_response_duration", bVar.T);
            jSONObject.put("interceptors_after_duration", bVar.V);
            jSONObject.put("api_duration", bVar.U - bVar.f42596g);
            if (aVar.f28922j > 0) {
                jSONObject.put("timing_dns", aVar.f28922j);
            }
            if (aVar.f28923k > 0) {
                jSONObject.put("timing_connect", aVar.f28923k);
            }
            if (aVar.f28924l > 0) {
                jSONObject.put("timing_ssl", aVar.f28924l);
            }
            if (aVar.f28925m > 0) {
                jSONObject.put("timing_send", aVar.f28925m);
            }
            if (aVar.q > 0) {
                jSONObject.put("timing_waiting", aVar.q);
            }
            if (aVar.o > 0) {
                jSONObject.put("timing_receive", aVar.o);
            }
            if (aVar.r > 0) {
                jSONObject.put("timing_total", aVar.r);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (request.tag(g.class) != null) {
                z = true;
            } else {
                z = false;
            }
            JSONObject put = jSONObject2.put("is_create_from_RetrofitFactory", z).put("path", request.getPath());
            JSONObject put2 = new JSONObject().put("host", request.getHost()).put("x-tt-logid", str);
            if (bVar.Q != null) {
                for (Map.Entry<String, Long> entry : bVar.Q.entrySet()) {
                    Long value = entry.getValue();
                    l.b(value, "");
                    jSONObject.put(entry.getKey() + "_duration", value.longValue());
                }
            }
            b.a("api_time_log", put, jSONObject, put2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
