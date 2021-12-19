package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class n {
    @c(a = "payment_method_info")

    /* renamed from: a  reason: collision with root package name */
    public final p f85328a;
    @c(a = "payment_method")

    /* renamed from: b  reason: collision with root package name */
    public o f85329b;
    @c(a = "use_shipping_address")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f85330c;
    @c(a = "is_valid")

    /* renamed from: d  reason: collision with root package name */
    public Boolean f85331d;
    @c(a = "region_string")

    /* renamed from: e  reason: collision with root package name */
    public String f85332e;
    @c(a = "region_geo_id")

    /* renamed from: f  reason: collision with root package name */
    public String f85333f;

    static {
        Covode.recordClassIndex(53386);
    }

    private n(p pVar, o oVar, Boolean bool, Boolean bool2, String str, String str2) {
        this.f85328a = pVar;
        this.f85329b = oVar;
        this.f85330c = bool;
        this.f85331d = bool2;
        this.f85332e = str;
        this.f85333f = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, o oVar, Boolean bool, Boolean bool2, String str, String str2, int i2) {
        this(pVar, oVar, bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : str, (i2 & 32) == 0 ? str2 : null);
    }
}
