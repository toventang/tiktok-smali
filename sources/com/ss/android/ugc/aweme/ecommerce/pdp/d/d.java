package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Price f86449a;

    /* renamed from: b  reason: collision with root package name */
    public final String f86450b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f86451c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f86452d;

    /* renamed from: e  reason: collision with root package name */
    public final String f86453e;

    /* renamed from: f  reason: collision with root package name */
    public final String f86454f;

    /* renamed from: g  reason: collision with root package name */
    public final String f86455g;

    /* renamed from: h  reason: collision with root package name */
    public final String f86456h;

    /* renamed from: i  reason: collision with root package name */
    public final String f86457i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f86458j;

    static {
        Covode.recordClassIndex(54150);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f86449a, dVar.f86449a) && l.a(this.f86450b, dVar.f86450b) && this.f86451c == dVar.f86451c && this.f86452d == dVar.f86452d && l.a(this.f86453e, dVar.f86453e) && l.a(this.f86454f, dVar.f86454f) && l.a(this.f86455g, dVar.f86455g) && l.a(this.f86456h, dVar.f86456h) && l.a(this.f86457i, dVar.f86457i) && this.f86458j == dVar.f86458j;
    }

    public final int hashCode() {
        Price price = this.f86449a;
        int i2 = 0;
        int hashCode = (price != null ? price.hashCode() : 0) * 31;
        String str = this.f86450b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f86451c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        boolean z2 = this.f86452d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        String str2 = this.f86453e;
        int hashCode3 = (i11 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86454f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86455g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86456h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f86457i;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i12 = (hashCode6 + i2) * 31;
        if (!this.f86458j) {
            i3 = 0;
        }
        return i12 + i3;
    }

    public final String toString() {
        return "ProductDeliveryInfo(price=" + this.f86449a + ", originPrice=" + this.f86450b + ", reachable=" + this.f86451c + ", shippingDiscount=" + this.f86452d + ", deliveryStatusText=" + this.f86453e + ", discountDescText=" + this.f86454f + ", leadTimeText=" + this.f86455g + ", thresholdText=" + this.f86456h + ", thresholdTextEn=" + this.f86457i + ", freeShipping=" + this.f86458j + ")";
    }

    public d(Price price, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3) {
        this.f86449a = price;
        this.f86450b = str;
        this.f86451c = z;
        this.f86452d = z2;
        this.f86453e = str2;
        this.f86454f = str3;
        this.f86455g = str4;
        this.f86456h = str5;
        this.f86457i = str6;
        this.f86458j = z3;
    }
}
