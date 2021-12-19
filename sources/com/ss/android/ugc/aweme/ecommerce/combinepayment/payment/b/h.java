package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.f.b.l;

public final class h {

    /* renamed from: a */
    public final o f85254a;

    /* renamed from: b */
    public boolean f85255b;

    /* renamed from: c */
    public int f85256c;

    static {
        Covode.recordClassIndex(53360);
    }

    public static h a(o oVar, boolean z, int i2) {
        l.d(oVar, "");
        return new h(oVar, z, i2);
    }

    public final int hashCode() {
        o oVar = this.f85254a;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        boolean z = this.f85255b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return ((hashCode + i2) * 31) + this.f85256c;
    }

    public final String toString() {
        return "PaymentMethodVO(paymentMethod=" + this.f85254a + ", need_verify=" + this.f85255b + ", rank=" + this.f85256c + ")";
    }

    public /* synthetic */ h(o oVar) {
        this(oVar, false, 0);
    }

    public final boolean equals(Object obj) {
        if (System.identityHashCode(this) == System.identityHashCode(obj)) {
            return true;
        }
        return false;
    }

    private h(o oVar, boolean z, int i2) {
        l.d(oVar, "");
        this.f85254a = oVar;
        this.f85255b = z;
        this.f85256c = i2;
    }
}
