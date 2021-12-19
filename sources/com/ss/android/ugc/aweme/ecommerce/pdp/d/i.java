package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ShopPolicy;
import h.f.b.l;
import java.util.List;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List<ShopPolicy> f86473a;

    static {
        Covode.recordClassIndex(54156);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.d.h
    public final String a() {
        return "retailer_policies";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && l.a(this.f86473a, ((i) obj).f86473a);
        }
        return true;
    }

    public final int hashCode() {
        List<ShopPolicy> list = this.f86473a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectServicesVO(shopPolicy=" + this.f86473a + ")";
    }

    public i(List<ShopPolicy> list) {
        l.d(list, "");
        this.f86473a = list;
    }
}
