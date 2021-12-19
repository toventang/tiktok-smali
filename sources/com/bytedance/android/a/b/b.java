package com.bytedance.android.a.b;

import android.net.Uri;
import com.bytedance.android.a.a.e.a;
import com.bytedance.android.a.a.h.e;
import com.bytedance.android.a.b.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.d.q;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f6687a;

    static {
        Covode.recordClassIndex(3218);
    }

    public final void b() {
        a("c2s_network_type_on_retry", e.f6671a.b(), (JSONObject) null);
    }

    public static b a() {
        MethodCollector.i(11615);
        if (f6687a == null) {
            synchronized (b.class) {
                try {
                    if (f6687a == null) {
                        f6687a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11615);
                    throw th;
                }
            }
        }
        b bVar = f6687a;
        MethodCollector.o(11615);
        return bVar;
    }

    public final void a(c cVar, long j2) {
        String str;
        Map<String, List<String>> map;
        List<String> list;
        com.bytedance.android.a.a.d.b bVar;
        if (cVar != null) {
            int i2 = cVar.f6704a;
            JSONObject b2 = b(j2);
            JSONObject jSONObject = new JSONObject();
            long j3 = -1;
            com.bytedance.android.a.b.b.b bVar2 = cVar.f6708e;
            JSONObject jSONObject2 = null;
            if (bVar2 == null || (bVar = bVar2.f6699e) == null) {
                str = null;
            } else {
                if (bVar.f6622d) {
                    j3 = bVar.f6621c;
                } else {
                    j3 = bVar.f6623e;
                }
                jSONObject2 = bVar.f6626h;
                str = bVar.f6625g;
            }
            try {
                jSONObject.put("cid", j3);
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.putOpt("log_extra", str);
                jSONObject = com.bytedance.android.a.a.h.c.a(cVar.f6709f, jSONObject);
                if (bVar2 != null) {
                    jSONObject.put("method", bVar2.f6697c);
                }
                if (!cVar.a()) {
                    if (bVar2 != null) {
                        jSONObject.put("url", bVar2.f6696b);
                    }
                    if (i2 == 302 && (map = cVar.f6706c) != null && map.containsKey(q.f30918b) && (list = map.get(q.f30918b)) != null && !list.isEmpty()) {
                        jSONObject.putOpt("url_302", list.get(0));
                    }
                }
                if (bVar2 != null) {
                    jSONObject.put("host", Uri.parse(bVar2.f6696b).getHost());
                }
            } catch (Throwable unused) {
            }
            a("c2s_network_response_status", i2, b2, jSONObject);
        }
    }
}
