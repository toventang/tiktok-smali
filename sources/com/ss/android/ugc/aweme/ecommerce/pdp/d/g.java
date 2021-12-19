package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f86460a;

    /* renamed from: b  reason: collision with root package name */
    public final String f86461b;

    /* renamed from: c  reason: collision with root package name */
    public final String f86462c;

    /* renamed from: d  reason: collision with root package name */
    public final String f86463d;

    /* renamed from: e  reason: collision with root package name */
    public final String f86464e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f86465f;

    /* renamed from: g  reason: collision with root package name */
    public final WaistBanner f86466g;

    /* renamed from: h  reason: collision with root package name */
    public final VoucherInfo f86467h;

    /* renamed from: i  reason: collision with root package name */
    public final ProductDetailReview f86468i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f86469j;

    /* renamed from: k  reason: collision with root package name */
    public final FlashSale f86470k;

    /* renamed from: l  reason: collision with root package name */
    public final PickTag f86471l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f86472m;
    public final List<PromotionLogo> n;
    public final PromotionView o;
    public final HalfWaistBanner p;

    static {
        Covode.recordClassIndex(54154);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f86460a, gVar.f86460a) && l.a(this.f86461b, gVar.f86461b) && l.a(this.f86462c, gVar.f86462c) && l.a(this.f86463d, gVar.f86463d) && l.a(this.f86464e, gVar.f86464e) && this.f86465f == gVar.f86465f && l.a(this.f86466g, gVar.f86466g) && l.a(this.f86467h, gVar.f86467h) && l.a(this.f86468i, gVar.f86468i) && this.f86469j == gVar.f86469j && l.a(this.f86470k, gVar.f86470k) && l.a(this.f86471l, gVar.f86471l) && this.f86472m == gVar.f86472m && l.a(this.n, gVar.n) && l.a(this.o, gVar.o) && l.a(this.p, gVar.p);
    }

    public final int hashCode() {
        String str = this.f86460a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86461b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86462c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86463d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86464e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f86465f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode5 + i4) * 31;
        WaistBanner waistBanner = this.f86466g;
        int hashCode6 = (i7 + (waistBanner != null ? waistBanner.hashCode() : 0)) * 31;
        VoucherInfo voucherInfo = this.f86467h;
        int hashCode7 = (hashCode6 + (voucherInfo != null ? voucherInfo.hashCode() : 0)) * 31;
        ProductDetailReview productDetailReview = this.f86468i;
        int hashCode8 = (hashCode7 + (productDetailReview != null ? productDetailReview.hashCode() : 0)) * 31;
        boolean z2 = this.f86469j;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (hashCode8 + i8) * 31;
        FlashSale flashSale = this.f86470k;
        int hashCode9 = (i11 + (flashSale != null ? flashSale.hashCode() : 0)) * 31;
        PickTag pickTag = this.f86471l;
        int hashCode10 = (hashCode9 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        if (!this.f86472m) {
            i3 = 0;
        }
        int i12 = (hashCode10 + i3) * 31;
        List<PromotionLogo> list = this.n;
        int hashCode11 = (i12 + (list != null ? list.hashCode() : 0)) * 31;
        PromotionView promotionView = this.o;
        int hashCode12 = (hashCode11 + (promotionView != null ? promotionView.hashCode() : 0)) * 31;
        HalfWaistBanner halfWaistBanner = this.p;
        if (halfWaistBanner != null) {
            i2 = halfWaistBanner.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "ProductInfoVO(title=" + this.f86460a + ", realPrice=" + this.f86461b + ", originPrice=" + this.f86462c + ", sales=" + this.f86463d + ", discount=" + this.f86464e + ", needIcon=" + this.f86465f + ", waistBanner=" + this.f86466g + ", voucherInfo=" + this.f86467h + ", review=" + this.f86468i + ", freeShipping=" + this.f86469j + ", flashSale=" + this.f86470k + ", activityInfo=" + this.f86471l + ", isIntervalPrice=" + this.f86472m + ", promotionLogos=" + this.n + ", promotionView=" + this.o + ", halfWaistBanner=" + this.p + ")";
    }

    public g(String str, String str2, String str3, String str4, String str5, boolean z, WaistBanner waistBanner, VoucherInfo voucherInfo, ProductDetailReview productDetailReview, boolean z2, FlashSale flashSale, PickTag pickTag, boolean z3, List<PromotionLogo> list, PromotionView promotionView, HalfWaistBanner halfWaistBanner) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str5, "");
        this.f86460a = str;
        this.f86461b = str2;
        this.f86462c = str3;
        this.f86463d = str4;
        this.f86464e = str5;
        this.f86465f = z;
        this.f86466g = waistBanner;
        this.f86467h = voucherInfo;
        this.f86468i = productDetailReview;
        this.f86469j = z2;
        this.f86470k = flashSale;
        this.f86471l = pickTag;
        this.f86472m = z3;
        this.n = list;
        this.o = promotionView;
        this.p = halfWaistBanner;
    }
}
