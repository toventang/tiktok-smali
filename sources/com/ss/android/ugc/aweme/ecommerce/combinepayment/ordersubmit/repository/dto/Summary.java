package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;
import java.util.List;

public final class Summary {
    @c(a = "bill_items")
    private final List<BillItem> billItems;
    @c(a = "total")
    private final Price total;

    static {
        Covode.recordClassIndex(53119);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.Summary */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Summary copy$default(Summary summary, List list, Price price, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = summary.billItems;
        }
        if ((i2 & 2) != 0) {
            price = summary.total;
        }
        return summary.copy(list, price);
    }

    public final List<BillItem> component1() {
        return this.billItems;
    }

    public final Price component2() {
        return this.total;
    }

    public final Summary copy(List<BillItem> list, Price price) {
        return new Summary(list, price);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return l.a(this.billItems, summary.billItems) && l.a(this.total, summary.total);
    }

    public final int hashCode() {
        List<BillItem> list = this.billItems;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Price price = this.total;
        if (price != null) {
            i2 = price.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Summary(billItems=" + this.billItems + ", total=" + this.total + ")";
    }

    public final List<BillItem> getBillItems() {
        return this.billItems;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final Summary merge(Summary summary) {
        if (summary == null) {
            return this;
        }
        List<BillItem> list = summary.billItems;
        if (list == null) {
            list = this.billItems;
        }
        Price price = summary.total;
        if (price == null) {
            price = this.total;
        }
        return new Summary(list, price);
    }

    public Summary(List<BillItem> list, Price price) {
        this.billItems = list;
        this.total = price;
    }
}
