package com.bytedance.globalpayment.iap.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;
import org.json.JSONObject;

public class a extends com.bytedance.globalpayment.payment.common.lib.a {

    /* renamed from: a  reason: collision with root package name */
    private long f30230a;

    /* renamed from: b  reason: collision with root package name */
    private String f30231b;

    /* renamed from: c  reason: collision with root package name */
    private String f30232c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30233d;

    /* renamed from: e  reason: collision with root package name */
    private int f30234e;

    /* renamed from: f  reason: collision with root package name */
    private OrderData f30235f;

    static {
        Covode.recordClassIndex(17555);
    }

    public final void a() {
        this.f30230a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f30231b);
        add(jSONObject, "request_id", this.f30232c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f30234e);
        add(jSONObject2, "is_subscription", this.f30233d);
        add(jSONObject2, "payment_method", this.f30235f.getIapPaymentMethod().channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_consume_product_start", jSONObject2, null, jSONObject);
    }

    public final void a(boolean z, AbsResult absResult) {
        long j2;
        long j3 = 0;
        if (this.f30230a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30230a;
        } else {
            j2 = 0;
        }
        this.f30230a = 0;
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            j3 = 1;
        }
        add(jSONObject, "status", j3);
        add(jSONObject, "pay_type", (long) this.f30234e);
        add(jSONObject, "is_subscription", this.f30233d);
        add(jSONObject, "payment_method", this.f30235f.getIapPaymentMethod().channelName);
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
        add(jSONObject3, "product_id", this.f30231b);
        add(jSONObject3, "request_id", this.f30232c);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_consume_product_end", jSONObject, jSONObject2, jSONObject3);
    }

    public a(String str, String str2, PayType payType, boolean z, OrderData orderData) {
        this.f30231b = str;
        this.f30232c = str2;
        this.f30233d = z;
        this.f30235f = orderData;
        if (payType == null) {
            this.f30234e = -1;
        } else {
            this.f30234e = payType.ordinal();
        }
    }
}
