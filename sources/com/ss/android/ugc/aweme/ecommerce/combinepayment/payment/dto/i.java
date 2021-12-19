package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.m;
import h.f.b.l;
import java.util.List;

public final class i {
    @c(a = "combo_Id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85313a;
    @c(a = "order_ids")

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f85314b;
    @c(a = "is_new_payment")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f85315c;
    @c(a = "payment_method")

    /* renamed from: d  reason: collision with root package name */
    public final p f85316d;
    @c(a = "redirect_url")

    /* renamed from: e  reason: collision with root package name */
    public final String f85317e;
    @c(a = "deeplink")

    /* renamed from: f  reason: collision with root package name */
    public final String f85318f;
    @c(a = "pay_risk_control_param")

    /* renamed from: g  reason: collision with root package name */
    public final m f85319g;

    static {
        Covode.recordClassIndex(53381);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f85313a, iVar.f85313a) && l.a(this.f85314b, iVar.f85314b) && l.a(this.f85315c, iVar.f85315c) && l.a(this.f85316d, iVar.f85316d) && l.a(this.f85317e, iVar.f85317e) && l.a(this.f85318f, iVar.f85318f) && l.a(this.f85319g, iVar.f85319g);
    }

    public final int hashCode() {
        String str = this.f85313a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.f85314b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.f85315c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        p pVar = this.f85316d;
        int hashCode4 = (hashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.f85317e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85318f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        m mVar = this.f85319g;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "PayRequest(comboId=" + this.f85313a + ", orderIds=" + this.f85314b + ", isNewPayment=" + this.f85315c + ", paymentMethod=" + this.f85316d + ", redirectUrl=" + this.f85317e + ", deepLink=" + this.f85318f + ", payRiskControlParam=" + this.f85319g + ")";
    }

    public /* synthetic */ i(String str, List list, Boolean bool) {
        this(str, list, bool, null, null, null, null);
    }

    public i(String str, List<String> list, Boolean bool, p pVar, String str2, String str3, m mVar) {
        this.f85313a = str;
        this.f85314b = list;
        this.f85315c = bool;
        this.f85316d = pVar;
        this.f85317e = str2;
        this.f85318f = str3;
        this.f85319g = mVar;
    }
}
