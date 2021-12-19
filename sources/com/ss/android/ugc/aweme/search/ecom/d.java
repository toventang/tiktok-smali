package com.ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;
import h.z;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.a<z> f121061a;

    static {
        Covode.recordClassIndex(78869);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f121061a, ((d) obj).f121061a);
        }
        return true;
    }

    public final int hashCode() {
        h.f.a.a<z> aVar = this.f121061a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProductSeeAllItem(clickListener=" + this.f121061a + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public d(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f121061a = aVar;
    }
}
