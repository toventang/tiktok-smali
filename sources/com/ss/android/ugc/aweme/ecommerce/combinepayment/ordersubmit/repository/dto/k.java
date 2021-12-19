package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class k {
    @c(a = "order_sku")

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f84971a;
    @c(a = "seller_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f84972b;
    @c(a = "warehouse_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f84973c;
    @c(a = "delivery_option")

    /* renamed from: d  reason: collision with root package name */
    public final int f84974d;
    @c(a = "logistics_service_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f84975e;
    @c(a = "user_note")

    /* renamed from: f  reason: collision with root package name */
    public final String f84976f;

    static {
        Covode.recordClassIndex(53130);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f84971a, kVar.f84971a) && l.a(this.f84972b, kVar.f84972b) && l.a(this.f84973c, kVar.f84973c) && this.f84974d == kVar.f84974d && l.a(this.f84975e, kVar.f84975e) && l.a(this.f84976f, kVar.f84976f);
    }

    public final int hashCode() {
        List<e> list = this.f84971a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f84972b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84973c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f84974d) * 31;
        String str3 = this.f84975e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84976f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "OrderShopRequestParam(createOrderSku=" + this.f84971a + ", sellerId=" + this.f84972b + ", warehouseId=" + this.f84973c + ", deliveryOption=" + this.f84974d + ", logisticsServiceId=" + this.f84975e + ", userNote=" + this.f84976f + ")";
    }

    public k(List<e> list, String str, String str2, int i2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f84971a = list;
        this.f84972b = str;
        this.f84973c = str2;
        this.f84974d = i2;
        this.f84975e = str3;
        this.f84976f = str4;
    }
}
