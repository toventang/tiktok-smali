package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class i {
    @c(a = "order_entrance_info_keys")

    /* renamed from: a  reason: collision with root package name */
    public List<String> f84226a;
    @c(a = "add_to_cart_entrance_info_keys")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f84227b;
    @c(a = "single_sku_order_enable")

    /* renamed from: c  reason: collision with root package name */
    public boolean f84228c;

    static {
        Covode.recordClassIndex(52525);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f84226a, iVar.f84226a) && l.a(this.f84227b, iVar.f84227b) && this.f84228c == iVar.f84228c;
    }

    public final int hashCode() {
        List<String> list = this.f84226a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f84227b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f84228c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "OrderConfig(orderEntranceInfoKeys=" + this.f84226a + ", addToCardEntranceInfoKeys=" + this.f84227b + ", singleSkuOrderEnable=" + this.f84228c + ")";
    }

    private /* synthetic */ i() {
        this(new ArrayList(), new ArrayList());
    }

    public i(List<String> list, List<String> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f84226a = list;
        this.f84227b = list2;
        this.f84228c = true;
    }
}
