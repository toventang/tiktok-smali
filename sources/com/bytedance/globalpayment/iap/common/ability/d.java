package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.model.AbsResult;

public class d extends AbsResult {

    /* renamed from: a  reason: collision with root package name */
    public String f30273a;

    /* renamed from: b  reason: collision with root package name */
    public c f30274b;

    /* renamed from: c  reason: collision with root package name */
    public PayType f30275c;

    static {
        Covode.recordClassIndex(17565);
    }

    public d() {
        this(-1, -1, "");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsResult
    public String toString() {
        return "IapResult{mCode=" + this.mCode + ", mDetailCode=" + this.mDetailCode + ", mMessage='" + this.mMessage + '\'' + ", mPayload='" + this.f30273a + '\'' + ", mIapPayRequest=" + this.f30274b + ", payType=" + this.f30275c + '}';
    }

    public static d a(AbsResult absResult) {
        if (absResult instanceof d) {
            return (d) absResult;
        }
        return new d(absResult.getCode(), absResult.getDetailCode(), absResult.getMessage());
    }

    public d(int i2, String str) {
        this(i2, -1, str);
    }

    public d(int i2, int i3, String str) {
        this.f30275c = PayType.UNKNOWN;
        this.mCode = i2;
        this.mDetailCode = i3;
        this.mMessage = str;
    }
}
