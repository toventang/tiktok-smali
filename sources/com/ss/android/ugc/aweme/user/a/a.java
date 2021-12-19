package com.ss.android.ugc.aweme.user.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "has_set")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f142313a;
    @c(a = "description")

    /* renamed from: b  reason: collision with root package name */
    public final String f142314b;
    @c(a = "error_code")

    /* renamed from: c  reason: collision with root package name */
    public int f142315c;

    static {
        Covode.recordClassIndex(93089);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f142313a, aVar.f142313a) && l.a(this.f142314b, aVar.f142314b) && this.f142315c == aVar.f142315c;
    }

    public final int hashCode() {
        Boolean bool = this.f142313a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f142314b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f142315c;
    }

    public final String toString() {
        return "QueryUserPasswordSetStatusData(hasSet=" + this.f142313a + ", description=" + this.f142314b + ", errorCode=" + this.f142315c + ")";
    }
}
