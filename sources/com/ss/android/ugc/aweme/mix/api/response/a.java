package com.ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f109793a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f109794b;
    @c(a = "is_valid")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f109795c;
    @c(a = "invalid_reason")

    /* renamed from: d  reason: collision with root package name */
    public final String f109796d;

    static {
        Covode.recordClassIndex(70314);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f109793a == aVar.f109793a && l.a(this.f109794b, aVar.f109794b) && this.f109795c == aVar.f109795c && l.a(this.f109796d, aVar.f109796d);
    }

    public final int hashCode() {
        int i2 = this.f109793a * 31;
        String str = this.f109794b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f109795c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        String str2 = this.f109796d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "CheckPlayResponse(statusCode=" + this.f109793a + ", statusMsg=" + this.f109794b + ", isValid=" + this.f109795c + ", invalidReason=" + this.f109796d + ")";
    }
}
