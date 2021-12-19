package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ShopOrder {
    @c(a = "logistics")
    private final List<LogisticDTO> logistics;
    @c(a = "packed_skus")
    private final List<PackedSku> packedSkus;
    @c(a = "reachable")
    private final Boolean reachable;
    @c(a = "selected_logistics_service_id")
    private final String selectedLogisticsServiceId;
    @c(a = "seller")
    private final SellerInfo seller;
    @c(a = "seller_id")
    private final String sellerId;
    @c(a = "shop_bill")
    private final ShopBill shopBill;
    @c(a = "unreachable_reason")
    private final String unreachableReason;
    @c(a = "voucher_info")
    private final VoucherInfo voucherInfo;
    @c(a = "warehouse_id")
    private final String warehouseId;

    static {
        Covode.recordClassIndex(53117);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopOrder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShopOrder copy$default(ShopOrder shopOrder, String str, String str2, SellerInfo sellerInfo, List list, ShopBill shopBill2, List list2, VoucherInfo voucherInfo2, String str3, Boolean bool, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shopOrder.sellerId;
        }
        if ((i2 & 2) != 0) {
            str2 = shopOrder.warehouseId;
        }
        if ((i2 & 4) != 0) {
            sellerInfo = shopOrder.seller;
        }
        if ((i2 & 8) != 0) {
            list = shopOrder.packedSkus;
        }
        if ((i2 & 16) != 0) {
            shopBill2 = shopOrder.shopBill;
        }
        if ((i2 & 32) != 0) {
            list2 = shopOrder.logistics;
        }
        if ((i2 & 64) != 0) {
            voucherInfo2 = shopOrder.voucherInfo;
        }
        if ((i2 & 128) != 0) {
            str3 = shopOrder.selectedLogisticsServiceId;
        }
        if ((i2 & 256) != 0) {
            bool = shopOrder.reachable;
        }
        if ((i2 & 512) != 0) {
            str4 = shopOrder.unreachableReason;
        }
        return shopOrder.copy(str, str2, sellerInfo, list, shopBill2, list2, voucherInfo2, str3, bool, str4);
    }

    public final String component1() {
        return this.sellerId;
    }

    public final String component10() {
        return this.unreachableReason;
    }

    public final String component2() {
        return this.warehouseId;
    }

    public final SellerInfo component3() {
        return this.seller;
    }

    public final List<PackedSku> component4() {
        return this.packedSkus;
    }

    public final ShopBill component5() {
        return this.shopBill;
    }

    public final List<LogisticDTO> component6() {
        return this.logistics;
    }

    public final VoucherInfo component7() {
        return this.voucherInfo;
    }

    public final String component8() {
        return this.selectedLogisticsServiceId;
    }

    public final Boolean component9() {
        return this.reachable;
    }

    public final ShopOrder copy(String str, String str2, SellerInfo sellerInfo, List<PackedSku> list, ShopBill shopBill2, List<LogisticDTO> list2, VoucherInfo voucherInfo2, String str3, Boolean bool, String str4) {
        return new ShopOrder(str, str2, sellerInfo, list, shopBill2, list2, voucherInfo2, str3, bool, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOrder)) {
            return false;
        }
        ShopOrder shopOrder = (ShopOrder) obj;
        return l.a(this.sellerId, shopOrder.sellerId) && l.a(this.warehouseId, shopOrder.warehouseId) && l.a(this.seller, shopOrder.seller) && l.a(this.packedSkus, shopOrder.packedSkus) && l.a(this.shopBill, shopOrder.shopBill) && l.a(this.logistics, shopOrder.logistics) && l.a(this.voucherInfo, shopOrder.voucherInfo) && l.a(this.selectedLogisticsServiceId, shopOrder.selectedLogisticsServiceId) && l.a(this.reachable, shopOrder.reachable) && l.a(this.unreachableReason, shopOrder.unreachableReason);
    }

    public final int hashCode() {
        String str = this.sellerId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.warehouseId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        SellerInfo sellerInfo = this.seller;
        int hashCode3 = (hashCode2 + (sellerInfo != null ? sellerInfo.hashCode() : 0)) * 31;
        List<PackedSku> list = this.packedSkus;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        ShopBill shopBill2 = this.shopBill;
        int hashCode5 = (hashCode4 + (shopBill2 != null ? shopBill2.hashCode() : 0)) * 31;
        List<LogisticDTO> list2 = this.logistics;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo2 = this.voucherInfo;
        int hashCode7 = (hashCode6 + (voucherInfo2 != null ? voucherInfo2.hashCode() : 0)) * 31;
        String str3 = this.selectedLogisticsServiceId;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.reachable;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.unreachableReason;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "ShopOrder(sellerId=" + this.sellerId + ", warehouseId=" + this.warehouseId + ", seller=" + this.seller + ", packedSkus=" + this.packedSkus + ", shopBill=" + this.shopBill + ", logistics=" + this.logistics + ", voucherInfo=" + this.voucherInfo + ", selectedLogisticsServiceId=" + this.selectedLogisticsServiceId + ", reachable=" + this.reachable + ", unreachableReason=" + this.unreachableReason + ")";
    }

    public final List<LogisticDTO> getLogistics() {
        return this.logistics;
    }

    public final List<PackedSku> getPackedSkus() {
        return this.packedSkus;
    }

    public final Boolean getReachable() {
        return this.reachable;
    }

    public final String getSelectedLogisticsServiceId() {
        return this.selectedLogisticsServiceId;
    }

    public final SellerInfo getSeller() {
        return this.seller;
    }

    public final String getSellerId() {
        return this.sellerId;
    }

    public final ShopBill getShopBill() {
        return this.shopBill;
    }

    public final String getUnreachableReason() {
        return this.unreachableReason;
    }

    public final VoucherInfo getVoucherInfo() {
        return this.voucherInfo;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public final String findDefaultLogisticServiceId() {
        T t;
        String str;
        List<LogisticDTO> list = this.logistics;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (l.a((Object) t.f85891c, (Object) true)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (str = t2.f85899k) != null) {
            return str;
        }
        LogisticDTO logisticDTO = (LogisticDTO) n.h((List) list);
        if (logisticDTO != null) {
            return logisticDTO.f85899k;
        }
        return null;
    }

    public final ShopOrder merge(ShopOrder shopOrder, BillInfoRequest billInfoRequest) {
        T t;
        T t2;
        String str;
        SellerInfo sellerInfo;
        ShopBill shopBill2;
        l.d(billInfoRequest, "");
        if (shopOrder == null) {
            return this;
        }
        ArrayList arrayList = null;
        if (billInfoRequest.getWithProductInfo()) {
            arrayList = shopOrder.packedSkus;
        } else {
            List<PackedSku> list = this.packedSkus;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                for (T t3 : list) {
                    List<PackedSku> list2 = shopOrder.packedSkus;
                    if (list2 != null) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            T t4 = t2;
                            if (l.a((Object) t4.getSkuId(), (Object) t3.getSkuId()) && l.a((Object) t4.getProductId(), (Object) t3.getProductId())) {
                                break;
                            }
                        }
                        t = t2;
                    } else {
                        t = null;
                    }
                    arrayList2.add(t3.merge(t));
                }
                arrayList = arrayList2;
            }
        }
        if (billInfoRequest.getWithSellerInfo()) {
            str = shopOrder.sellerId;
        } else {
            str = shopOrder.sellerId;
            if (str == null) {
                str = this.sellerId;
            }
        }
        String str2 = shopOrder.warehouseId;
        if (str2 == null) {
            str2 = this.warehouseId;
        }
        SellerInfo sellerInfo2 = this.seller;
        if (sellerInfo2 != null) {
            sellerInfo = sellerInfo2.a(shopOrder.seller);
        } else {
            sellerInfo = shopOrder.seller;
        }
        ShopBill shopBill3 = this.shopBill;
        if (shopBill3 == null || (shopBill2 = shopBill3.merge(shopOrder.shopBill)) == null) {
            shopBill2 = shopOrder.shopBill;
        }
        List<LogisticDTO> list3 = shopOrder.logistics;
        if (list3 == null) {
            list3 = this.logistics;
        }
        VoucherInfo voucherInfo2 = shopOrder.voucherInfo;
        if (voucherInfo2 == null) {
            voucherInfo2 = this.voucherInfo;
        }
        String str3 = shopOrder.selectedLogisticsServiceId;
        if (str3 == null) {
            str3 = this.selectedLogisticsServiceId;
        }
        Boolean bool = shopOrder.reachable;
        if (bool == null) {
            bool = this.reachable;
        }
        String str4 = shopOrder.unreachableReason;
        if (str4 == null) {
            str4 = this.unreachableReason;
        }
        return new ShopOrder(str, str2, sellerInfo, arrayList, shopBill2, list3, voucherInfo2, str3, bool, str4);
    }

    public ShopOrder(String str, String str2, SellerInfo sellerInfo, List<PackedSku> list, ShopBill shopBill2, List<LogisticDTO> list2, VoucherInfo voucherInfo2, String str3, Boolean bool, String str4) {
        this.sellerId = str;
        this.warehouseId = str2;
        this.seller = sellerInfo;
        this.packedSkus = list;
        this.shopBill = shopBill2;
        this.logistics = list2;
        this.voucherInfo = voucherInfo2;
        this.selectedLogisticsServiceId = str3;
        this.reachable = bool;
        this.unreachableReason = str4;
    }
}
