package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import h.f.b.l;

public final class e {
    @c(a = "product_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84951a;
    @c(a = "sku_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f84952b;
    @c(a = "quantity")

    /* renamed from: c  reason: collision with root package name */
    public final int f84953c;
    @c(a = "sku_price")

    /* renamed from: d  reason: collision with root package name */
    public final SkuPrice f84954d;
    @c(a = "chain_key")

    /* renamed from: e  reason: collision with root package name */
    public final String f84955e;
    @c(a = "entrance_info")

    /* renamed from: f  reason: collision with root package name */
    public final String f84956f;
    @c(a = "cart_item_id")

    /* renamed from: g  reason: collision with root package name */
    public final String f84957g;
    @c(a = "source")

    /* renamed from: h  reason: collision with root package name */
    public final Integer f84958h;
    @c(a = "source_info")

    /* renamed from: i  reason: collision with root package name */
    public final String f84959i;
    @c(a = "kol_id")

    /* renamed from: j  reason: collision with root package name */
    public String f84960j;

    static {
        Covode.recordClassIndex(53124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f84951a, eVar.f84951a) && l.a(this.f84952b, eVar.f84952b) && this.f84953c == eVar.f84953c && l.a(this.f84954d, eVar.f84954d) && l.a(this.f84955e, eVar.f84955e) && l.a(this.f84956f, eVar.f84956f) && l.a(this.f84957g, eVar.f84957g) && l.a(this.f84958h, eVar.f84958h) && l.a(this.f84959i, eVar.f84959i) && l.a(this.f84960j, eVar.f84960j);
    }

    public final int hashCode() {
        String str = this.f84951a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84952b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f84953c) * 31;
        SkuPrice skuPrice = this.f84954d;
        int hashCode3 = (hashCode2 + (skuPrice != null ? skuPrice.hashCode() : 0)) * 31;
        String str3 = this.f84955e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84956f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f84957g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f84958h;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str6 = this.f84959i;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f84960j;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "CreateOrderSku(productId=" + this.f84951a + ", skuId=" + this.f84952b + ", quantity=" + this.f84953c + ", skuPrice=" + this.f84954d + ", chainKey=" + this.f84955e + ", entranceInfo=" + this.f84956f + ", cartItemId=" + this.f84957g + ", source=" + this.f84958h + ", sourceInfo=" + this.f84959i + ", kolId=" + this.f84960j + ")";
    }

    public e(String str, String str2, int i2, SkuPrice skuPrice, String str3, String str4, String str5, Integer num, String str6, String str7) {
        l.d(str, "");
        l.d(str2, "");
        l.d(skuPrice, "");
        this.f84951a = str;
        this.f84952b = str2;
        this.f84953c = i2;
        this.f84954d = skuPrice;
        this.f84955e = str3;
        this.f84956f = str4;
        this.f84957g = str5;
        this.f84958h = num;
        this.f84959i = str6;
        this.f84960j = str7;
    }
}
