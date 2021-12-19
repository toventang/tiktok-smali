package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "redirect_url")

    /* renamed from: a  reason: collision with root package name */
    public final String f85301a;
    @c(a = "pay_result")

    /* renamed from: b  reason: collision with root package name */
    public final k f85302b;
    @c(a = "pay_error_toast")

    /* renamed from: c  reason: collision with root package name */
    public final h f85303c;
    @c(a = "package_name")

    /* renamed from: d  reason: collision with root package name */
    public final String f85304d = null;

    static {
        Covode.recordClassIndex(53378);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f85301a, fVar.f85301a) && l.a(this.f85302b, fVar.f85302b) && l.a(this.f85303c, fVar.f85303c) && l.a(this.f85304d, fVar.f85304d);
    }

    public final int hashCode() {
        String str = this.f85301a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        k kVar = this.f85302b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        h hVar = this.f85303c;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        String str2 = this.f85304d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "NewPayInfo(redirectUrl=" + this.f85301a + ", payResult=" + this.f85302b + ", payErrorToast=" + this.f85303c + ", packageName=" + this.f85304d + ")";
    }

    public f(String str, k kVar, h hVar) {
        this.f85301a = str;
        this.f85302b = kVar;
        this.f85303c = hVar;
    }
}
