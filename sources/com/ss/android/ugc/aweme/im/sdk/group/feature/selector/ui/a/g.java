package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f102715a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f102716b;

    static {
        Covode.recordClassIndex(65786);
    }

    public static /* synthetic */ g a(g gVar, String str, com.bytedance.assem.arch.extensions.a aVar, int i2) {
        if ((i2 & 1) != 0) {
            str = gVar.f102715a;
        }
        if ((i2 & 2) != 0) {
            aVar = gVar.f102716b;
        }
        return a(str, aVar);
    }

    private static g a(String str, com.bytedance.assem.arch.extensions.a<Boolean> aVar) {
        l.d(aVar, "");
        return new g(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f102715a, gVar.f102715a) && l.a(this.f102716b, gVar.f102716b);
    }

    public final int hashCode() {
        String str = this.f102715a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar = this.f102716b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchBarData(keyword=" + this.f102715a + ", clearEvent=" + this.f102716b + ")";
    }

    public g(String str, com.bytedance.assem.arch.extensions.a<Boolean> aVar) {
        l.d(aVar, "");
        this.f102715a = str;
        this.f102716b = aVar;
    }
}
