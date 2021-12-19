package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class v {
    @c(a = "voucher_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f85012a;
    @c(a = "voucher_type_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f85013b;

    static {
        Covode.recordClassIndex(53141);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.f85012a, vVar.f85012a) && l.a(this.f85013b, vVar.f85013b);
    }

    public final int hashCode() {
        String str = this.f85012a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85013b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Voucher(voucherId=" + this.f85012a + ", voucherTypeId=" + this.f85013b + ")";
    }

    public v(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f85012a = str;
        this.f85013b = str2;
    }
}
