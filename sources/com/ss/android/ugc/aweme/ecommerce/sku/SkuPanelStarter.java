package com.ss.android.ugc.aweme.ecommerce.sku;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import h.a.n;
import h.c.d;
import h.f.b.g;
import h.f.b.l;
import h.q;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class SkuPanelStarter {

    /* renamed from: a  reason: collision with root package name */
    public static d<? super SkuPanelState> f87362a;

    /* renamed from: b  reason: collision with root package name */
    public static Long f87363b;

    /* renamed from: c  reason: collision with root package name */
    public static final SkuPanelStarter f87364c = new SkuPanelStarter();

    public static final class SkuEnterParams implements Serializable {
        @c(a = "checked_spec_ids")
        private final String[] checkedSkuIds;
        @c(a = "click_from")
        private final int clickFrom;
        @c(a = "enter_from")
        private final String enterFrom;
        @c(a = "need_request")
        private final boolean needRequest;
        @c(a = "orderRequestParams")
        private final HashMap<String, Object> orderRequestParams;
        @c(a = "needs_dim")
        private final Boolean pdpFullScreen;
        @c(a = "product_id")
        private final String productId;
        @c(a = "quantity")
        private Integer productQuantity;
        @c(a = "trackParams")
        private final HashMap<String, Object> trackParams;
        @c(a = "use_prefetch")
        private final Integer usePrefetch;
        @c(a = "visitReportParams")
        private final HashMap<String, Object> visitReportParams;

        static {
            Covode.recordClassIndex(54842);
        }

        public static int com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter$SkuEnterParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SkuEnterParams copy$default(SkuEnterParams skuEnterParams, String str, Boolean bool, boolean z, int i2, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = skuEnterParams.productId;
            }
            if ((i3 & 2) != 0) {
                bool = skuEnterParams.pdpFullScreen;
            }
            if ((i3 & 4) != 0) {
                z = skuEnterParams.needRequest;
            }
            if ((i3 & 8) != 0) {
                i2 = skuEnterParams.clickFrom;
            }
            if ((i3 & 16) != 0) {
                str2 = skuEnterParams.enterFrom;
            }
            if ((i3 & 32) != 0) {
                strArr = skuEnterParams.checkedSkuIds;
            }
            if ((i3 & 64) != 0) {
                num = skuEnterParams.productQuantity;
            }
            if ((i3 & 128) != 0) {
                hashMap = skuEnterParams.trackParams;
            }
            if ((i3 & 256) != 0) {
                hashMap2 = skuEnterParams.orderRequestParams;
            }
            if ((i3 & 512) != 0) {
                hashMap3 = skuEnterParams.visitReportParams;
            }
            if ((i3 & 1024) != 0) {
                num2 = skuEnterParams.usePrefetch;
            }
            return skuEnterParams.copy(str, bool, z, i2, str2, strArr, num, hashMap, hashMap2, hashMap3, num2);
        }

        public final String component1() {
            return this.productId;
        }

        public final HashMap<String, Object> component10() {
            return this.visitReportParams;
        }

        public final Integer component11() {
            return this.usePrefetch;
        }

        public final Boolean component2() {
            return this.pdpFullScreen;
        }

        public final boolean component3() {
            return this.needRequest;
        }

        public final int component4() {
            return this.clickFrom;
        }

        public final String component5() {
            return this.enterFrom;
        }

        public final String[] component6() {
            return this.checkedSkuIds;
        }

        public final Integer component7() {
            return this.productQuantity;
        }

        public final HashMap<String, Object> component8() {
            return this.trackParams;
        }

        public final HashMap<String, Object> component9() {
            return this.orderRequestParams;
        }

        public final SkuEnterParams copy(String str, Boolean bool, boolean z, int i2, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2) {
            return new SkuEnterParams(str, bool, z, i2, str2, strArr, num, hashMap, hashMap2, hashMap3, num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuEnterParams)) {
                return false;
            }
            SkuEnterParams skuEnterParams = (SkuEnterParams) obj;
            return l.a(this.productId, skuEnterParams.productId) && l.a(this.pdpFullScreen, skuEnterParams.pdpFullScreen) && this.needRequest == skuEnterParams.needRequest && this.clickFrom == skuEnterParams.clickFrom && l.a(this.enterFrom, skuEnterParams.enterFrom) && l.a(this.checkedSkuIds, skuEnterParams.checkedSkuIds) && l.a(this.productQuantity, skuEnterParams.productQuantity) && l.a(this.trackParams, skuEnterParams.trackParams) && l.a(this.orderRequestParams, skuEnterParams.orderRequestParams) && l.a(this.visitReportParams, skuEnterParams.visitReportParams) && l.a(this.usePrefetch, skuEnterParams.usePrefetch);
        }

        public final int hashCode() {
            String str = this.productId;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Boolean bool = this.pdpFullScreen;
            int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z = this.needRequest;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode2 + i3) * 31) + com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.clickFrom)) * 31;
            String str2 = this.enterFrom;
            int hashCode3 = (com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuEnterParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String[] strArr = this.checkedSkuIds;
            int hashCode4 = (hashCode3 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            Integer num = this.productQuantity;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap = this.trackParams;
            int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap2 = this.orderRequestParams;
            int hashCode7 = (hashCode6 + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap3 = this.visitReportParams;
            int hashCode8 = (hashCode7 + (hashMap3 != null ? hashMap3.hashCode() : 0)) * 31;
            Integer num2 = this.usePrefetch;
            if (num2 != null) {
                i2 = num2.hashCode();
            }
            return hashCode8 + i2;
        }

        public final String toString() {
            return "SkuEnterParams(productId=" + this.productId + ", pdpFullScreen=" + this.pdpFullScreen + ", needRequest=" + this.needRequest + ", clickFrom=" + this.clickFrom + ", enterFrom=" + this.enterFrom + ", checkedSkuIds=" + Arrays.toString(this.checkedSkuIds) + ", productQuantity=" + this.productQuantity + ", trackParams=" + this.trackParams + ", orderRequestParams=" + this.orderRequestParams + ", visitReportParams=" + this.visitReportParams + ", usePrefetch=" + this.usePrefetch + ")";
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final int getClickFrom() {
            return this.clickFrom;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final boolean getNeedRequest() {
            return this.needRequest;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final Boolean getPdpFullScreen() {
            return this.pdpFullScreen;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final Integer getUsePrefetch() {
            return this.usePrefetch;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public SkuEnterParams(String str, Boolean bool, boolean z, int i2, String str2, String[] strArr, Integer num, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, Integer num2) {
            this.productId = str;
            this.pdpFullScreen = bool;
            this.needRequest = z;
            this.clickFrom = i2;
            this.enterFrom = str2;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.trackParams = hashMap;
            this.orderRequestParams = hashMap2;
            this.visitReportParams = hashMap3;
            this.usePrefetch = num2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SkuEnterParams(String str, Boolean bool, boolean z, int i2, String str2, String[] strArr, Integer num, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, Integer num2, int i3, g gVar) {
            this(str, bool, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : strArr, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : hashMap, (i3 & 256) != 0 ? null : hashMap2, (i3 & 512) != 0 ? null : hashMap3, (i3 & 1024) == 0 ? num2 : null);
        }
    }

    public static final class SkuKeyboardVisibilityParams {
        @c(a = "keyboard_visibility")
        private final boolean keyboardVisibility;

        static {
            Covode.recordClassIndex(54843);
        }

        public static /* synthetic */ SkuKeyboardVisibilityParams copy$default(SkuKeyboardVisibilityParams skuKeyboardVisibilityParams, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = skuKeyboardVisibilityParams.keyboardVisibility;
            }
            return skuKeyboardVisibilityParams.copy(z);
        }

        public final boolean component1() {
            return this.keyboardVisibility;
        }

        public final SkuKeyboardVisibilityParams copy(boolean z) {
            return new SkuKeyboardVisibilityParams(z);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SkuKeyboardVisibilityParams) && this.keyboardVisibility == ((SkuKeyboardVisibilityParams) obj).keyboardVisibility;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.keyboardVisibility;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return "SkuKeyboardVisibilityParams(keyboardVisibility=" + this.keyboardVisibility + ")";
        }

        public final boolean getKeyboardVisibility() {
            return this.keyboardVisibility;
        }

        public SkuKeyboardVisibilityParams(boolean z) {
            this.keyboardVisibility = z;
        }
    }

    public static final class SkuOperationParams {
        @c(a = "product_id")
        private final String productId;
        @c(a = StringSet.type)
        private final int type;

        static {
            Covode.recordClassIndex(54844);
        }

        public static int com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuOperationParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        public static /* synthetic */ SkuOperationParams copy$default(SkuOperationParams skuOperationParams, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = skuOperationParams.productId;
            }
            if ((i3 & 2) != 0) {
                i2 = skuOperationParams.type;
            }
            return skuOperationParams.copy(str, i2);
        }

        public final String component1() {
            return this.productId;
        }

        public final int component2() {
            return this.type;
        }

        public final SkuOperationParams copy(String str, int i2) {
            l.d(str, "");
            return new SkuOperationParams(str, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SkuOperationParams)) {
                return false;
            }
            SkuOperationParams skuOperationParams = (SkuOperationParams) obj;
            return l.a(this.productId, skuOperationParams.productId) && this.type == skuOperationParams.type;
        }

        public final int hashCode() {
            String str = this.productId;
            return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_ecommerce_sku_SkuPanelStarter$SkuOperationParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type);
        }

        public final String toString() {
            return "SkuOperationParams(productId=" + this.productId + ", type=" + this.type + ")";
        }

        public final String getProductId() {
            return this.productId;
        }

        public final int getType() {
            return this.type;
        }

        public SkuOperationParams(String str, int i2) {
            l.d(str, "");
            this.productId = str;
            this.type = i2;
        }
    }

    public static final class SkuRenderParams {
        @c(a = "add_to_cart_button")
        private final AddToCartButton addToCartButton;
        @c(a = "checked_sku_ids")
        private String[] checkedSkuIds;
        @c(a = "enter_from")
        private final String enterFrom;
        @c(a = "product_image")
        private final Image mainPicture;
        @c(a = "product_price")
        private final ProductPrice price;
        @c(a = "product_id")
        private final String productId;
        @c(a = "product")
        private final ProductPackStruct productInfoPack;
        @c(a = "quantity")
        private Integer productQuantity;
        @c(a = "specs")
        private final List<SaleProp> salePropList;
        @c(a = "seller_id")
        private final String sellerId;
        @c(a = "skus")
        private final List<SkuItem> skuList;

        static {
            Covode.recordClassIndex(54845);
        }

        public final AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final Image getMainPicture() {
            return this.mainPicture;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final ProductPackStruct getProductInfoPack() {
            return this.productInfoPack;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final List<SaleProp> getSalePropList() {
            return this.salePropList;
        }

        public final String getSellerId() {
            return this.sellerId;
        }

        public final List<SkuItem> getSkuList() {
            return this.skuList;
        }

        public final void setCheckedSkuIds(String[] strArr) {
            this.checkedSkuIds = strArr;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public SkuRenderParams(String str, String[] strArr, Integer num, List<SkuItem> list, List<SaleProp> list2, String str2, ProductPrice productPrice, Image image, String str3, AddToCartButton addToCartButton2, ProductPackStruct productPackStruct) {
            l.d(str, "");
            this.productId = str;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.skuList = list;
            this.salePropList = list2;
            this.enterFrom = str2;
            this.price = productPrice;
            this.mainPicture = image;
            this.sellerId = str3;
            this.addToCartButton = addToCartButton2;
            this.productInfoPack = productPackStruct;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SkuRenderParams(String str, String[] strArr, Integer num, List list, List list2, String str2, ProductPrice productPrice, Image image, String str3, AddToCartButton addToCartButton2, ProductPackStruct productPackStruct, int i2, g gVar) {
            this(str, strArr, num, list, list2, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : productPrice, (i2 & 128) == 0 ? image : null, str3, addToCartButton2, productPackStruct);
        }
    }

    private SkuPanelStarter() {
    }

    static {
        Covode.recordClassIndex(54841);
    }

    public static void a(SkuPanelState skuPanelState) {
        d<? super SkuPanelState> dVar = f87362a;
        if (dVar != null) {
            dVar.resumeWith(q.m223constructorimpl(skuPanelState));
        }
        f87362a = null;
    }

    public static IPdpStarter.PdpEnterParam a(SkuEnterParams skuEnterParams) {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        boolean z;
        Boolean pdpFullScreen;
        String productId;
        HashMap hashMap3 = new HashMap();
        if (!(skuEnterParams == null || (productId = skuEnterParams.getProductId()) == null)) {
            hashMap3.put("product_id", n.a(productId));
        }
        HashMap<String, Object> hashMap4 = null;
        if (skuEnterParams != null) {
            hashMap = skuEnterParams.getOrderRequestParams();
            hashMap2 = skuEnterParams.getVisitReportParams();
            hashMap4 = skuEnterParams.getTrackParams();
        } else {
            hashMap = null;
            hashMap2 = null;
        }
        if (skuEnterParams == null || (pdpFullScreen = skuEnterParams.getPdpFullScreen()) == null) {
            z = false;
        } else {
            z = pdpFullScreen.booleanValue();
        }
        return new IPdpStarter.PdpEnterParam(hashMap3, hashMap, hashMap4, hashMap2, z, 0.0f, null, false, false, false, null, 2016, null);
    }
}
