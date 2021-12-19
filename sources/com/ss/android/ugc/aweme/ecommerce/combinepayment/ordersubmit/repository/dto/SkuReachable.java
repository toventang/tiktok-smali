package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import h.f.b.l;

public final class SkuReachable {
    @c(a = "order_sku")
    private final OrderSKUDTO orderSku;
    @c(a = "reachable")
    private final Boolean reachable;

    static {
        Covode.recordClassIndex(53118);
    }

    public static /* synthetic */ SkuReachable copy$default(SkuReachable skuReachable, OrderSKUDTO orderSKUDTO, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            orderSKUDTO = skuReachable.orderSku;
        }
        if ((i2 & 2) != 0) {
            bool = skuReachable.reachable;
        }
        return skuReachable.copy(orderSKUDTO, bool);
    }

    public final OrderSKUDTO component1() {
        return this.orderSku;
    }

    public final Boolean component2() {
        return this.reachable;
    }

    public final SkuReachable copy(OrderSKUDTO orderSKUDTO, Boolean bool) {
        return new SkuReachable(orderSKUDTO, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuReachable)) {
            return false;
        }
        SkuReachable skuReachable = (SkuReachable) obj;
        return l.a(this.orderSku, skuReachable.orderSku) && l.a(this.reachable, skuReachable.reachable);
    }

    public final int hashCode() {
        OrderSKUDTO orderSKUDTO = this.orderSku;
        int i2 = 0;
        int hashCode = (orderSKUDTO != null ? orderSKUDTO.hashCode() : 0) * 31;
        Boolean bool = this.reachable;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SkuReachable(orderSku=" + this.orderSku + ", reachable=" + this.reachable + ")";
    }

    public final OrderSKUDTO getOrderSku() {
        return this.orderSku;
    }

    public final Boolean getReachable() {
        return this.reachable;
    }

    public SkuReachable(OrderSKUDTO orderSKUDTO, Boolean bool) {
        this.orderSku = orderSKUDTO;
        this.reachable = bool;
    }
}
