package com.bytedance.globalpayment.iap.common.ability.e;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONObject;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f30278a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private long f30279b = 0;

    /* renamed from: c  reason: collision with root package name */
    private String f30280c;

    /* renamed from: d  reason: collision with root package name */
    private String f30281d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30282e;

    /* renamed from: f  reason: collision with root package name */
    private int f30283f;

    /* renamed from: g  reason: collision with root package name */
    private PayType f30284g;

    /* renamed from: h  reason: collision with root package name */
    private OrderData f30285h;

    static {
        Covode.recordClassIndex(17569);
    }

    public final void a() {
        this.f30279b = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "request_id", this.f30281d);
        add(jSONObject, "product_id", this.f30280c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f30283f);
        add(jSONObject2, "is_subscription", this.f30282e);
        add(jSONObject2, "payment_method", this.f30285h.getIapPaymentMethod().channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_start", jSONObject2, null, jSONObject);
    }

    public final void a(d dVar, com.bytedance.globalpayment.iap.common.ability.a.a aVar) {
        long j2;
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        if (this.f30279b > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30279b;
        } else {
            j2 = 0;
        }
        this.f30279b = 0;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "result_code", (long) dVar.getCode());
        add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
        add(jSONObject, "result_message", dVar.getMessage());
        add(jSONObject, "pay_type", (long) this.f30283f);
        add(jSONObject, "is_subscription", this.f30282e);
        add(jSONObject, "payment_method", this.f30285h.getIapPaymentMethod().channelName);
        if (aVar != null) {
            add(jSONObject, "pay_state", aVar.name());
        } else {
            add(jSONObject, "pay_state", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j2);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "request_id", this.f30281d);
        add(jSONObject3, "product_id", this.f30280c);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_end", jSONObject, jSONObject2, jSONObject3);
    }

    public b(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f30280c = str;
        this.f30281d = str2;
        this.f30282e = z;
        this.f30284g = payType;
        if (payType == null) {
            this.f30283f = -1;
        } else {
            this.f30283f = payType.ordinal();
        }
        this.f30285h = orderData;
    }
}
