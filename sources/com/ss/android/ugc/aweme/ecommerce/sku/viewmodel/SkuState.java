package com.ss.android.ugc.aweme.ecommerce.sku.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;

public final class SkuState implements af {
    private AddToCartButton addToCartButton;
    private final Image currentImage;
    private final int currentImagePosition;
    private final int currentMaxQuantity;
    private final String currentPrice;
    private final int currentQuantity;
    private final String discountText;
    private final Boolean keyBoardVisibility;
    private final String lowStockWarning;
    private final Boolean needIcon;
    private final String originalPrice;
    private final PromotionView promotionView;
    private boolean showLoadingView;
    private final a skuDataState;
    private final boolean skuFragmentClosed;
    private final String specifications;

    static {
        Covode.recordClassIndex(55012);
    }

    public SkuState() {
        this(null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, null, false, 65535, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_sku_viewmodel_SkuState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ SkuState copy$default(SkuState skuState, Image image, Boolean bool, String str, String str2, PromotionView promotionView2, String str3, String str4, String str5, int i2, int i3, int i4, Boolean bool2, boolean z, a aVar, AddToCartButton addToCartButton2, boolean z2, int i5, Object obj) {
        Boolean bool3 = bool;
        Image image2 = image;
        PromotionView promotionView3 = promotionView2;
        String str6 = str2;
        String str7 = str;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        a aVar2 = aVar;
        boolean z3 = z;
        Boolean bool4 = bool2;
        boolean z4 = z2;
        AddToCartButton addToCartButton3 = addToCartButton2;
        if ((i5 & 1) != 0) {
            image2 = skuState.currentImage;
        }
        if ((i5 & 2) != 0) {
            bool3 = skuState.needIcon;
        }
        if ((i5 & 4) != 0) {
            str7 = skuState.currentPrice;
        }
        if ((i5 & 8) != 0) {
            str6 = skuState.lowStockWarning;
        }
        if ((i5 & 16) != 0) {
            promotionView3 = skuState.promotionView;
        }
        if ((i5 & 32) != 0) {
            str10 = skuState.originalPrice;
        }
        if ((i5 & 64) != 0) {
            str9 = skuState.discountText;
        }
        if ((i5 & 128) != 0) {
            str8 = skuState.specifications;
        }
        if ((i5 & 256) != 0) {
            i8 = skuState.currentMaxQuantity;
        }
        if ((i5 & 512) != 0) {
            i7 = skuState.currentQuantity;
        }
        if ((i5 & 1024) != 0) {
            i6 = skuState.currentImagePosition;
        }
        if ((i5 & 2048) != 0) {
            bool4 = skuState.keyBoardVisibility;
        }
        if ((i5 & 4096) != 0) {
            z3 = skuState.skuFragmentClosed;
        }
        if ((i5 & 8192) != 0) {
            aVar2 = skuState.skuDataState;
        }
        if ((i5 & 16384) != 0) {
            addToCartButton3 = skuState.addToCartButton;
        }
        if ((i5 & 32768) != 0) {
            z4 = skuState.showLoadingView;
        }
        return skuState.copy(image2, bool3, str7, str6, promotionView3, str10, str9, str8, i8, i7, i6, bool4, z3, aVar2, addToCartButton3, z4);
    }

    public final Image component1() {
        return this.currentImage;
    }

    public final int component10() {
        return this.currentQuantity;
    }

    public final int component11() {
        return this.currentImagePosition;
    }

    public final Boolean component12() {
        return this.keyBoardVisibility;
    }

    public final boolean component13() {
        return this.skuFragmentClosed;
    }

    public final a component14() {
        return this.skuDataState;
    }

    public final AddToCartButton component15() {
        return this.addToCartButton;
    }

    public final boolean component16() {
        return this.showLoadingView;
    }

    public final Boolean component2() {
        return this.needIcon;
    }

    public final String component3() {
        return this.currentPrice;
    }

    public final String component4() {
        return this.lowStockWarning;
    }

    public final PromotionView component5() {
        return this.promotionView;
    }

    public final String component6() {
        return this.originalPrice;
    }

    public final String component7() {
        return this.discountText;
    }

    public final String component8() {
        return this.specifications;
    }

    public final int component9() {
        return this.currentMaxQuantity;
    }

    public final SkuState copy(Image image, Boolean bool, String str, String str2, PromotionView promotionView2, String str3, String str4, String str5, int i2, int i3, int i4, Boolean bool2, boolean z, a aVar, AddToCartButton addToCartButton2, boolean z2) {
        l.d(str, "");
        l.d(str5, "");
        l.d(aVar, "");
        return new SkuState(image, bool, str, str2, promotionView2, str3, str4, str5, i2, i3, i4, bool2, z, aVar, addToCartButton2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuState)) {
            return false;
        }
        SkuState skuState = (SkuState) obj;
        return l.a(this.currentImage, skuState.currentImage) && l.a(this.needIcon, skuState.needIcon) && l.a(this.currentPrice, skuState.currentPrice) && l.a(this.lowStockWarning, skuState.lowStockWarning) && l.a(this.promotionView, skuState.promotionView) && l.a(this.originalPrice, skuState.originalPrice) && l.a(this.discountText, skuState.discountText) && l.a(this.specifications, skuState.specifications) && this.currentMaxQuantity == skuState.currentMaxQuantity && this.currentQuantity == skuState.currentQuantity && this.currentImagePosition == skuState.currentImagePosition && l.a(this.keyBoardVisibility, skuState.keyBoardVisibility) && this.skuFragmentClosed == skuState.skuFragmentClosed && l.a(this.skuDataState, skuState.skuDataState) && l.a(this.addToCartButton, skuState.addToCartButton) && this.showLoadingView == skuState.showLoadingView;
    }

    public final int hashCode() {
        Image image = this.currentImage;
        int i2 = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        Boolean bool = this.needIcon;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.currentPrice;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.lowStockWarning;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PromotionView promotionView2 = this.promotionView;
        int hashCode5 = (hashCode4 + (promotionView2 != null ? promotionView2.hashCode() : 0)) * 31;
        String str3 = this.originalPrice;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.discountText;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.specifications;
        int hashCode8 = (((((((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_sku_viewmodel_SkuState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentMaxQuantity)) * 31) + com_ss_android_ugc_aweme_ecommerce_sku_viewmodel_SkuState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentQuantity)) * 31) + com_ss_android_ugc_aweme_ecommerce_sku_viewmodel_SkuState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentImagePosition)) * 31;
        Boolean bool2 = this.keyBoardVisibility;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        boolean z = this.skuFragmentClosed;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode9 + i4) * 31;
        a aVar = this.skuDataState;
        int hashCode10 = (i7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton2 = this.addToCartButton;
        if (addToCartButton2 != null) {
            i2 = addToCartButton2.hashCode();
        }
        int i8 = (hashCode10 + i2) * 31;
        if (!this.showLoadingView) {
            i3 = 0;
        }
        return i8 + i3;
    }

