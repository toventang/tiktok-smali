package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class OrderSubmitRequestParam implements Serializable {
    @c(a = "activity_ids")
    private final List<String> activityIds;
    @c(a = "buyer_addr_id")
    private final String addressId;
    @c(a = "order_shop")
    private final List<OrderShopDigest> orderShopDigest;
    @c(a = "to_auto_claim_voucher_type_ids")
    private final List<String> toAutoClaimVoucherTypeIDs;

    static {
        Covode.recordClassIndex(52913);
    }

    public OrderSubmitRequestParam() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitRequestParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSubmitRequestParam copy$default(OrderSubmitRequestParam orderSubmitRequestParam, String str, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderSubmitRequestParam.addressId;
        }
        if ((i2 & 2) != 0) {
            list = orderSubmitRequestParam.orderShopDigest;
        }
        if ((i2 & 4) != 0) {
            list2 = orderSubmitRequestParam.toAutoClaimVoucherTypeIDs;
        }
        if ((i2 & 8) != 0) {
            list3 = orderSubmitRequestParam.activityIds;
        }
        return orderSubmitRequestParam.copy(str, list, list2, list3);
    }

    public final String component1() {
        return this.addressId;
    }

    public final List<OrderShopDigest> component2() {
        return this.orderShopDigest;
    }

    public final List<String> component3() {
        return this.toAutoClaimVoucherTypeIDs;
    }

    public final List<String> component4() {
        return this.activityIds;
    }

    public final OrderSubmitRequestParam copy(String str, List<OrderShopDigest> list, List<String> list2, List<String> list3) {
        return new OrderSubmitRequestParam(str, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitRequestParam)) {
            return false;
        }
        OrderSubmitRequestParam orderSubmitRequestParam = (OrderSubmitRequestParam) obj;
        return l.a(this.addressId, orderSubmitRequestParam.addressId) && l.a(this.orderShopDigest, orderSubmitRequestParam.orderShopDigest) && l.a(this.toAutoClaimVoucherTypeIDs, orderSubmitRequestParam.toAutoClaimVoucherTypeIDs) && l.a(this.activityIds, orderSubmitRequestParam.activityIds);
    }

    public final int hashCode() {
        String str = this.addressId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<OrderShopDigest> list = this.orderShopDigest;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.toAutoClaimVoucherTypeIDs;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.activityIds;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "OrderSubmitRequestParam(addressId=" + this.addressId + ", orderShopDigest=" + this.orderShopDigest + ", toAutoClaimVoucherTypeIDs=" + this.toAutoClaimVoucherTypeIDs + ", activityIds=" + this.activityIds + ")";
    }

    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final List<OrderShopDigest> getOrderShopDigest() {
        return this.orderShopDigest;
    }

    public final List<String> getToAutoClaimVoucherTypeIDs() {
        return this.toAutoClaimVoucherTypeIDs;
    }

    public OrderSubmitRequestParam(String str, List<OrderShopDigest> list, List<String> list2, List<String> list3) {
        this.addressId = str;
        this.orderShopDigest = list;
        this.toAutoClaimVoucherTypeIDs = list2;
        this.activityIds = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderSubmitRequestParam(String str, List list, List list2, List list3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
