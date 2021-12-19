package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.util.List;

public final class PackedSku {
    @c(a = "activity_info")
    private final PickTag activityInfo;
    @c(a = "button")
    private final List<Button> button;
    @c(a = "cart_item_id")
    private final String cartItemId;
    @c(a = "chain_key")
    private final String chainKey;
    @c(a = "entrance_info")
    private final String entranceInfo;
    @c(a = "image")
    private final Image image;
    @c(a = "link")
    private final String link;
    @c(a = "low_stock_warning")
    private final String lowStockWarning;
    @c(a = "packed_sku_sale_props")
    private final List<PackedSKUSaleProp> packedSKUSaleProps;
    @c(a = "price")
    private final SkuPrice price;
    @c(a = "product_id")
    private final String productId;
    @c(a = "product_name")
    private final String productName;
    @c(a = "promotion_logos")
    private final List<PromotionLogo> promotionLogos;
    @c(a = "promotion_view")
    private final PromotionView promotionView;
    @c(a = "purchase_limit")
    private final Integer purchaseLimit;
    @c(a = "sale_props_str")
    private final String salePropsStr;
    @c(a = "sku_amount")
    private final Integer skuAmount;
    @c(a = "sku_id")
    private final String skuId;
    @c(a = "source_info")
    private final String sourceInfo;
    @c(a = "status")
    private final Integer status;
    @c(a = "stock")
    private final Integer stock;

    static {
        Covode.recordClassIndex(53114);
    }

    public static /* synthetic */ PackedSku copy$default(PackedSku packedSku, String str, String str2, String str3, Integer num, String str4, List list, String str5, Integer num2, String str6, Integer num3, SkuPrice skuPrice, Image image2, Integer num4, List list2, String str7, PickTag pickTag, List list3, String str8, String str9, String str10, PromotionView promotionView2, int i2, Object obj) {
        List<PackedSKUSaleProp> list4 = list;
        String str11 = str4;
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        Integer num5 = num;
        List list5 = list2;
        Integer num6 = num4;
        Image image3 = image2;
        SkuPrice skuPrice2 = skuPrice;
        String str15 = str5;
        Integer num7 = num2;
        String str16 = str6;
        Integer num8 = num3;
        String str17 = str10;
        String str18 = str9;
        String str19 = str7;
        PickTag pickTag2 = pickTag;
        List list6 = list3;
        PromotionView promotionView3 = promotionView2;
        String str20 = str8;
        if ((i2 & 1) != 0) {
            str12 = packedSku.productId;
        }
        if ((i2 & 2) != 0) {
            str13 = packedSku.skuId;
        }
        if ((i2 & 4) != 0) {
            str14 = packedSku.cartItemId;
        }
        if ((i2 & 8) != 0) {
            num5 = packedSku.status;
        }
        if ((i2 & 16) != 0) {
            str11 = packedSku.productName;
        }
        if ((i2 & 32) != 0) {
            list4 = packedSku.packedSKUSaleProps;
        }
        if ((i2 & 64) != 0) {
            str15 = packedSku.salePropsStr;
        }
        if ((i2 & 128) != 0) {
            num7 = packedSku.stock;
        }
        if ((i2 & 256) != 0) {
            str16 = packedSku.lowStockWarning;
        }
        if ((i2 & 512) != 0) {
            num8 = packedSku.purchaseLimit;
        }
        if ((i2 & 1024) != 0) {
            skuPrice2 = packedSku.price;
        }
        if ((i2 & 2048) != 0) {
            image3 = packedSku.image;
        }
        if ((i2 & 4096) != 0) {
            num6 = packedSku.skuAmount;
        }
        if ((i2 & 8192) != 0) {
            list5 = packedSku.button;
        }
        if ((i2 & 16384) != 0) {
            str19 = packedSku.link;
        }
        if ((32768 & i2) != 0) {
            pickTag2 = packedSku.activityInfo;
        }
        if ((65536 & i2) != 0) {
            list6 = packedSku.promotionLogos;
        }
        if ((131072 & i2) != 0) {
            str20 = packedSku.sourceInfo;
        }
        if ((262144 & i2) != 0) {
            str18 = packedSku.entranceInfo;
        }
        if ((524288 & i2) != 0) {
            str17 = packedSku.chainKey;
        }
        if ((i2 & 1048576) != 0) {
            promotionView3 = packedSku.promotionView;
        }
        return packedSku.copy(str12, str13, str14, num5, str11, list4, str15, num7, str16, num8, skuPrice2, image3, num6, list5, str19, pickTag2, list6, str20, str18, str17, promotionView3);
    }

    public final String component1() {
        return this.productId;
    }

    public final Integer component10() {
        return this.purchaseLimit;
    }

    public final SkuPrice component11() {
        return this.price;
    }

    public final Image component12() {
        return this.image;
    }

    public final Integer component13() {
        return this.skuAmount;
    }

    public final List<Button> component14() {
        return this.button;
    }

