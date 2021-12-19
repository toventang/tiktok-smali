package com.bytedance.globalpayment.iap.google.helper;

import com.android.billingclient.api.Purchase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f30436a;

    static {
        Covode.recordClassIndex(17650);
    }

    public static b a() {
        MethodCollector.i(9039);
        if (f30436a == null) {
            synchronized (b.class) {
                try {
                    if (f30436a == null) {
                        f30436a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9039);
                    throw th;
                }
            }
        }
        b bVar = f30436a;
        MethodCollector.o(9039);
        return bVar;
    }

    public final void a(Purchase purchase) {
        JSONObject b2 = b(purchase);
        add(b2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().j().a("billing_query_in_google_updated", b2);
    }

    private JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        return jSONObject;
    }

    private JSONObject b(Purchase purchase) {
        JSONObject jSONObject = new JSONObject();
        if (purchase != null) {
            add(jSONObject, "purchase_gp_order_id", purchase.a());
            add(jSONObject, "purchase_token", purchase.c());
            add(jSONObject, "original_json", purchase.f5773a);
            add(jSONObject, "purchase_signature", purchase.f5774b);
            add(jSONObject, "purchase_sku_id", purchase.b());
            add(jSONObject, "purchase_state", (long) purchase.d());
        } else {
            add(jSONObject, "purchase_gp_order_id", "unknown");
            add(jSONObject, "purchase_token", "unknown");
            add(jSONObject, "original_json", "unknown");
            add(jSONObject, "purchase_signature", "unknown");
            add(jSONObject, "purchase_sku_id", "unknown");
            add(jSONObject, "purchase_state", -1L);
        }
        return jSONObject;
    }

    public final void a(d dVar, List<Purchase> list) {
        String str;
        if (list == null) {
            str = "unknown";
        } else if (list.size() == 0) {
            str = "size is 0";
        } else {
            JSONArray jSONArray = new JSONArray();
            for (Purchase purchase : list) {
                jSONArray.put(b(purchase));
            }
            str = jSONArray.toString();
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", (long) dVar.getCode());
        add(jSONObject, "result_message", dVar.getMessage());
        add(jSONObject, "purchase_list", str);
        add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().j().a("purchase_updated_from_google", jSONObject);
    }

    public final void a(String str, String str2, String str3, String str4, d dVar) {
        JSONObject a2 = a(dVar);
        add(a2, "sku_id", str);
        add(a2, "order_id", str2);
        add(a2, "merchant_id", str3);
        add(a2, "user_id", str4);
        add(a2, "payment_method", IapPaymentMethod.GOOGLE.channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().j().a("query_sku_details_failed", a2);
    }
}
