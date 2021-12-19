package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class u {
    @c(a = "reason_show_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f85008a;
    @c(a = "select_reasons")

    /* renamed from: b  reason: collision with root package name */
    public final List<q> f85009b;
    @c(a = "input_reasons")

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f85010c;
    @c(a = "extra")

    /* renamed from: d  reason: collision with root package name */
    public final String f85011d;

    static {
        Covode.recordClassIndex(53140);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f85008a == uVar.f85008a && l.a(this.f85009b, uVar.f85009b) && l.a(this.f85010c, uVar.f85010c) && l.a(this.f85011d, uVar.f85011d);
    }

    public final int hashCode() {
        int i2 = this.f85008a * 31;
        List<q> list = this.f85009b;
        int i3 = 0;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        List<g> list2 = this.f85010c;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f85011d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "SubmitQuitReasonRequest(reasonShowType=" + this.f85008a + ", selectReasons=" + this.f85009b + ", inputReasons=" + this.f85010c + ", extraInfo=" + this.f85011d + ")";
    }

    public u(int i2, List<q> list, List<g> list2, String str) {
        l.d(list, "");
        l.d(list2, "");
        this.f85008a = i2;
        this.f85009b = list;
        this.f85010c = list2;
        this.f85011d = str;
    }
}
