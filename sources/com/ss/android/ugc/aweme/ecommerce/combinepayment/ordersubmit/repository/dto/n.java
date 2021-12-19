package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;
import java.util.List;

public final class n {
    @c(a = "bill_items")

    /* renamed from: a  reason: collision with root package name */
    public final List<BillItem> f84990a;
    @c(a = "total")

    /* renamed from: b  reason: collision with root package name */
    public final Price f84991b;

    static {
        Covode.recordClassIndex(53133);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f84990a, nVar.f84990a) && l.a(this.f84991b, nVar.f84991b);
    }

    public final int hashCode() {
        List<BillItem> list = this.f84990a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Price price = this.f84991b;
        if (price != null) {
            i2 = price.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PriceInfoRequestParams(billItems=" + this.f84990a + ", total=" + this.f84991b + ")";
    }

    public n(List<BillItem> list, Price price) {
        this.f84990a = list;
        this.f84991b = price;
    }
}
