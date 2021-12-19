package com.bytedance.globalpayment.iap.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private long f30243a;

    /* renamed from: b  reason: collision with root package name */
    private String f30244b;

    /* renamed from: c  reason: collision with root package name */
    private String f30245c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30246d;

    /* renamed from: e  reason: collision with root package name */
    private int f30247e;

    /* renamed from: f  reason: collision with root package name */
    private OrderData f30248f;

    static {
        Covode.recordClassIndex(17557);
    }

    public final void a() {
        this.f30243a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f30244b);
        add(jSONObject, "request_id", this.f30245c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f30247e);
        add(jSONObject2, "is_subscription", this.f30246d);
        add(jSONObject2, "payment_method", this.f30248f.getIapPaymentMethod().channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_query_order_state_start", jSONObject2, null, jSONObject);
    }

    public final void a(boolean z, int i2, d dVar) {
        long j2;
        long j3 = 0;
        if (this.f30243a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30243a;
        } else {
            j2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "time_consuming", j2);
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            j3 = 1;
        }
        add(jSONObject2, "status", j3);
        add(jSONObject2, "order_state", (long) i2);
        add(jSONObject2, "is_subscription", this.f30246d);
        add(jSONObject2, "payment_method", this.f30248f.getIapPaymentMethod().channelName);
        if (dVar != null) {
            add(jSONObject2, "result_code", (long) dVar.getCode());
            add(jSONObject2, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject2, "result_message", dVar.getMessage());
        } else {
            add(jSONObject2, "result_code", -1L);
            add(jSONObject2, "result_detail_code", -1L);
            add(jSONObject2, "result_message", "unknown");
        }
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f30244b);
        add(jSONObject3, "request_id", this.f30245c);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_query_order_state_end", jSONObject2, jSONObject, jSONObject3);
    }

    public c(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f30244b = str;
        this.f30245c = str2;
        this.f30246d = z;
        this.f30248f = orderData;
        if (payType != null) {
            this.f30247e = payType.ordinal();
        } else {
            this.f30247e = -1;
        }
    }
}
