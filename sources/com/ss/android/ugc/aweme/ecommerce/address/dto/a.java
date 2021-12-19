package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "shipping_address_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f84325a;

    static {
        Covode.recordClassIndex(52577);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f84325a, ((a) obj).f84325a);
        }
        return true;
    }

    public final int hashCode() {
        List<d> list = this.f84325a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AddressListData(addressList=" + this.f84325a + ")";
    }
}
