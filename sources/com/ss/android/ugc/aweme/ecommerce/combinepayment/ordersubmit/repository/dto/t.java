package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class t {
    @c(a = "reason_show_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f85005a = 0;
    @c(a = "select_reasons")

    /* renamed from: b  reason: collision with root package name */
    public final List<q> f85006b;
    @c(a = "input_reasons")

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f85007c;

    static {
        Covode.recordClassIndex(53139);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f85005a == tVar.f85005a && l.a(this.f85006b, tVar.f85006b) && l.a(this.f85007c, tVar.f85007c);
    }

    public final int hashCode() {
        int i2 = this.f85005a * 31;
        List<q> list = this.f85006b;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        List<g> list2 = this.f85007c;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "SubmitQuitReason(reasonShowType=" + this.f85005a + ", selectReasons=" + this.f85006b + ", inputReasons=" + this.f85007c + ")";
    }

    public t(List<q> list, List<g> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f85006b = list;
        this.f85007c = list2;
    }
}
