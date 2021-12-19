package com.ss.android.ugc.aweme.search.ecom;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.search.ecom.a.a f121058a;

    /* renamed from: b  reason: collision with root package name */
    public final a f121059b;

    /* renamed from: c  reason: collision with root package name */
    public final e f121060c;

    static {
        Covode.recordClassIndex(78868);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final Object c(a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f121058a, cVar.f121058a) && l.a(this.f121059b, cVar.f121059b) && l.a(this.f121060c, cVar.f121060c);
    }

    public final int hashCode() {
        com.ss.android.ugc.aweme.search.ecom.a.a aVar = this.f121058a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a aVar2 = this.f121059b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        e eVar = this.f121060c;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ProductItem(product=" + this.f121058a + ", clickListener=" + this.f121059b + ", showListener=" + this.f121060c + ")";
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean a(a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.b.a
    public final boolean b(a aVar) {
        return aVar.equals(this);
    }

    public c(com.ss.android.ugc.aweme.search.ecom.a.a aVar, a aVar2, e eVar) {
        l.d(aVar, "");
        this.f121058a = aVar;
        this.f121059b = aVar2;
        this.f121060c = eVar;
    }
}
