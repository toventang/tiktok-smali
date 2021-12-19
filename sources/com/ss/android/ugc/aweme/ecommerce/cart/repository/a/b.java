package com.ss.android.ugc.aweme.ecommerce.cart.repository.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "seller_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84693a;
    @c(a = "warehouse_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f84694b;
    @c(a = "product_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f84695c;
    @c(a = "sku_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f84696d;
    @c(a = "add_count")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f84697e;
    @c(a = "chain_key")

    /* renamed from: f  reason: collision with root package name */
    public final String f84698f;
    @c(a = "entrance_info")

    /* renamed from: g  reason: collision with root package name */
    public final String f84699g;
    @c(a = "source")

    /* renamed from: h  reason: collision with root package name */
    public final Integer f84700h;
    @c(a = "kol_id")

    /* renamed from: i  reason: collision with root package name */
    public final String f84701i;

    static {
        Covode.recordClassIndex(52885);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f84693a, bVar.f84693a) && l.a(this.f84694b, bVar.f84694b) && l.a(this.f84695c, bVar.f84695c) && l.a(this.f84696d, bVar.f84696d) && l.a(this.f84697e, bVar.f84697e) && l.a(this.f84698f, bVar.f84698f) && l.a(this.f84699g, bVar.f84699g) && l.a(this.f84700h, bVar.f84700h) && l.a(this.f84701i, bVar.f84701i);
    }

    public final int hashCode() {
        String str = this.f84693a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84694b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84695c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84696d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.f84697e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f84698f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f84699g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num2 = this.f84700h;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str7 = this.f84701i;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "AddItemToCartRequest(sellerId=" + this.f84693a + ", warehouseId=" + this.f84694b + ", productId=" + this.f84695c + ", skuId=" + this.f84696d + ", addCount=" + this.f84697e + ", chainKey=" + this.f84698f + ", entranceInfo=" + this.f84699g + ", source=" + this.f84700h + ", kolId=" + this.f84701i + ")";
    }

    public b(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, String str7) {
        this.f84693a = str;
        this.f84694b = str2;
        this.f84695c = str3;
        this.f84696d = str4;
        this.f84697e = num;
        this.f84698f = str5;
        this.f84699g = str6;
        this.f84700h = num2;
        this.f84701i = str7;
    }
}
