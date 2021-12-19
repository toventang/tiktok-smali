package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class SkuItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<SkuItem> CREATOR = new a();
    @c(a = "add_to_cart_button")
    private final AddToCartButton addToCartButton;
    @c(a = "low_stock_warning")
    private final String lowStockWarning;
    @c(a = "need_icon")
    private final Boolean needIcon;
    @c(a = "price")
    private final SkuPrice price;
    @c(a = "promotion_view")
    private final PromotionView promotionView;
    @c(a = "purchase_limit")
    private final Integer purchaseLimit;
    @c(a = "sale_prop_value_ids")
    private final String salePropValueIds;
    @c(a = "sku_id")
    private final String skuId;
    @c(a = "sku_sale_props")
    private final List<SkuSaleProp> skuSalePropList;
    @c(a = "stock")
    private final Integer stockNum;
    @c(a = "voucher_info")
    private final SkuVoucher voucherInfo;
    @c(a = "warehouse_id")
    private String warehouseId;

    static {
        Covode.recordClassIndex(54905);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuItem copy$default(SkuItem skuItem, String str, List list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton2, PromotionView promotionView2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = skuItem.skuId;
        }
        if ((i2 & 2) != 0) {
            list = skuItem.skuSalePropList;
        }
        if ((i2 & 4) != 0) {
            str2 = skuItem.salePropValueIds;
        }
        if ((i2 & 8) != 0) {
            num = skuItem.stockNum;
        }
        if ((i2 & 16) != 0) {
            str3 = skuItem.lowStockWarning;
        }
        if ((i2 & 32) != 0) {
            num2 = skuItem.purchaseLimit;
        }
        if ((i2 & 64) != 0) {
            skuPrice = skuItem.price;
        }
        if ((i2 & 128) != 0) {
            bool = skuItem.needIcon;
        }
        if ((i2 & 256) != 0) {
            skuVoucher = skuItem.voucherInfo;
        }
        if ((i2 & 512) != 0) {
            str4 = skuItem.warehouseId;
        }
        if ((i2 & 1024) != 0) {
            addToCartButton2 = skuItem.addToCartButton;
        }
        if ((i2 & 2048) != 0) {
            promotionView2 = skuItem.promotionView;
        }
        return skuItem.copy(str, list, str2, num, str3, num2, skuPrice, bool, skuVoucher, str4, addToCartButton2, promotionView2);
    }

    public final String component1() {
        return this.skuId;
    }

    public final String component10() {
        return this.warehouseId;
    }

    public final AddToCartButton component11() {
        return this.addToCartButton;
    }

    public final PromotionView component12() {
        return this.promotionView;
    }

    public final List<SkuSaleProp> component2() {
        return this.skuSalePropList;
    }

    public final String component3() {
        return this.salePropValueIds;
    }

    public final Integer component4() {
        return this.stockNum;
    }

    public final String component5() {
        return this.lowStockWarning;
    }

    public final Integer component6() {
        return this.purchaseLimit;
    }

    public final SkuPrice component7() {
        return this.price;
    }

    public final Boolean component8() {
        return this.needIcon;
    }

    public final SkuVoucher component9() {
        return this.voucherInfo;
    }

    public final SkuItem copy(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton2, PromotionView promotionView2) {
        return new SkuItem(str, list, str2, num, str3, num2, skuPrice, bool, skuVoucher, str4, addToCartButton2, promotionView2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuItem)) {
            return false;
        }
        SkuItem skuItem = (SkuItem) obj;
        return l.a(this.skuId, skuItem.skuId) && l.a(this.skuSalePropList, skuItem.skuSalePropList) && l.a(this.salePropValueIds, skuItem.salePropValueIds) && l.a(this.stockNum, skuItem.stockNum) && l.a(this.lowStockWarning, skuItem.lowStockWarning) && l.a(this.purchaseLimit, skuItem.purchaseLimit) && l.a(this.price, skuItem.price) && l.a(this.needIcon, skuItem.needIcon) && l.a(this.voucherInfo, skuItem.voucherInfo) && l.a(this.warehouseId, skuItem.warehouseId) && l.a(this.addToCartButton, skuItem.addToCartButton) && l.a(this.promotionView, skuItem.promotionView);
    }

    public final int hashCode() {
        String str = this.skuId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<SkuSaleProp> list = this.skuSalePropList;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.salePropValueIds;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.stockNum;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.lowStockWarning;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.purchaseLimit;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        SkuPrice skuPrice = this.price;
        int hashCode7 = (hashCode6 + (skuPrice != null ? skuPrice.hashCode() : 0)) * 31;
        Boolean bool = this.needIcon;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        SkuVoucher skuVoucher = this.voucherInfo;
        int hashCode9 = (hashCode8 + (skuVoucher != null ? skuVoucher.hashCode() : 0)) * 31;
        String str4 = this.warehouseId;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton2 = this.addToCartButton;
        int hashCode11 = (hashCode10 + (addToCartButton2 != null ? addToCartButton2.hashCode() : 0)) * 31;
        PromotionView promotionView2 = this.promotionView;
        if (promotionView2 != null) {
            i2 = promotionView2.hashCode();
        }
        return hashCode11 + i2;
    }

    public final SkuItem merge(SkuItem skuItem) {
        return skuItem == null ? this : skuItem;
    }

    public final String toString() {
        return "SkuItem(skuId=" + this.skuId + ", skuSalePropList=" + this.skuSalePropList + ", salePropValueIds=" + this.salePropValueIds + ", stockNum=" + this.stockNum + ", lowStockWarning=" + this.lowStockWarning + ", purchaseLimit=" + this.purchaseLimit + ", price=" + this.price + ", needIcon=" + this.needIcon + ", voucherInfo=" + this.voucherInfo + ", warehouseId=" + this.warehouseId + ", addToCartButton=" + this.addToCartButton + ", promotionView=" + this.promotionView + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.skuId);
        List<SkuSaleProp> list = this.skuSalePropList;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SkuSaleProp skuSaleProp : list) {
                skuSaleProp.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.salePropValueIds);
        Integer num = this.stockNum;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.lowStockWarning);
        Integer num2 = this.purchaseLimit;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        SkuPrice skuPrice = this.price;
        if (skuPrice != null) {
            parcel.writeInt(1);
            skuPrice.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.needIcon;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        SkuVoucher skuVoucher = this.voucherInfo;
        if (skuVoucher != null) {
            parcel.writeInt(1);
            skuVoucher.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.warehouseId);
        AddToCartButton addToCartButton2 = this.addToCartButton;
        if (addToCartButton2 != null) {
            parcel.writeInt(1);
            addToCartButton2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.promotionView, i2);
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final String getLowStockWarning() {
        return this.lowStockWarning;
    }

    public final Boolean getNeedIcon() {
        return this.needIcon;
    }

    public final SkuPrice getPrice() {
        return this.price;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final Integer getPurchaseLimit() {
        return this.purchaseLimit;
    }

    public final String getSalePropValueIds() {
        return this.salePropValueIds;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final List<SkuSaleProp> getSkuSalePropList() {
        return this.skuSalePropList;
    }

    public final Integer getStockNum() {
        return this.stockNum;
    }

    public final SkuVoucher getVoucherInfo() {
        return this.voucherInfo;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public static class a implements Parcelable.Creator<SkuItem> {
        static {
            Covode.recordClassIndex(54906);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SkuItem[] newArray(int i2) {
            return new SkuItem[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SkuItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            AddToCartButton addToCartButton = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SkuSaleProp.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            String readString2 = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            SkuPrice createFromParcel = parcel.readInt() != 0 ? SkuPrice.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            SkuVoucher createFromParcel2 = parcel.readInt() != 0 ? SkuVoucher.CREATOR.createFromParcel(parcel) : null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                addToCartButton = AddToCartButton.CREATOR.createFromParcel(parcel);
            }
            return new SkuItem(readString, arrayList, readString2, valueOf, readString3, valueOf2, createFromParcel, bool, createFromParcel2, readString4, addToCartButton, (PromotionView) parcel.readParcelable(SkuItem.class.getClassLoader()));
        }
    }

    public final void setWarehouseId(String str) {
        this.warehouseId = str;
    }

    public SkuItem(String str, List<SkuSaleProp> list, String str2, Integer num, String str3, Integer num2, SkuPrice skuPrice, Boolean bool, SkuVoucher skuVoucher, String str4, AddToCartButton addToCartButton2, PromotionView promotionView2) {
        this.skuId = str;
        this.skuSalePropList = list;
        this.salePropValueIds = str2;
        this.stockNum = num;
        this.lowStockWarning = str3;
        this.purchaseLimit = num2;
        this.price = skuPrice;
        this.needIcon = bool;
        this.voucherInfo = skuVoucher;
        this.warehouseId = str4;
        this.addToCartButton = addToCartButton2;
        this.promotionView = promotionView2;
    }
}
