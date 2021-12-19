package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "button_text")

    /* renamed from: a  reason: collision with root package name */
    public final String f85281a;
    @com.google.gson.a.c(a = "note")

    /* renamed from: b  reason: collision with root package name */
    public final String f85282b;
    @com.google.gson.a.c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public final String f85283c;

    static {
        Covode.recordClassIndex(53374);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f85281a, cVar.f85281a) && l.a(this.f85282b, cVar.f85282b) && l.a(this.f85283c, cVar.f85283c);
    }

    public final int hashCode() {
        String str = this.f85281a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f85282b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f85283c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BindInfo(buttonText=" + this.f85281a + ", note=" + this.f85282b + ", title=" + this.f85283c + ")";
    }
}
