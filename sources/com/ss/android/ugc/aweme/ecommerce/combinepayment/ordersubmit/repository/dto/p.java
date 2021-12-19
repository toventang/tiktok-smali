package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class p {
    @c(a = "reason_type")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f84995a;
    @c(a = "reason_key")

    /* renamed from: b  reason: collision with root package name */
    public final String f84996b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public final String f84997c;
    @c(a = "description")

    /* renamed from: d  reason: collision with root package name */
    public final String f84998d;
    @c(a = "description_limit")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f84999e;

    static {
        Covode.recordClassIndex(53135);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l.a(this.f84995a, pVar.f84995a) && l.a(this.f84996b, pVar.f84996b) && l.a(this.f84997c, pVar.f84997c) && l.a(this.f84998d, pVar.f84998d) && l.a(this.f84999e, pVar.f84999e);
    }

    public final int hashCode() {
        Integer num = this.f84995a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f84996b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84997c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84998d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.f84999e;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Reason(reasonType=" + this.f84995a + ", reasonKey=" + this.f84996b + ", title=" + this.f84997c + ", description=" + this.f84998d + ", descriptionLimit=" + this.f84999e + ")";
    }

    private /* synthetic */ p() {
        this(1, 200);
    }

    private p(Integer num, Integer num2) {
        this.f84995a = num;
        this.f84996b = null;
        this.f84997c = null;
        this.f84998d = null;
        this.f84999e = num2;
    }
}
