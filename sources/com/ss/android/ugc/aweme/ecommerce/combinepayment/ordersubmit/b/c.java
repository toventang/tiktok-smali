package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final o f84817a;

    /* renamed from: b  reason: collision with root package name */
    public final List<o> f84818b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f84819c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84820d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f84821e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f84822f;

    static {
        Covode.recordClassIndex(52998);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f84817a, cVar.f84817a) && l.a(this.f84818b, cVar.f84818b) && l.a(this.f84819c, cVar.f84819c) && l.a(this.f84820d, cVar.f84820d) && this.f84821e == cVar.f84821e && this.f84822f == cVar.f84822f;
    }

    public final int hashCode() {
        o oVar = this.f84817a;
        int i2 = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        List<o> list = this.f84818b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f84819c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f84820d;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f84821e;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f84822f) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "PaymentInfoVO(recommendedPayment=" + this.f84817a + ", paymentMethodList=" + this.f84818b + ", methodsPhotos=" + this.f84819c + ", paymentMethodText=" + this.f84820d + ", hasStoredMethod=" + this.f84821e + ", reachable=" + this.f84822f + ")";
    }

    public c(o oVar, List<o> list, List<String> list2, String str, boolean z, boolean z2) {
        this.f84817a = oVar;
        this.f84818b = list;
        this.f84819c = list2;
        this.f84820d = str;
        this.f84821e = z;
        this.f84822f = z2;
    }
}
