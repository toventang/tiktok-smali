package com.bytedance.globalpayment.iap.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private String f30236a;

    /* renamed from: b  reason: collision with root package name */
    private String f30237b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30238c;

    /* renamed from: d  reason: collision with root package name */
    private int f30239d;

    /* renamed from: e  reason: collision with root package name */
    private long f30240e;

    /* renamed from: f  reason: collision with root package name */
    private long f30241f;

    /* renamed from: g  reason: collision with root package name */
    private OrderData f30242g;

    static {
        Covode.recordClassIndex(17556);
    }

    public final void a() {
        this.f30241f = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f30236a);
        add(jSONObject, "request_id", this.f30237b);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f30239d);
        add(jSONObject2, "is_subscription", this.f30238c);
        add(jSONObject2, "payment_method", this.f30242g.getIapPaymentMethod().channelName);
        JSONObject jSONObject3 = new JSONObject();
        long j2 = 0;
        if (this.f30240e > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30240e;
        }
        add(jSONObject3, "time_consuming", j2);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_create_order_start", jSONObject2, jSONObject3, jSONObject);
    }

    public final void a(boolean z, AbsResult absResult) {
        long j2;
        long j3 = 0;
        if (this.f30241f > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30241f;
        } else {
            j2 = 0;
        }
        this.f30241f = 0;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            j3 = 1;
        }
        add(jSONObject, "status", j3);
        add(jSONObject, "pay_type", (long) this.f30239d);
        add(jSONObject, "is_subscription", this.f30238c);
        add(jSONObject, "payment_method", this.f30242g.getIapPaymentMethod().channelName);
        if (absResult != null) {
            add(jSONObject, "result_code", (long) absResult.getCode());
            add(jSONObject, "result_detail_code", (long) absResult.getDetailCode());
            add(jSONObject, "result_message", absResult.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j2);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f30236a);
        add(jSONObject3, "request_id", this.f30237b);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_create_order_end", jSONObject, jSONObject2, jSONObject3);
    }

    public b(String str, String str2, boolean z, PayType payType, long j2, OrderData orderData) {
        this.f30236a = str;
        this.f30237b = str2;
        this.f30238c = z;
        this.f30242g = orderData;
        if (payType == null) {
            this.f30239d = -1;
        } else {
            this.f30239d = payType.ordinal();
        }
        this.f30240e = j2;
    }
}
