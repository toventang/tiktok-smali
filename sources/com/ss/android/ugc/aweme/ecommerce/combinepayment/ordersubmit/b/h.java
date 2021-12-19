package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f84837a;

    /* renamed from: b  reason: collision with root package name */
    public final int f84838b;

    /* renamed from: c  reason: collision with root package name */
    public final Image f84839c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84840d;

    /* renamed from: e  reason: collision with root package name */
    public final String f84841e;

    /* renamed from: f  reason: collision with root package name */
    public final String f84842f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f84843g;

    /* renamed from: h  reason: collision with root package name */
    public final String f84844h;

    /* renamed from: i  reason: collision with root package name */
    public final PickTag f84845i;

    /* renamed from: j  reason: collision with root package name */
    public final List<PromotionLogo> f84846j;

    /* renamed from: k  reason: collision with root package name */
    public final PromotionView f84847k;

    static {
        Covode.recordClassIndex(53003);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f84837a, hVar.f84837a) && this.f84838b == hVar.f84838b && l.a(this.f84839c, hVar.f84839c) && l.a(this.f84840d, hVar.f84840d) && l.a(this.f84841e, hVar.f84841e) && l.a(this.f84842f, hVar.f84842f) && l.a(this.f84843g, hVar.f84843g) && l.a(this.f84844h, hVar.f84844h) && l.a(this.f84845i, hVar.f84845i) && l.a(this.f84846j, hVar.f84846j) && l.a(this.f84847k, hVar.f84847k);
    }

    public final int hashCode() {
        String str = this.f84837a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f84838b) * 31;
        Image image = this.f84839c;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f84840d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84841e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84842f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f84843g;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f84844h;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        PickTag pickTag = this.f84845i;
        int hashCode8 = (hashCode7 + (pickTag != null ? pickTag.hashCode() : 0)) * 31;
        List<PromotionLogo> list = this.f84846j;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        PromotionView promotionView = this.f84847k;
        if (promotionView != null) {
            i2 = promotionView.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "SkuInfoVO(skuId=" + this.f84837a + ", quantity=" + this.f84838b + ", productImg=" + this.f84839c + ", productTitle=" + this.f84840d + ", productSpec=" + this.f84841e + ", price=" + this.f84842f + ", maxQuantity=" + this.f84843g + ", lowStockWarning=" + this.f84844h + ", activityInfo=" + this.f84845i + ", promotionLogos=" + this.f84846j + ", promotionView=" + this.f84847k + ")";
    }

    public h(String str, int i2, Image image, String str2, String str3, String str4, Integer num, String str5, PickTag pickTag, List<PromotionLogo> list, PromotionView promotionView) {
        this.f84837a = str;
        this.f84838b = i2;
        this.f84839c = image;
        this.f84840d = str2;
        this.f84841e = str3;
        this.f84842f = str4;
        this.f84843g = num;
        this.f84844h = str5;
        this.f84845i = pickTag;
        this.f84846j = list;
        this.f84847k = promotionView;
    }
}
