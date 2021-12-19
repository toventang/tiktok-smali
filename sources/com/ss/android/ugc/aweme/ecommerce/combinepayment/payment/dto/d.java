package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "max_length")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f85284a = null;
    @c(a = "input_type")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f85285b = null;
    @c(a = "line_break")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f85286c = false;
    @c(a = "prefix")

    /* renamed from: d  reason: collision with root package name */
    public final String f85287d = null;

    static {
        Covode.recordClassIndex(53375);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f85284a, dVar.f85284a) && l.a(this.f85285b, dVar.f85285b) && this.f85286c == dVar.f85286c && l.a(this.f85287d, dVar.f85287d);
    }

    public final int hashCode() {
        Integer num = this.f85284a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f85285b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.f85286c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str = this.f85287d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "Configuration(maxLength=" + this.f85284a + ", inputType=" + this.f85285b + ", lineBreak=" + this.f85286c + ", prefix=" + this.f85287d + ")";
    }

    private d() {
    }
}
