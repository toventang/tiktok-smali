package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopBill;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import h.f.b.l;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f84825a;

    /* renamed from: b  reason: collision with root package name */
    public final String f84826b;

    /* renamed from: c  reason: collision with root package name */
    public final Image f84827c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84828d;

    /* renamed from: e  reason: collision with root package name */
    public final List<h> f84829e;

    /* renamed from: f  reason: collision with root package name */
    public final List<LogisticDTO> f84830f;

    /* renamed from: g  reason: collision with root package name */
    public final LogisticDTO f84831g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f84832h;

    /* renamed from: i  reason: collision with root package name */
    public final String f84833i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f84834j;

    /* renamed from: k  reason: collision with root package name */
    public final List<Voucher> f84835k;

    /* renamed from: l  reason: collision with root package name */
    public final ShopBill f84836l;

    static {
        Covode.recordClassIndex(53001);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f84825a, fVar.f84825a) && l.a(this.f84826b, fVar.f84826b) && l.a(this.f84827c, fVar.f84827c) && l.a(this.f84828d, fVar.f84828d) && l.a(this.f84829e, fVar.f84829e) && l.a(this.f84830f, fVar.f84830f) && l.a(this.f84831g, fVar.f84831g) && this.f84832h == fVar.f84832h && l.a(this.f84833i, fVar.f84833i) && this.f84834j == fVar.f84834j && l.a(this.f84835k, fVar.f84835k) && l.a(this.f84836l, fVar.f84836l);
    }

    public final int hashCode() {
        String str = this.f84825a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84826b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Image image = this.f84827c;
        int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 31;
        String str3 = this.f84828d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<h> list = this.f84829e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<LogisticDTO> list2 = this.f84830f;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        LogisticDTO logisticDTO = this.f84831g;
        int hashCode7 = (hashCode6 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        boolean z = this.f84832h;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode7 + i4) * 31;
        String str4 = this.f84833i;
        int hashCode8 = (i7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        if (!this.f84834j) {
            i3 = 0;
        }
        int i8 = (hashCode8 + i3) * 31;
        List<Voucher> list3 = this.f84835k;
        int hashCode9 = (i8 + (list3 != null ? list3.hashCode() : 0)) * 31;
        ShopBill shopBill = this.f84836l;
        if (shopBill != null) {
            i2 = shopBill.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "ProductInfoVO(sellerId=" + this.f84825a + ", warehouseId=" + this.f84826b + ", shopAvatar=" + this.f84827c + ", shopName=" + this.f84828d + ", skuInfos=" + this.f84829e + ", logistics=" + this.f84830f + ", selectedLogistic=" + this.f84831g + ", reachable=" + this.f84832h + ", unreachableReason=" + this.f84833i + ", hasAddress=" + this.f84834j + ", vouchers=" + this.f84835k + ", shopBill=" + this.f84836l + ")";
    }

    public f(String str, String str2, Image image, String str3, List<h> list, List<LogisticDTO> list2, LogisticDTO logisticDTO, boolean z, String str4, boolean z2, List<Voucher> list3, ShopBill shopBill) {
        l.d(list, "");
        this.f84825a = str;
        this.f84826b = str2;
        this.f84827c = image;
        this.f84828d = str3;
        this.f84829e = list;
        this.f84830f = list2;
        this.f84831g = logisticDTO;
        this.f84832h = z;
        this.f84833i = str4;
        this.f84834j = z2;
        this.f84835k = list3;
        this.f84836l = shopBill;
    }
}
