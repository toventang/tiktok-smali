package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.List;

public final class d {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final Integer f84331a;
    @c(a = "view_items")

    /* renamed from: b  reason: collision with root package name */
    public final List<m> f84332b;
    @c(a = "shipping_address")

    /* renamed from: c  reason: collision with root package name */
    public final Address f84333c = null;
    @c(a = "autocomplete_address_id")

    /* renamed from: d  reason: collision with root package name */
    public final String f84334d = null;

    static {
        Covode.recordClassIndex(52580);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f84331a, dVar.f84331a) && l.a(this.f84332b, dVar.f84332b) && l.a(this.f84333c, dVar.f84333c) && l.a(this.f84334d, dVar.f84334d);
    }

    public final int hashCode() {
        Integer num = this.f84331a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<m> list = this.f84332b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Address address = this.f84333c;
        int hashCode3 = (hashCode2 + (address != null ? address.hashCode() : 0)) * 31;
        String str = this.f84334d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "CandInputData(type=" + this.f84331a + ", viewItems=" + this.f84332b + ", address=" + this.f84333c + ", autocompleteAddressId=" + this.f84334d + ")";
    }

    public d(Integer num, List<m> list) {
        this.f84331a = num;
        this.f84332b = list;
    }
}
