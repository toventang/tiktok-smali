package com.bytedance.globalpayment.iap.c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.payment.common.lib.a;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private long f30249a;

    /* renamed from: b  reason: collision with root package name */
    private String f30250b;

    /* renamed from: c  reason: collision with root package name */
    private String f30251c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30252d;

    /* renamed from: e  reason: collision with root package name */
    private int f30253e;

    /* renamed from: f  reason: collision with root package name */
    private OrderData f30254f;

    static {
        Covode.recordClassIndex(17558);
    }

    public final void a() {
        this.f30249a = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "product_id", this.f30250b);
        add(jSONObject, "request_id", this.f30251c);
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "pay_type", (long) this.f30253e);
        add(jSONObject2, "is_subscription", this.f30252d);
        add(jSONObject2, "payment_method", this.f30254f.getIapPaymentMethod().channelName);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_upload_token_start", jSONObject2, null, jSONObject);
    }

    public final void a(boolean z, com.bytedance.globalpayment.iap.common.ability.d dVar) {
        long j2;
        long j3 = 0;
        if (this.f30249a > 0) {
            j2 = SystemClock.uptimeMillis() - this.f30249a;
        } else {
            j2 = 0;
        }
        this.f30249a = 0;
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "pay_type", (long) this.f30253e);
        if (!z) {
            j3 = 1;
        }
        add(jSONObject, "status", j3);
        add(jSONObject, "is_subscription", this.f30252d);
        add(jSONObject, "payment_method", this.f30254f.getIapPaymentMethod().channelName);
        if (dVar != null) {
            add(jSONObject, "result_code", (long) dVar.getCode());
            add(jSONObject, "result_detail_code", (long) dVar.getDetailCode());
            add(jSONObject, "result_message", dVar.getMessage());
        } else {
            add(jSONObject, "result_code", -1L);
            add(jSONObject, "result_detail_code", -1L);
            add(jSONObject, "result_message", "unknown");
        }
        JSONObject jSONObject2 = new JSONObject();
        add(jSONObject2, "time_consuming", j2);
        JSONObject jSONObject3 = new JSONObject();
        add(jSONObject3, "product_id", this.f30250b);
        add(jSONObject3, "request_id", this.f30251c);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().d().a("pipo_pay_upload_token_end", jSONObject, jSONObject2, jSONObject3);
    }

    public d(String str, String str2, boolean z, PayType payType, OrderData orderData) {
        this.f30250b = str;
        this.f30251c = str2;
        this.f30252d = z;
        this.f30254f = orderData;
        if (payType != null) {
            this.f30253e = payType.ordinal();
        } else {
            this.f30253e = -1;
        }
    }
}