    public final String component15() {
        return this.link;
    }

    public final PickTag component16() {
        return this.activityInfo;
    }

    public final List<PromotionLogo> component17() {
        return this.promotionLogos;
    }

    public final String component18() {
        return this.sourceInfo;
    }

    public final String component19() {
        return this.entranceInfo;
    }

    public final String component2() {
        return this.skuId;
    }

    public final String component20() {
        return this.chainKey;
    }

    public final PromotionView component21() {
        return this.promotionView;
    }

    public final String component3() {
        return this.cartItemId;
    }

    public final Integer component4() {
        return this.status;
    }

    public final String component5() {
        return this.productName;
    }

    public final List<PackedSKUSaleProp> component6() {
        return this.packedSKUSaleProps;
    }

    public final String component7() {
        return this.salePropsStr;
    }

    public final Integer component8() {
        return this.stock;
    }

    public final String component9() {
        return this.lowStockWarning;
    }

    public final PackedSku copy(String str, String str2, String str3, Integer num, String str4, List<PackedSKUSaleProp> list, String str5, Integer num2, String str6, Integer num3, SkuPrice skuPrice, Image image2, Integer num4, List<Button> list2, String str7, PickTag pickTag, List<PromotionLogo> list3, String str8, String str9, String str10, PromotionView promotionView2) {
        return new PackedSku(str, str2, str3, num, str4, list, str5, num2, str6, num3, skuPrice, image2, num4, list2, str7, pickTag, list3, str8, str9, str10, promotionView2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSku)) {
            return false;
        }
        PackedSku packedSku = (PackedSku) obj;
        return l.a(this.productId, packedSku.productId) && l.a(this.skuId, packedSku.skuId) && l.a(this.cartItemId, packedSku.cartItemId) && l.a(this.status, packedSku.status) && l.a(this.productName, packedSku.productName) && l.a(this.packedSKUSaleProps, packedSku.packedSKUSaleProps) && l.a(this.salePropsStr, packedSku.salePropsStr) && l.a(this.stock, packedSku.stock) && l.a(this.lowStockWarning, packedSku.lowStockWarning) && l.a(this.purchaseLimit, packedSku.purchaseLimit) && l.a(this.price, packedSku.price) && l.a(this.image, packedSku.image) && l.a(this.skuAmount, packedSku.skuAmount) && l.a(this.button, packedSku.button) && l.a(this.link, packedSku.link) && l.a(this.activityInfo, packedSku.activityInfo) && l.a(this.promotionLogos, packedSku.promotionLogos) && l.a(this.sourceInfo, packedSku.sourceInfo) && l.a(this.entranceInfo, packedSku.entranceInfo) && l.a(this.chainKey, packedSku.chainKey) && l.a(this.promotionView, packedSku.promotionView);
    }

    public final int hashCode() {
        String str = this.productId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cartItemId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.status;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.productName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<PackedSKUSaleProp> list = this.packedSKUSaleProps;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.salePropsStr;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.stock;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str6 = this.lowStockWarning;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num3 = this.purchaseLimit;
        int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
        SkuPrice skuPrice = this.price;
        int hashCode11 = (hashCode10 + (skuPrice != null ? skuPrice.hashCode() : 0)) * 31;
        Image image2 = this.image;
        int hashCode12 = (hashCode11 + (image2 != null ? image2.hashCode() : 0)) * 31;
        Integer num4 = this.skuAmount;
        int hashCode13 = (hashCode12 + (num4 != null ? num4.hashCode() : 0)) * 31;
        List<Button> list2 = this.button;
        int hashCode14 = (hashCode13 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str7 = this.link;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        PickTag pickTag = this.activityInfo;
        int hashCode16 = (hashCode15 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        List<PromotionLogo> list3 = this.promotionLogos;
        int hashCode17 = (hashCode16 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str8 = this.sourceInfo;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.entranceInfo;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.chainKey;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        PromotionView promotionView2 = this.promotionView;
        if (promotionView2 != null) {
            i2 = promotionView2.hashCode();
        }
        return hashCode20 + i2;
    }

    public final String toString() {
        return "PackedSku(productId=" + this.productId + ", skuId=" + this.skuId + ", cartItemId=" + this.cartItemId + ", status=" + this.status + ", productName=" + this.productName + ", packedSKUSaleProps=" + this.packedSKUSaleProps + ", salePropsStr=" + this.salePropsStr + ", stock=" + this.stock + ", lowStockWarning=" + this.lowStockWarning + ", purchaseLimit=" + this.purchaseLimit + ", price=" + this.price + ", image=" + this.image + ", skuAmount=" + this.skuAmount + ", button=" + this.button + ", link=" + this.link + ", activityInfo=" + this.activityInfo + ", promotionLogos=" + this.promotionLogos + ", sourceInfo=" + this.sourceInfo + ", entranceInfo=" + this.entranceInfo + ", chainKey=" + this.chainKey + ", promotionView=" + this.promotionView + ")";
    }

    public final PickTag getActivityInfo() {
        return this.activityInfo;
    }

    public final List<Button> getButton() {
        return this.button;
    }

    public final String getCartItemId() {
        return this.cartItemId;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final String getEntranceInfo() {
        return this.entranceInfo;
    }

    public final Image getImage() {
        return this.image;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLowStockWarning() {
        return this.lowStockWarning;
    }

    public final List<PackedSKUSaleProp> getPackedSKUSaleProps() {
        return this.packedSKUSaleProps;
    }

    public final SkuPrice getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final List<PromotionLogo> getPromotionLogos() {
        return this.promotionLogos;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final Integer getPurchaseLimit() {
        return this.purchaseLimit;
    }

    public final String getSalePropsStr() {
        return this.salePropsStr;
    }

    public final Integer getSkuAmount() {
        return this.skuAmount;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final String getSourceInfo() {
        return this.sourceInfo;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStock() {
        return this.stock;
    }

    public final PackedSku merge(PackedSku packedSku) {
        SkuPrice skuPrice;
        if (packedSku == null) {
            return this;
        }
        String str = packedSku.productId;
        if (str == null) {
            str = this.productId;
        }
        String str2 = packedSku.skuId;
        if (str2 == null) {
            str2 = this.skuId;
        }
        Integer num = packedSku.status;
        if (num == null) {
            num = this.status;
        }
        String str3 = packedSku.productName;
        if (str3 == null) {
            str3 = this.productName;
        }
        List<PackedSKUSaleProp> list = packedSku.packedSKUSaleProps;
        if (list == null) {
            list = this.packedSKUSaleProps;
        }
        String str4 = packedSku.salePropsStr;
        if (str4 == null) {
            str4 = this.salePropsStr;
        }
        Integer num2 = packedSku.stock;
        if (num2 == null) {
            num2 = this.stock;
        }
        String str5 = packedSku.lowStockWarning;
        if (str5 == null) {
            str5 = this.lowStockWarning;
        }
        Integer num3 = packedSku.purchaseLimit;
        if (num3 == null) {
            num3 = this.purchaseLimit;
        }
        SkuPrice skuPrice2 = this.price;
        if (skuPrice2 == null || (skuPrice = skuPrice2.merge(packedSku.price)) == null) {
            skuPrice = packedSku.price;
        }
        Image image2 = packedSku.image;
        if (image2 == null) {
            image2 = this.image;
        }
        Integer num4 = packedSku.skuAmount;
        if (num4 == null) {
            num4 = this.skuAmount;
        }
        List<Button> list2 = packedSku.button;
        if (list2 == null) {
            list2 = this.button;
        }
        String str6 = packedSku.link;
        if (str6 == null) {
            str6 = this.link;
        }
        String str7 = packedSku.cartItemId;
        if (str7 == null) {
            str7 = this.cartItemId;
        }
        PickTag pickTag = packedSku.activityInfo;
        if (pickTag == null) {
            pickTag = this.activityInfo;
        }
        List<PromotionLogo> list3 = packedSku.promotionLogos;
        if (list3 == null) {
            list3 = this.promotionLogos;
        }
        String str8 = packedSku.chainKey;
        if (str8 == null) {
            str8 = this.chainKey;
        }
        String str9 = packedSku.sourceInfo;
        if (str9 == null) {
            str9 = this.sourceInfo;
        }
        String str10 = packedSku.entranceInfo;
        if (str10 == null) {
            str10 = this.entranceInfo;
        }
        PromotionView promotionView2 = packedSku.promotionView;
        if (promotionView2 == null) {
            promotionView2 = this.promotionView;
        }
        return new PackedSku(str, str2, str7, num, str3, list, str4, num2, str5, num3, skuPrice, image2, num4, list2, str6, pickTag, list3, str9, str10, str8, promotionView2);
    }

    public PackedSku(String str, String str2, String str3, Integer num, String str4, List<PackedSKUSaleProp> list, String str5, Integer num2, String str6, Integer num3, SkuPrice skuPrice, Image image2, Integer num4, List<Button> list2, String str7, PickTag pickTag, List<PromotionLogo> list3, String str8, String str9, String str10, PromotionView promotionView2) {
        this.productId = str;
        this.skuId = str2;
        this.cartItemId = str3;
        this.status = num;
        this.productName = str4;
        this.packedSKUSaleProps = list;
        this.salePropsStr = str5;
        this.stock = num2;
        this.lowStockWarning = str6;
        this.purchaseLimit = num3;
        this.price = skuPrice;
        this.image = image2;
        this.skuAmount = num4;
        this.button = list2;
        this.link = str7;
        this.activityInfo = pickTag;
        this.promotionLogos = list3;
        this.sourceInfo = str8;
        this.entranceInfo = str9;
        this.chainKey = str10;
        this.promotionView = promotionView2;
    }
}
