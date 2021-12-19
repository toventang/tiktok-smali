package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "error_code")

    /* renamed from: a  reason: collision with root package name */
    public final String f85310a;
    @c(a = "error_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f85311b;
    @c(a = "error_text")

    /* renamed from: c  reason: collision with root package name */
    public final String f85312c = null;

    static {
        Covode.recordClassIndex(53380);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f85310a, hVar.f85310a) && l.a(this.f85311b, hVar.f85311b) && l.a(this.f85312c, hVar.f85312c);
    }

    public final int hashCode() {
        String str = this.f85310a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85311b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85312c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PayErrorToast(errorCode=" + this.f85310a + ", errorMsg=" + this.f85311b + ", errorText=" + this.f85312c + ")";
    }

    public h(String str, String str2) {
        l.d(str2, "");
        this.f85310a = str;
        this.f85311b = str2;
    }
}
