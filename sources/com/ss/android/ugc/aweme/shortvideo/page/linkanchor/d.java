package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f129596a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f129597b;

    static {
        Covode.recordClassIndex(85066);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f129596a == dVar.f129596a && l.a(this.f129597b, dVar.f129597b);
    }

    public final int hashCode() {
        int i2 = this.f129596a * 31;
        String str = this.f129597b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LinkValidateResult(statusCode=" + this.f129596a + ", statusMessage=" + this.f129597b + ")";
    }
}
