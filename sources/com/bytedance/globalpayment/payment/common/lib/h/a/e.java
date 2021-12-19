package com.bytedance.globalpayment.payment.common.lib.h.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.framwork.core.sdkmonitor.k;
import com.bytedance.globalpayment.payment.common.lib.b;
import com.bytedance.globalpayment.payment.common.lib.b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements com.bytedance.globalpayment.payment.common.lib.h.b.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f30583a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private k f30584b;

    /* renamed from: c  reason: collision with root package name */
    private final b<k> f30585c = new b<k>() {
        /* class com.bytedance.globalpayment.payment.common.lib.h.a.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17731);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public k a() {
            String str;
            JSONObject jSONObject = new JSONObject();
            a c2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().c();
            final com.bytedance.globalpayment.payment.common.lib.f.a e2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().e();
            try {
                jSONObject.put("device_id", c2.f30516k);
                jSONObject.put("host_aid", e2.f30557a);
                jSONObject.put("sdk_version", "1.0");
                jSONObject.put("channel", e2.f30561e);
                jSONObject.put("app_version", e2.f30559c);
                jSONObject.put("update_version_code", e2.f30560d);
            } catch (Throwable unused) {
            }
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(c2.f30509d)) {
                str = "https://mon.isnssdk.com/monitor";
            } else {
                str = c2.f30509d;
            }
            SDKMonitorUtils.a("4108", Collections.singletonList(sb.append(str).append("/monitor/appmonitor/v2/settings").toString()));
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://mon.isnssdk.com/monitor/collect/");
            arrayList.add("https://i.isnssdk.com/monitor/collect/");
            SDKMonitorUtils.b("4108", arrayList);
            SDKMonitorUtils.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), "4108", jSONObject, new k.a() {
                /* class com.bytedance.globalpayment.payment.common.lib.h.a.e.AnonymousClass1.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(17732);
                }

                @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                public final String a() {
                    return null;
                }

                @Override // com.bytedance.framwork.core.sdkmonitor.k.a
                public final Map<String, String> b() {
                    HashMap hashMap = new HashMap();
                    if (e2.f30563g) {
                        hashMap.put("oversea", "1");
                    } else {
                        hashMap.put("oversea", "0");
                    }
                    return hashMap;
                }
            });
            return SDKMonitorUtils.a("4108");
        }
    };

    static {
        Covode.recordClassIndex(17730);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.e
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f30584b == null) {
            this.f30584b = this.f30585c.b();
        }
        if (this.f30584b != null) {
            if (com.bytedance.globalpayment.payment.common.lib.h.a.a().i().a()) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("event_name", str);
                    jSONObject4.put("category", jSONObject);
                    jSONObject4.put("metric", jSONObject2);
                    jSONObject4.put("extra", jSONObject3);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            }
            this.f30584b.a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
