package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.p;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "trace_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84938a;
    @com.google.gson.a.c(a = "order_shop")

    /* renamed from: b  reason: collision with root package name */
    public final List<k> f84939b;
    @com.google.gson.a.c(a = "price_info")

    /* renamed from: c  reason: collision with root package name */
    public final n f84940c;
    @com.google.gson.a.c(a = "buyer_addr_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f84941d;
    @com.google.gson.a.c(a = "vouchers")

    /* renamed from: e  reason: collision with root package name */
    public final List<v> f84942e;
    @com.google.gson.a.c(a = "order_secret")

    /* renamed from: f  reason: collision with root package name */
    public final String f84943f;
    @com.google.gson.a.c(a = "is_new_payment")

    /* renamed from: g  reason: collision with root package name */
    public final Boolean f84944g;
    @com.google.gson.a.c(a = "payment_method")

    /* renamed from: h  reason: collision with root package name */
    public final p f84945h;
    @com.google.gson.a.c(a = "redirect_url")

    /* renamed from: i  reason: collision with root package name */
    public final String f84946i;
    @com.google.gson.a.c(a = "deeplink")

    /* renamed from: j  reason: collision with root package name */
    public final String f84947j;
    @com.google.gson.a.c(a = "server_issued_params")

    /* renamed from: k  reason: collision with root package name */
    public final String f84948k;
    @com.google.gson.a.c(a = "activity_ids")

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f84949l;
    @com.google.gson.a.c(a = "buy_type")

    /* renamed from: m  reason: collision with root package name */
    public final int f84950m;
    @com.google.gson.a.c(a = "pay_risk_control_param")
    public final m n;
    @com.google.gson.a.c(a = "shipping_address")
    public final Address o;

    static {
        Covode.recordClassIndex(53122);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f84938a, cVar.f84938a) && l.a(this.f84939b, cVar.f84939b) && l.a(this.f84940c, cVar.f84940c) && l.a(this.f84941d, cVar.f84941d) && l.a(this.f84942e, cVar.f84942e) && l.a(this.f84943f, cVar.f84943f) && l.a(this.f84944g, cVar.f84944g) && l.a(this.f84945h, cVar.f84945h) && l.a(this.f84946i, cVar.f84946i) && l.a(this.f84947j, cVar.f84947j) && l.a(this.f84948k, cVar.f84948k) && l.a(this.f84949l, cVar.f84949l) && this.f84950m == cVar.f84950m && l.a(this.n, cVar.n) && l.a(this.o, cVar.o);
    }

    public final int hashCode() {
        String str = this.f84938a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<k> list = this.f84939b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        n nVar = this.f84940c;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        String str2 = this.f84941d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<v> list2 = this.f84942e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f84943f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.f84944g;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        p pVar = this.f84945h;
        int hashCode8 = (hashCode7 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str4 = this.f84946i;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f84947j;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f84948k;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list3 = this.f84949l;
        int hashCode12 = (((hashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.f84950m) * 31;
        m mVar = this.n;
        int hashCode13 = (hashCode12 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Address address = this.o;
        if (address != null) {
            i2 = address.hashCode();
        }
        return hashCode13 + i2;
    }

    public final String toString() {
        return "CreateOrderRequest(traceId=" + this.f84938a + ", orderShop=" + this.f84939b + ", priceInfo=" + this.f84940c + ", buyerAddrId=" + this.f84941d + ", voucher=" + this.f84942e + ", orderSecret=" + this.f84943f + ", isNewPayment=" + this.f84944g + ", paymentMethod=" + this.f84945h + ", redirectUrl=" + this.f84946i + ", deepLink=" + this.f84947j + ", serverIssuedParams=" + this.f84948k + ", activityIds=" + this.f84949l + ", buyType=" + this.f84950m + ", payRiskControlParam=" + this.n + ", shippingAddress=" + this.o + ")";
    }

    private c(String str, List<k> list, n nVar, String str2, List<v> list2, String str3, Boolean bool, p pVar, String str4, String str5, String str6, List<String> list3, int i2, m mVar, Address address) {
        this.f84938a = str;
        this.f84939b = list;
        this.f84940c = nVar;
        this.f84941d = str2;
        this.f84942e = list2;
        this.f84943f = str3;
        this.f84944g = bool;
        this.f84945h = pVar;
        this.f84946i = str4;
        this.f84947j = str5;
        this.f84948k = str6;
        this.f84949l = list3;
        this.f84950m = i2;
        this.n = mVar;
        this.o = address;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, List list, n nVar, String str2, List list2, String str3, Boolean bool, p pVar, String str4, String str5, String str6, List list3, int i2, m mVar, Address address, int i3) {
        this(str, list, nVar, str2, list2, str3, (i3 & 64) != 0 ? true : bool, pVar, str4, str5, (i3 & 1024) != 0 ? null : str6, (i3 & 2048) != 0 ? null : list3, (i3 & 4096) != 0 ? 0 : i2, (i3 & 8192) == 0 ? mVar : null, address);
    }
}
