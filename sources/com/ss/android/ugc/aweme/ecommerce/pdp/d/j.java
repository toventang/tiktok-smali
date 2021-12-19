package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    public final d f86474a;

    static {
        Covode.recordClassIndex(54157);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.d.h
    public final String a() {
        return "logistics";
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f86474a, ((j) obj).f86474a);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.f86474a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSelectShippingVO(deliveryInfo=" + this.f86474a + ")";
    }

    public j(d dVar) {
        this.f86474a = dVar;
    }
}
