package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import h.f.b.l;
import java.util.List;

public final class j {
    @c(a = "cashier")

    /* renamed from: a  reason: collision with root package name */
    public final o f85320a;
    @c(a = "jump_schema_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f85321b;
    @c(a = "new_pay_info")

    /* renamed from: c  reason: collision with root package name */
    public final f f85322c;
    @c(a = "address")

    /* renamed from: d  reason: collision with root package name */
    public final Address f85323d;
    @c(a = "payment_methods")

    /* renamed from: e  reason: collision with root package name */
    public final r f85324e;
    @c(a = "payment_price")

    /* renamed from: f  reason: collision with root package name */
    public final List<s> f85325f;
    @c(a = "exception_ux")

    /* renamed from: g  reason: collision with root package name */
    public final ExceptionUX f85326g;

    static {
        Covode.recordClassIndex(53382);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f85320a, jVar.f85320a) && l.a(this.f85321b, jVar.f85321b) && l.a(this.f85322c, jVar.f85322c) && l.a(this.f85323d, jVar.f85323d) && l.a(this.f85324e, jVar.f85324e) && l.a(this.f85325f, jVar.f85325f) && l.a(this.f85326g, jVar.f85326g);
    }

    public final int hashCode() {
        o oVar = this.f85320a;
        int i2 = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        String str = this.f85321b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        f fVar = this.f85322c;
        int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        Address address = this.f85323d;
        int hashCode4 = (hashCode3 + (address != null ? address.hashCode() : 0)) * 31;
        r rVar = this.f85324e;
        int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        List<s> list = this.f85325f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        ExceptionUX exceptionUX = this.f85326g;
        if (exceptionUX != null) {
            i2 = exceptionUX.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "PayResponseData(cashier=" + this.f85320a + ", schema=" + this.f85321b + ", newPayInfo=" + this.f85322c + ", shippingAddress=" + this.f85323d + ", paymentMethodsData=" + this.f85324e + ", paymentPrice=" + this.f85325f + ", exceptionUX=" + this.f85326g + ")";
    }
}
