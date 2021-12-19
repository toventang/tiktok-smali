package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class OrderShopDigest implements Serializable {
    @c(a = "delivery_option")
    private final Integer deliveryOption;
    @c(a = "logistics_service_id")
    private final String logisticsServiceId;
    @c(a = "order_sku")
    private final List<OrderSKUDTO> orderSKUs;
    @c(a = "seller_id")
    private final String sellerId;
    @c(a = "warehouse_id")
    private final String warehouseId;

    static {
        Covode.recordClassIndex(53112);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderShopDigest copy$default(OrderShopDigest orderShopDigest, String str, String str2, List list, Integer num, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderShopDigest.warehouseId;
        }
        if ((i2 & 2) != 0) {
            str2 = orderShopDigest.sellerId;
        }
        if ((i2 & 4) != 0) {
            list = orderShopDigest.orderSKUs;
        }
        if ((i2 & 8) != 0) {
            num = orderShopDigest.deliveryOption;
        }
        if ((i2 & 16) != 0) {
            str3 = orderShopDigest.logisticsServiceId;
        }
        return orderShopDigest.copy(str, str2, list, num, str3);
    }

    public final String component1() {
        return this.warehouseId;
    }

    public final String component2() {
        return this.sellerId;
    }

    public final List<OrderSKUDTO> component3() {
        return this.orderSKUs;
    }

    public final Integer component4() {
        return this.deliveryOption;
    }

    public final String component5() {
        return this.logisticsServiceId;
    }

    public final OrderShopDigest copy(String str, String str2, List<OrderSKUDTO> list, Integer num, String str3) {
        return new OrderShopDigest(str, str2, list, num, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderShopDigest)) {
            return false;
        }
        OrderShopDigest orderShopDigest = (OrderShopDigest) obj;
        return l.a(this.warehouseId, orderShopDigest.warehouseId) && l.a(this.sellerId, orderShopDigest.sellerId) && l.a(this.orderSKUs, orderShopDigest.orderSKUs) && l.a(this.deliveryOption, orderShopDigest.deliveryOption) && l.a(this.logisticsServiceId, orderShopDigest.logisticsServiceId);
    }

    public final int hashCode() {
        String str = this.warehouseId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sellerId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<OrderSKUDTO> list = this.orderSKUs;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.deliveryOption;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.logisticsServiceId;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "OrderShopDigest(warehouseId=" + this.warehouseId + ", sellerId=" + this.sellerId + ", orderSKUs=" + this.orderSKUs + ", deliveryOption=" + this.deliveryOption + ", logisticsServiceId=" + this.logisticsServiceId + ")";
    }

    public final Integer getDeliveryOption() {
        return this.deliveryOption;
    }

    public final String getLogisticsServiceId() {
        return this.logisticsServiceId;
    }

    public final List<OrderSKUDTO> getOrderSKUs() {
        return this.orderSKUs;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public final OrderShopDigest merge(OrderShopDigest orderShopDigest) {
        if (orderShopDigest == null) {
            return this;
        }
        String str = orderShopDigest.sellerId;
        if (str == null) {
            str = this.sellerId;
        }
        List<OrderSKUDTO> list = orderShopDigest.orderSKUs;
        if (list == null) {
            list = this.orderSKUs;
        }
        Integer num = orderShopDigest.deliveryOption;
        if (num == null) {
            num = this.deliveryOption;
        }
        String str2 = orderShopDigest.logisticsServiceId;
        if (str2 == null) {
            str2 = this.logisticsServiceId;
        }
        String str3 = orderShopDigest.warehouseId;
        if (str3 == null) {
            str3 = this.warehouseId;
        }
        return new OrderShopDigest(str3, str, list, num, str2);
    }

    public OrderShopDigest(String str, String str2, List<OrderSKUDTO> list, Integer num, String str3) {
        this.warehouseId = str;
        this.sellerId = str2;
        this.orderSKUs = list;
        this.deliveryOption = num;
        this.logisticsServiceId = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderShopDigest(String str, String str2, List list, Integer num, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, str2, list, num, str3);
    }
}
