package com.bytedance.globalpayment.iap.google.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;

public final class a extends com.bytedance.globalpayment.payment.common.lib.a {

    /* renamed from: a  reason: collision with root package name */
    public long f30406a;

    /* renamed from: b  reason: collision with root package name */
    public long f30407b;

    /* renamed from: c  reason: collision with root package name */
    public long f30408c;

    /* renamed from: d  reason: collision with root package name */
    public String f30409d;

    /* renamed from: e  reason: collision with root package name */
    public String f30410e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30411f;

    /* renamed from: g  reason: collision with root package name */
    public int f30412g;

    /* renamed from: h  reason: collision with root package name */
    private long f30413h;

    static {
        Covode.recordClassIndex(17637);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5 > 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, com.bytedance.globalpayment.iap.common.ability.d r11) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.google.d.a.a(int, com.bytedance.globalpayment.iap.common.ability.d):void");
    }

    public a(String str, String str2, boolean z, PayType payType) {
        this.f30409d = str;
        this.f30410e = str2;
        this.f30411f = z;
        if (payType != null) {
            this.f30412g = payType.ordinal();
        } else {
            this.f30412g = -1;
        }
    }
}
