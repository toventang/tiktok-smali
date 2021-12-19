package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;

public final class ShopBill {
    @c(a = "product_total")
    private final String productTotal;
    @c(a = "total")
    private final Price total;

    static {
        Covode.recordClassIndex(53116);
    }

    public static /* synthetic */ ShopBill copy$default(ShopBill shopBill, String str, Price price, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shopBill.productTotal;
        }
        if ((i2 & 2) != 0) {
            price = shopBill.total;
        }
        return shopBill.copy(str, price);
    }

    public final String component1() {
        return this.productTotal;
    }

    public final Price component2() {
        return this.total;
    }

    public final ShopBill copy(String str, Price price) {
        return new ShopBill(str, price);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBill)) {
            return false;
        }
        ShopBill shopBill = (ShopBill) obj;
        return l.a(this.productTotal, shopBill.productTotal) && l.a(this.total, shopBill.total);
    }

    public final int hashCode() {
        String str = this.productTotal;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Price price = this.total;
        if (price != null) {
            i2 = price.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShopBill(productTotal=" + this.productTotal + ", total=" + this.total + ")";
    }

    public final String getProductTotal() {
        return this.productTotal;
    }

    public final Price getTotal() {
        return this.total;
    }

    public final ShopBill merge(ShopBill shopBill) {
        if (shopBill == null) {
            return this;
        }
        String str = shopBill.productTotal;
        if (str == null) {
            str = this.productTotal;
        }
        Price price = shopBill.total;
        if (price == null) {
            price = this.total;
        }
        return new ShopBill(str, price);
    }

    public ShopBill(String str, Price price) {
        this.productTotal = str;
        this.total = price;
    }
}
