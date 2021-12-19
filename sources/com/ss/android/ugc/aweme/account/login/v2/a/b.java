package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "result")

    /* renamed from: a  reason: collision with root package name */
    public final String f64227a = null;
    @c(a = "verify_ticket")

    /* renamed from: b  reason: collision with root package name */
    public final String f64228b = null;
    @c(a = "description")

    /* renamed from: c  reason: collision with root package name */
    public final String f64229c = null;
    @c(a = "error_code")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f64230d = null;

    static {
        Covode.recordClassIndex(39571);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f64227a, bVar.f64227a) && l.a(this.f64228b, bVar.f64228b) && l.a(this.f64229c, bVar.f64229c) && l.a(this.f64230d, bVar.f64230d);
    }

    public final int hashCode() {
        String str = this.f64227a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64228b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64229c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f64230d;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "Check2SvPushClickResponse(result=" + this.f64227a + ", verify_ticket=" + this.f64228b + ", description=" + this.f64229c + ", error_code=" + this.f64230d + ")";
    }

    private b() {
    }
}
