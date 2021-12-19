package com.ss.android.ugc.aweme.compliance.protection.common.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "user_identity")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f77946a;
    @c(a = "restriction")

    /* renamed from: b  reason: collision with root package name */
    public final c f77947b;

    static {
        Covode.recordClassIndex(48318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f77946a, bVar.f77946a) && l.a(this.f77947b, bVar.f77947b);
    }

    public final int hashCode() {
        Integer num = this.f77946a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        c cVar = this.f77947b;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FamilyPairingBean(userIdentity=" + this.f77946a + ", restriction=" + this.f77947b + ")";
    }

    public /* synthetic */ b() {
        this(1, new c());
    }

    public b(Integer num, c cVar) {
        this.f77946a = num;
        this.f77947b = cVar;
    }
}
