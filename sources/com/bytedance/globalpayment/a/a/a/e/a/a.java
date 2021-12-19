package com.bytedance.globalpayment.a.a.a.e.a;

import android.text.TextUtils;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.d.e;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.a.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends com.bytedance.globalpayment.a.a.a.e.b.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f30184a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17532);
    }

    @Override // com.bytedance.globalpayment.a.a.a.e.b.a
    public final void a(final long j2, final String str, final String str2, final com.bytedance.globalpayment.payment.common.lib.a.a<e> aVar) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().c().b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.a.a.a.e.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17533);
            }

            public final void run() {
                String str;
                String str2;
                String str3 = str2;
                if (TextUtils.isEmpty(str3)) {
                    str = com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a() + "/payment/v1/cashier_starling";
                } else {
                    str = str3 + "/payment/v1/cashier_starling";
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("version", j2);
                    jSONObject.put("language", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                j.a aVar = new j.a();
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Content-Type", "application/json");
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a(str, jSONObject.toString().getBytes(), hashMap, aVar, new b() {
                        /* class com.bytedance.globalpayment.a.a.a.e.a.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17534);
                        }

                        @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                        public final void a(AbsResult absResult) {
                            aVar.a(absResult);
                        }

                        @Override // com.bytedance.globalpayment.payment.common.lib.a.b
                        public final void a(String str) {
                            String str2;
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                if (TextUtils.equals(jSONObject.optString("result_code"), "success")) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("text_package");
                                    if (optJSONObject != null) {
                                        Map<String, String> a2 = com.bytedance.globalpayment.payment.common.lib.j.b.a(optJSONObject);
                                        if (a2.size() > 0) {
                                            aVar.a(new e(str, jSONObject.optLong("version"), a2, optJSONObject.toString()));
                                            return;
                                        }
                                    }
                                    str2 = "request starling data success but data is null";
                                } else {
                                    str2 = "request starling data error:".concat(String.valueOf(str));
                                }
                            } catch (JSONException e2) {
                                str2 = e2.getMessage();
                            }
                            aVar.a(new AbsResult().withMessage(str2));
                        }
                    });
                    str2 = "";
                } catch (Throwable th) {
                    str2 = "request starling data exception:" + th.getLocalizedMessage();
                }
                aVar.a(new AbsResult().withMessage(str2));
            }
        });
    }
}
