package com.ss.android.ugc.aweme.comment.page.tag.a;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f72178a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f72179b;

    static {
        Covode.recordClassIndex(44437);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f72178a, cVar.f72178a) && l.a(this.f72179b, cVar.f72179b);
    }

    public final int hashCode() {
        String str = this.f72178a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar = this.f72179b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchBarData(keyword=" + this.f72178a + ", clearEvent=" + this.f72179b + ")";
    }

    public c(String str, com.bytedance.assem.arch.extensions.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f72178a = str;
        this.f72179b = aVar;
    }

    public static /* synthetic */ c a(c cVar, String str, com.bytedance.assem.arch.extensions.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            str = cVar.f72178a;
        }
        if ((i2 & 2) != 0) {
            aVar = cVar.f72179b;
        }
        l.d(aVar, "");
        return new c(str, aVar);
    }
}
