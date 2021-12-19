package com.bytedance.globalpayment.iap.common.ability.g.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.payment.common.lib.a.a;
import com.bytedance.globalpayment.payment.common.lib.a.b;
import java.util.Map;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f30333a = c.class.getSimpleName();

    static {
        Covode.recordClassIndex(17591);
    }

    public abstract void a(com.bytedance.globalpayment.iap.common.ability.c cVar, OrderData orderData, a<CreateOrderResponseEntity> aVar);

    public abstract void a(String str, String str2, String str3, String str4, boolean z, String str5, a<ResponseEntity> aVar, boolean z2);

    public abstract void a(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, a<ResponseEntity> aVar, boolean z2);

    protected static String a() {
        return b() + "/pipo/trade/v1";
    }

    private static String b() {
        com.bytedance.globalpayment.payment.common.lib.b.c d2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().d();
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (!TextUtils.isEmpty(d2.f30539a)) {
            return d2.f30539a;
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a();
        return com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a();
    }

    protected static String a(String str) {
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (TextUtils.isEmpty(str)) {
            return b() + "/pipo/inner/receipt/v1";
        }
        return str + "/pipo/inner/receipt/v1";
    }

    protected static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return b() + "/pipo/inner/order/query/v1";
        }
        return str + "/pipo/inner/order/query/v1";
    }

    protected static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return b() + "/pipo/inner/subscription/query/v1";
        }
        return str + "/pipo/inner/subscription/query/v1";
    }

    protected static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return b() + "/pipo/inner/subscription/upload_token/v1";
        }
        return str + "/pipo/inner/subscription/upload_token/v1";
    }

    protected static void a(String str, Map<String, String> map, b bVar) {
        map.put("pipo_sdk_version", "1.0");
        String str2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().c().f30516k;
        if (!TextUtils.isEmpty(str2)) {
            map.put("device_id", str2);
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().g().a(str, map, bVar);
    }
}
