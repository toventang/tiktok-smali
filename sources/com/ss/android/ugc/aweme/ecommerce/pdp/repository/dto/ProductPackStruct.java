package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.pdp.PopUp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ProductPackStruct implements Parcelable {
    public static final Integer[] B = {2, 1, 3};
    public static final a C = new a((byte) 0);
    public static final Parcelable.Creator<ProductPackStruct> CREATOR = new b();
    @c(a = "schema_info")
    public DynamicSchema A;

    /* renamed from: a  reason: collision with root package name */
    public long f86637a = SystemClock.elapsedRealtime();
    @c(a = "product_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f86638b;
    @c(a = "status")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f86639c;
    @c(a = "seller")

    /* renamed from: d  reason: collision with root package name */
    public final SellerInfo f86640d;
    @c(a = "product_base")

    /* renamed from: e  reason: collision with root package name */
    public final ProductBase f86641e;
    @c(a = "sale_props")

    /* renamed from: f  reason: collision with root package name */
    public final List<SaleProp> f86642f;
    @c(a = "skus")

    /* renamed from: g  reason: collision with root package name */
    public final List<SkuItem> f86643g;
    @c(a = "shop_policies")

    /* renamed from: h  reason: collision with root package name */
    public final List<ShopPolicy> f86644h;
    @c(a = "logistic")

    /* renamed from: i  reason: collision with root package name */
    public final LogisticDTO f86645i;
    @c(a = "additional_info")

    /* renamed from: j  reason: collision with root package name */
    public final List<AdditionInfo> f86646j;
    @c(a = "waist_banner")

    /* renamed from: k  reason: collision with root package name */
    public final WaistBanner f86647k;
    @c(a = "voucher_info")

    /* renamed from: l  reason: collision with root package name */
    public final VoucherInfo f86648l;
    @c(a = "outer_voucher")

    /* renamed from: m  reason: collision with root package name */
    public final Voucher f86649m;
    @c(a = "product_detail_review")
    public final ProductDetailReview n;
    @c(a = "flash_sale")
    public final FlashSale o;
    @c(a = "third_party")
    public final ThirdParty p;
    @c(a = "add_to_cart_button")
    public final AddToCartButton q;
    @c(a = "cart_entry")
    public CartEntry r;
    @c(a = "activity_info")
    public final PickTag s;
    @c(a = "promotion_logos")
    public final List<PromotionLogo> t;
    @c(a = "pop_up")
    public PopUp u;
    @c(a = "chain_key")
    public final String v;
    @c(a = "promotion_view")
    public final PromotionView w;
    @c(a = "half_waist_banner")
    public final HalfWaistBanner x;
    @c(a = "has_shipping_address")
    public Boolean y;
    @c(a = "has_pay_method")
    public Boolean z;

    /* access modifiers changed from: private */
    public static ProductPackStruct a(String str, Integer num, SellerInfo sellerInfo, ProductBase productBase, List<SaleProp> list, List<SkuItem> list2, List<ShopPolicy> list3, LogisticDTO logisticDTO, List<AdditionInfo> list4, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ProductDetailReview productDetailReview, FlashSale flashSale, ThirdParty thirdParty, AddToCartButton addToCartButton, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list5, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema) {
        return new ProductPackStruct(str, num, sellerInfo, productBase, list, list2, list3, logisticDTO, list4, waistBanner, voucherInfo, voucher, productDetailReview, flashSale, thirdParty, addToCartButton, cartEntry, pickTag, list5, popUp, str2, promotionView, halfWaistBanner, bool, bool2, dynamicSchema);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPackStruct)) {
            return false;
        }
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        return l.a(this.f86638b, productPackStruct.f86638b) && l.a(this.f86639c, productPackStruct.f86639c) && l.a(this.f86640d, productPackStruct.f86640d) && l.a(this.f86641e, productPackStruct.f86641e) && l.a(this.f86642f, productPackStruct.f86642f) && l.a(this.f86643g, productPackStruct.f86643g) && l.a(this.f86644h, productPackStruct.f86644h) && l.a(this.f86645i, productPackStruct.f86645i) && l.a(this.f86646j, productPackStruct.f86646j) && l.a(this.f86647k, productPackStruct.f86647k) && l.a(this.f86648l, productPackStruct.f86648l) && l.a(this.f86649m, productPackStruct.f86649m) && l.a(this.n, productPackStruct.n) && l.a(this.o, productPackStruct.o) && l.a(this.p, productPackStruct.p) && l.a(this.q, productPackStruct.q) && l.a(this.r, productPackStruct.r) && l.a(this.s, productPackStruct.s) && l.a(this.t, productPackStruct.t) && l.a(this.u, productPackStruct.u) && l.a(this.v, productPackStruct.v) && l.a(this.w, productPackStruct.w) && l.a(this.x, productPackStruct.x) && l.a(this.y, productPackStruct.y) && l.a(this.z, productPackStruct.z) && l.a(this.A, productPackStruct.A);
    }

    public final int hashCode() {
        String str = this.f86638b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f86639c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        SellerInfo sellerInfo = this.f86640d;
        int hashCode3 = (hashCode2 + (sellerInfo != null ? sellerInfo.hashCode() : 0)) * 31;
        ProductBase productBase = this.f86641e;
        int hashCode4 = (hashCode3 + (productBase != null ? productBase.hashCode() : 0)) * 31;
        List<SaleProp> list = this.f86642f;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<SkuItem> list2 = this.f86643g;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ShopPolicy> list3 = this.f86644h;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        LogisticDTO logisticDTO = this.f86645i;
        int hashCode8 = (hashCode7 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        List<AdditionInfo> list4 = this.f86646j;
        int hashCode9 = (hashCode8 + (list4 != null ? list4.hashCode() : 0)) * 31;
        WaistBanner waistBanner = this.f86647k;
        int hashCode10 = (hashCode9 + (waistBanner != null ? waistBanner.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo = this.f86648l;
        int hashCode11 = (hashCode10 + (voucherInfo != null ? voucherInfo.hashCode() : 0)) * 31;
        Voucher voucher = this.f86649m;
        int hashCode12 = (hashCode11 + (voucher != null ? voucher.hashCode() : 0)) * 31;
        ProductDetailReview productDetailReview = this.n;
        int hashCode13 = (hashCode12 + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        FlashSale flashSale = this.o;
        int hashCode14 = (hashCode13 + (flashSale != null ? flashSale.hashCode() : 0)) * 31;
        ThirdParty thirdParty = this.p;
        int hashCode15 = (hashCode14 + (thirdParty != null ? thirdParty.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton = this.q;
        int hashCode16 = (hashCode15 + (addToCartButton != null ? addToCartButton.hashCode() : 0)) * 31;
        CartEntry cartEntry = this.r;
        int hashCode17 = (hashCode16 + (cartEntry != null ? cartEntry.hashCode() : 0)) * 31;
        PickTag pickTag = this.s;
        int hashCode18 = (hashCode17 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        List<PromotionLogo> list5 = this.t;
        int hashCode19 = (hashCode18 + (list5 != null ? list5.hashCode() : 0)) * 31;
        PopUp popUp = this.u;
        int hashCode20 = (hashCode19 + (popUp != null ? popUp.hashCode() : 0)) * 31;
        String str2 = this.v;
        int hashCode21 = (hashCode20 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PromotionView promotionView = this.w;
        int hashCode22 = (hashCode21 + (promotionView != null ? promotionView.hashCode() : 0)) * 31;
        HalfWaistBanner halfWaistBanner = this.x;
        int hashCode23 = (hashCode22 + (halfWaistBanner != null ? halfWaistBanner.hashCode() : 0)) * 31;
        Boolean bool = this.y;
        int hashCode24 = (hashCode23 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.z;
        int hashCode25 = (hashCode24 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        DynamicSchema dynamicSchema = this.A;
        if (dynamicSchema != null) {
            i2 = dynamicSchema.hashCode();
        }
        return hashCode25 + i2;
    }

    public final String toString() {
        return "ProductPackStruct(productId=" + this.f86638b + ", status=" + this.f86639c + ", sellerInfo=" + this.f86640d + ", baseInfo=" + this.f86641e + ", saleProps=" + this.f86642f + ", skus=" + this.f86643g + ", shopPolicies=" + this.f86644h + ", logistic=" + this.f86645i + ", additionInfo=" + this.f86646j + ", waistBanner=" + this.f86647k + ", voucherInfo=" + this.f86648l + ", outerVoucher=" + this.f86649m + ", review=" + this.n + ", flashSale=" + this.o + ", thirdPartyData=" + this.p + ", addToCartButton=" + this.q + ", cartEntry=" + this.r + ", activityInfo=" + this.s + ", promotionLogos=" + this.t + ", popUp=" + this.u + ", chainKey=" + this.v + ", promotionView=" + this.w + ", halfWaistBanner=" + this.x + ", hasShippingAddress=" + this.y + ", hasPayMethod=" + this.z + ", schemaInfo=" + this.A + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86638b);
        Integer num = this.f86639c;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        SellerInfo sellerInfo = this.f86640d;
        if (sellerInfo != null) {
            parcel.writeInt(1);
            sellerInfo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ProductBase productBase = this.f86641e;
        if (productBase != null) {
            parcel.writeInt(1);
            productBase.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<SaleProp> list = this.f86642f;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SaleProp saleProp : list) {
                saleProp.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<SkuItem> list2 = this.f86643g;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (SkuItem skuItem : list2) {
                skuItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<ShopPolicy> list3 = this.f86644h;
        if (list3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (ShopPolicy shopPolicy : list3) {
                shopPolicy.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        LogisticDTO logisticDTO = this.f86645i;
        if (logisticDTO != null) {
            parcel.writeInt(1);
            logisticDTO.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<AdditionInfo> list4 = this.f86646j;
        if (list4 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (AdditionInfo additionInfo : list4) {
                additionInfo.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        WaistBanner waistBanner = this.f86647k;
        if (waistBanner != null) {
            parcel.writeInt(1);
            waistBanner.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        VoucherInfo voucherInfo = this.f86648l;
        if (voucherInfo != null) {
            parcel.writeInt(1);
            voucherInfo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Voucher voucher = this.f86649m;
        if (voucher != null) {
            parcel.writeInt(1);
            voucher.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ProductDetailReview productDetailReview = this.n;
        if (productDetailReview != null) {
            parcel.writeInt(1);
            productDetailReview.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        FlashSale flashSale = this.o;
        if (flashSale != null) {
            parcel.writeInt(1);
            flashSale.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ThirdParty thirdParty = this.p;
        if (thirdParty != null) {
            parcel.writeInt(1);
            thirdParty.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        AddToCartButton addToCartButton = this.q;
        if (addToCartButton != null) {
            parcel.writeInt(1);
            addToCartButton.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        CartEntry cartEntry = this.r;
        if (cartEntry != null) {
            parcel.writeInt(1);
            cartEntry.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        PickTag pickTag = this.s;
        if (pickTag != null) {
            parcel.writeInt(1);
            pickTag.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<PromotionLogo> list5 = this.t;
        if (list5 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list5.size());
            for (PromotionLogo promotionLogo : list5) {
                promotionLogo.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        PopUp popUp = this.u;
        if (popUp != null) {
            parcel.writeInt(1);
            popUp.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.v);
        parcel.writeParcelable(this.w, i2);
        HalfWaistBanner halfWaistBanner = this.x;
        if (halfWaistBanner != null) {
            parcel.writeInt(1);
            halfWaistBanner.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.y;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.z;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        DynamicSchema dynamicSchema = this.A;
        if (dynamicSchema != null) {
            parcel.writeInt(1);
            dynamicSchema.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54268);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b implements Parcelable.Creator<ProductPackStruct> {
        static {
            Covode.recordClassIndex(54269);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductPackStruct[] newArray(int i2) {
            return new ProductPackStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductPackStruct createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean bool;
            Boolean bool2;
            l.d(parcel, "");
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            SellerInfo createFromParcel = parcel.readInt() != 0 ? SellerInfo.CREATOR.createFromParcel(parcel) : null;
            ProductBase createFromParcel2 = parcel.readInt() != 0 ? ProductBase.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(SaleProp.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(SkuItem.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList3.add(ShopPolicy.CREATOR.createFromParcel(parcel));
                    readInt3--;
                }
            } else {
                arrayList3 = null;
            }
            LogisticDTO createFromParcel3 = parcel.readInt() != 0 ? LogisticDTO.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (readInt4 != 0) {
                    arrayList4.add(AdditionInfo.CREATOR.createFromParcel(parcel));
                    readInt4--;
                }
            } else {
                arrayList4 = null;
            }
            WaistBanner createFromParcel4 = parcel.readInt() != 0 ? WaistBanner.CREATOR.createFromParcel(parcel) : null;
            VoucherInfo createFromParcel5 = parcel.readInt() != 0 ? VoucherInfo.CREATOR.createFromParcel(parcel) : null;
            Voucher createFromParcel6 = parcel.readInt() != 0 ? Voucher.CREATOR.createFromParcel(parcel) : null;
            ProductDetailReview createFromParcel7 = parcel.readInt() != 0 ? ProductDetailReview.CREATOR.createFromParcel(parcel) : null;
            FlashSale createFromParcel8 = parcel.readInt() != 0 ? FlashSale.CREATOR.createFromParcel(parcel) : null;
            ThirdParty createFromParcel9 = parcel.readInt() != 0 ? ThirdParty.CREATOR.createFromParcel(parcel) : null;
            AddToCartButton createFromParcel10 = parcel.readInt() != 0 ? AddToCartButton.CREATOR.createFromParcel(parcel) : null;
            CartEntry createFromParcel11 = parcel.readInt() != 0 ? CartEntry.CREATOR.createFromParcel(parcel) : null;
            PickTag createFromParcel12 = parcel.readInt() != 0 ? PickTag.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (readInt5 != 0) {
                    arrayList5.add(PromotionLogo.CREATOR.createFromParcel(parcel));
                    readInt5--;
                }
            } else {
                arrayList5 = null;
            }
            PopUp createFromParcel13 = parcel.readInt() != 0 ? PopUp.CREATOR.createFromParcel(parcel) : null;
            String readString2 = parcel.readString();
            PromotionView promotionView = (PromotionView) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
            HalfWaistBanner createFromParcel14 = parcel.readInt() != 0 ? HalfWaistBanner.CREATOR.createFromParcel(parcel) : null;
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            return new ProductPackStruct(readString, valueOf, createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3, createFromParcel3, arrayList4, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, arrayList5, createFromParcel13, readString2, promotionView, createFromParcel14, bool, bool2, parcel.readInt() != 0 ? DynamicSchema.CREATOR.createFromParcel(parcel) : null);
        }
    }

    static {
        Covode.recordClassIndex(54267);
    }

    public ProductPackStruct(String str, Integer num, SellerInfo sellerInfo, ProductBase productBase, List<SaleProp> list, List<SkuItem> list2, List<ShopPolicy> list3, LogisticDTO logisticDTO, List<AdditionInfo> list4, WaistBanner waistBanner, VoucherInfo voucherInfo, Voucher voucher, ProductDetailReview productDetailReview, FlashSale flashSale, ThirdParty thirdParty, AddToCartButton addToCartButton, CartEntry cartEntry, PickTag pickTag, List<PromotionLogo> list5, PopUp popUp, String str2, PromotionView promotionView, HalfWaistBanner halfWaistBanner, Boolean bool, Boolean bool2, DynamicSchema dynamicSchema) {
        this.f86638b = str;
        this.f86639c = num;
        this.f86640d = sellerInfo;
        this.f86641e = productBase;
        this.f86642f = list;
        this.f86643g = list2;
        this.f86644h = list3;
        this.f86645i = logisticDTO;
        this.f86646j = list4;
        this.f86647k = waistBanner;
        this.f86648l = voucherInfo;
        this.f86649m = voucher;
        this.n = productDetailReview;
        this.o = flashSale;
        this.p = thirdParty;
        this.q = addToCartButton;
        this.r = cartEntry;
        this.s = pickTag;
        this.t = list5;
        this.u = popUp;
        this.v = str2;
        this.w = promotionView;
        this.x = halfWaistBanner;
        this.y = bool;
        this.z = bool2;
        this.A = dynamicSchema;
    }
}