    public final String toString() {
        return "SkuState(currentImage=" + this.currentImage + ", needIcon=" + this.needIcon + ", currentPrice=" + this.currentPrice + ", lowStockWarning=" + this.lowStockWarning + ", promotionView=" + this.promotionView + ", originalPrice=" + this.originalPrice + ", discountText=" + this.discountText + ", specifications=" + this.specifications + ", currentMaxQuantity=" + this.currentMaxQuantity + ", currentQuantity=" + this.currentQuantity + ", currentImagePosition=" + this.currentImagePosition + ", keyBoardVisibility=" + this.keyBoardVisibility + ", skuFragmentClosed=" + this.skuFragmentClosed + ", skuDataState=" + this.skuDataState + ", addToCartButton=" + this.addToCartButton + ", showLoadingView=" + this.showLoadingView + ")";
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final Image getCurrentImage() {
        return this.currentImage;
    }

    public final int getCurrentImagePosition() {
        return this.currentImagePosition;
    }

    public final int getCurrentMaxQuantity() {
        return this.currentMaxQuantity;
    }

    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    public final int getCurrentQuantity() {
        return this.currentQuantity;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final Boolean getKeyBoardVisibility() {
        return this.keyBoardVisibility;
    }

    public final String getLowStockWarning() {
        return this.lowStockWarning;
    }

    public final Boolean getNeedIcon() {
        return this.needIcon;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final a getSkuDataState() {
        return this.skuDataState;
    }

    public final boolean getSkuFragmentClosed() {
        return this.skuFragmentClosed;
    }

    public final String getSpecifications() {
        return this.specifications;
    }

    public final void setAddToCartButton(AddToCartButton addToCartButton2) {
        this.addToCartButton = addToCartButton2;
    }

    public final void setShowLoadingView(boolean z) {
        this.showLoadingView = z;
    }

    public SkuState(Image image, Boolean bool, String str, String str2, PromotionView promotionView2, String str3, String str4, String str5, int i2, int i3, int i4, Boolean bool2, boolean z, a aVar, AddToCartButton addToCartButton2, boolean z2) {
        l.d(str, "");
        l.d(str5, "");
        l.d(aVar, "");
        this.currentImage = image;
        this.needIcon = bool;
        this.currentPrice = str;
        this.lowStockWarning = str2;
        this.promotionView = promotionView2;
        this.originalPrice = str3;
        this.discountText = str4;
        this.specifications = str5;
        this.currentMaxQuantity = i2;
        this.currentQuantity = i3;
        this.currentImagePosition = i4;
        this.keyBoardVisibility = bool2;
        this.skuFragmentClosed = z;
        this.skuDataState = aVar;
        this.addToCartButton = addToCartButton2;
        this.showLoadingView = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SkuState(com.ss.android.ugc.aweme.ecommerce.api.model.Image r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, int r29, int r30, java.lang.Boolean r31, boolean r32, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a r33, com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton r34, boolean r35, int r36, h.f.b.g r37) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState.<init>(com.ss.android.ugc.aweme.ecommerce.api.model.Image, java.lang.Boolean, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.Boolean, boolean, com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.a, com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton, boolean, int, h.f.b.g):void");
    }
}
