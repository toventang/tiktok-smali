package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class o {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f84992a;
    @c(a = "submit_text")

    /* renamed from: b  reason: collision with root package name */
    public final String f84993b;
    @c(a = "reasons")

    /* renamed from: c  reason: collision with root package name */
    public final List<p> f84994c;

    static {
        Covode.recordClassIndex(53134);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f84992a, oVar.f84992a) && l.a(this.f84993b, oVar.f84993b) && l.a(this.f84994c, oVar.f84994c);
    }

    public final int hashCode() {
        String str = this.f84992a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84993b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<p> list = this.f84994c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "QuitReasonData(title=" + this.f84992a + ", submitText=" + this.f84993b + ", reasons=" + this.f84994c + ")";
    }
}
