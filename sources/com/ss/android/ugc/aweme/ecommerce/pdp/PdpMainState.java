package com.ss.android.ugc.aweme.ecommerce.pdp;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class PdpMainState implements af {
    private final AddToCartButton addToCartButton;
    private final a bottomBarVO;
    private final float bottomSheetSlideOffset;
    private final CartEntry cartEntry;
    private final a cartTip;
    private final List<Object> contentList;
    private final boolean dismiss;
    private final boolean firstHeaderImageReady;
    private final Long flashSaleCountDown;
    private final Integer flashSaleState;
    private final d focusTabAction;
    private final boolean isFullScreen;
    private final int loadingStatus;
    private final ProductDetailReview reviewInfo;
    private final int scrollOffset;
    private final int sheetState;

    static {
        Covode.recordClassIndex(54010);
    }

    public PdpMainState() {
        this(false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65535, null);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ PdpMainState copy$default(PdpMainState pdpMainState, boolean z, a aVar, boolean z2, int i2, ProductDetailReview productDetailReview, List list, float f2, int i3, d dVar, int i4, boolean z3, Integer num, Long l2, a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2, int i5, Object obj) {
        a aVar3 = aVar;
        boolean z4 = z;
        ProductDetailReview productDetailReview2 = productDetailReview;
        int i6 = i2;
        boolean z5 = z2;
        int i7 = i3;
        float f3 = f2;
        List list2 = list;
        boolean z6 = z3;
        int i8 = i4;
        d dVar2 = dVar;
        a aVar4 = aVar2;
        Long l3 = l2;
        Integer num2 = num;
        AddToCartButton addToCartButton3 = addToCartButton2;
        CartEntry cartEntry3 = cartEntry2;
        if ((i5 & 1) != 0) {
            z4 = pdpMainState.isFullScreen;
        }
        if ((i5 & 2) != 0) {
            aVar3 = pdpMainState.bottomBarVO;
        }
        if ((i5 & 4) != 0) {
            z5 = pdpMainState.dismiss;
        }
        if ((i5 & 8) != 0) {
            i6 = pdpMainState.sheetState;
        }
        if ((i5 & 16) != 0) {
            productDetailReview2 = pdpMainState.reviewInfo;
        }
        if ((i5 & 32) != 0) {
            list2 = pdpMainState.contentList;
        }
        if ((i5 & 64) != 0) {
            f3 = pdpMainState.bottomSheetSlideOffset;
        }
        if ((i5 & 128) != 0) {
            i7 = pdpMainState.scrollOffset;
        }
        if ((i5 & 256) != 0) {
            dVar2 = pdpMainState.focusTabAction;
        }
        if ((i5 & 512) != 0) {
            i8 = pdpMainState.loadingStatus;
        }
        if ((i5 & 1024) != 0) {
            z6 = pdpMainState.firstHeaderImageReady;
        }
        if ((i5 & 2048) != 0) {
            num2 = pdpMainState.flashSaleState;
        }
        if ((i5 & 4096) != 0) {
            l3 = pdpMainState.flashSaleCountDown;
        }
        if ((i5 & 8192) != 0) {
            aVar4 = pdpMainState.cartTip;
        }
        if ((i5 & 16384) != 0) {
            cartEntry3 = pdpMainState.cartEntry;
        }
        if ((i5 & 32768) != 0) {
            addToCartButton3 = pdpMainState.addToCartButton;
        }
        return pdpMainState.copy(z4, aVar3, z5, i6, productDetailReview2, list2, f3, i7, dVar2, i8, z6, num2, l3, aVar4, cartEntry3, addToCartButton3);
    }

    public final boolean component1() {
        return this.isFullScreen;
    }

    public final int component10() {
        return this.loadingStatus;
    }

    public final boolean component11() {
        return this.firstHeaderImageReady;
    }

    public final Integer component12() {
        return this.flashSaleState;
    }

    public final Long component13() {
        return this.flashSaleCountDown;
    }

    public final a component14() {
        return this.cartTip;
    }

    public final CartEntry component15() {
        return this.cartEntry;
    }

    public final AddToCartButton component16() {
        return this.addToCartButton;
    }

    public final a component2() {
        return this.bottomBarVO;
    }

    public final boolean component3() {
        return this.dismiss;
    }

    public final int component4() {
        return this.sheetState;
    }

    public final ProductDetailReview component5() {
        return this.reviewInfo;
    }

    public final List<Object> component6() {
        return this.contentList;
    }

    public final float component7() {
        return this.bottomSheetSlideOffset;
    }

    public final int component8() {
        return this.scrollOffset;
    }

    public final d component9() {
        return this.focusTabAction;
    }

    public final PdpMainState copy(boolean z, a aVar, boolean z2, int i2, ProductDetailReview productDetailReview, List<? extends Object> list, float f2, int i3, d dVar, int i4, boolean z3, Integer num, Long l2, a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2) {
        l.d(list, "");
        l.d(dVar, "");
        return new PdpMainState(z, aVar, z2, i2, productDetailReview, list, f2, i3, dVar, i4, z3, num, l2, aVar2, cartEntry2, addToCartButton2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpMainState)) {
            return false;
        }
        PdpMainState pdpMainState = (PdpMainState) obj;
        return this.isFullScreen == pdpMainState.isFullScreen && l.a(this.bottomBarVO, pdpMainState.bottomBarVO) && this.dismiss == pdpMainState.dismiss && this.sheetState == pdpMainState.sheetState && l.a(this.reviewInfo, pdpMainState.reviewInfo) && l.a(this.contentList, pdpMainState.contentList) && Float.compare(this.bottomSheetSlideOffset, pdpMainState.bottomSheetSlideOffset) == 0 && this.scrollOffset == pdpMainState.scrollOffset && l.a(this.focusTabAction, pdpMainState.focusTabAction) && this.loadingStatus == pdpMainState.loadingStatus && this.firstHeaderImageReady == pdpMainState.firstHeaderImageReady && l.a(this.flashSaleState, pdpMainState.flashSaleState) && l.a(this.flashSaleCountDown, pdpMainState.flashSaleCountDown) && l.a(this.cartTip, pdpMainState.cartTip) && l.a(this.cartEntry, pdpMainState.cartEntry) && l.a(this.addToCartButton, pdpMainState.addToCartButton);
    }

    public final int hashCode() {
        boolean z = this.isFullScreen;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        a aVar = this.bottomBarVO;
        int i7 = 0;
        int hashCode = (i6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z2 = this.dismiss;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i8) * 31) + com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.sheetState)) * 31;
        ProductDetailReview productDetailReview = this.reviewInfo;
        int hashCode2 = (com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        List<Object> list = this.contentList;
        int hashCode3 = (((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.bottomSheetSlideOffset)) * 31) + com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.scrollOffset)) * 31;
        d dVar = this.focusTabAction;
        int hashCode4 = (((hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.loadingStatus)) * 31;
        if (!this.firstHeaderImageReady) {
            i2 = 0;
        }
        int i11 = (hashCode4 + i2) * 31;
        Integer num = this.flashSaleState;
        int hashCode5 = (i11 + (num != null ? num.hashCode() : 0)) * 31;
        Long l2 = this.flashSaleCountDown;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        a aVar2 = this.cartTip;
        int hashCode7 = (hashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        CartEntry cartEntry2 = this.cartEntry;
        int hashCode8 = (hashCode7 + (cartEntry2 != null ? cartEntry2.hashCode() : 0)) * 31;
        AddToCartButton addToCartButton2 = this.addToCartButton;
        if (addToCartButton2 != null) {
            i7 = addToCartButton2.hashCode();
        }
        return hashCode8 + i7;
    }

    public final String toString() {
        return "PdpMainState(isFullScreen=" + this.isFullScreen + ", bottomBarVO=" + this.bottomBarVO + ", dismiss=" + this.dismiss + ", sheetState=" + this.sheetState + ", reviewInfo=" + this.reviewInfo + ", contentList=" + this.contentList + ", bottomSheetSlideOffset=" + this.bottomSheetSlideOffset + ", scrollOffset=" + this.scrollOffset + ", focusTabAction=" + this.focusTabAction + ", loadingStatus=" + this.loadingStatus + ", firstHeaderImageReady=" + this.firstHeaderImageReady + ", flashSaleState=" + this.flashSaleState + ", flashSaleCountDown=" + this.flashSaleCountDown + ", cartTip=" + this.cartTip + ", cartEntry=" + this.cartEntry + ", addToCartButton=" + this.addToCartButton + ")";
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final a getBottomBarVO() {
        return this.bottomBarVO;
    }

    public final float getBottomSheetSlideOffset() {
        return this.bottomSheetSlideOffset;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final a getCartTip() {
        return this.cartTip;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final boolean getFirstHeaderImageReady() {
        return this.firstHeaderImageReady;
    }

    public final Long getFlashSaleCountDown() {
        return this.flashSaleCountDown;
    }

    public final Integer getFlashSaleState() {
        return this.flashSaleState;
    }

    public final d getFocusTabAction() {
        return this.focusTabAction;
    }

    public final int getLoadingStatus() {
        return this.loadingStatus;
    }

    public final ProductDetailReview getReviewInfo() {
        return this.reviewInfo;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final int getSheetState() {
        return this.sheetState;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public static int com_ss_android_ugc_aweme_ecommerce_pdp_PdpMainState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public PdpMainState(boolean z, a aVar, boolean z2, int i2, ProductDetailReview productDetailReview, List<? extends Object> list, float f2, int i3, d dVar, int i4, boolean z3, Integer num, Long l2, a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2) {
        l.d(list, "");
        l.d(dVar, "");
        this.isFullScreen = z;
        this.bottomBarVO = aVar;
        this.dismiss = z2;
        this.sheetState = i2;
        this.reviewInfo = productDetailReview;
        this.contentList = list;
        this.bottomSheetSlideOffset = f2;
        this.scrollOffset = i3;
        this.focusTabAction = dVar;
        this.loadingStatus = i4;
        this.firstHeaderImageReady = z3;
        this.flashSaleState = num;
        this.flashSaleCountDown = l2;
        this.cartTip = aVar2;
        this.cartEntry = cartEntry2;
        this.addToCartButton = addToCartButton2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PdpMainState(boolean z, a aVar, boolean z2, int i2, ProductDetailReview productDetailReview, List list, float f2, int i3, d dVar, int i4, boolean z3, Integer num, Long l2, a aVar2, CartEntry cartEntry2, AddToCartButton addToCartButton2, int i5, g gVar) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? null : aVar, (i5 & 4) != 0 ? false : z2, (i5 & 8) != 0 ? 4 : i2, (i5 & 16) != 0 ? null : productDetailReview, (i5 & 32) != 0 ? z.INSTANCE : list, (i5 & 64) != 0 ? 0.0f : f2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? new d(0, false) : dVar, (i5 & 512) != 0 ? 0 : i4, (i5 & 1024) == 0 ? z3 : false, (i5 & 2048) != 0 ? null : num, (i5 & 4096) != 0 ? null : l2, (i5 & 8192) != 0 ? null : aVar2, (i5 & 16384) != 0 ? null : cartEntry2, (i5 & 32768) != 0 ? null : addToCartButton2);
    }
}
