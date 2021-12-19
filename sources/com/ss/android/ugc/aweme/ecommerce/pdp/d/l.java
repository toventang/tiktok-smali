package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification;
import java.util.List;

public final class l implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List<Specification> f86476a;

    static {
        Covode.recordClassIndex(54159);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.d.h
    public final String a() {
        return "specifications";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof l) && h.f.b.l.a(this.f86476a, ((l) obj).f86476a);
        }
        return true;
    }

    public final int hashCode() {
        List<Specification> list = this.f86476a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectSpecificationVO(specification=" + this.f86476a + ")";
    }

    public l(List<Specification> list) {
        h.f.b.l.d(list, "");
        this.f86476a = list;
    }
}
