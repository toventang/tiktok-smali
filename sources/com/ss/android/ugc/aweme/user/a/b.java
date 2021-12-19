package com.ss.android.ugc.aweme.user.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f142316a;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final a f142317b;

    static {
        Covode.recordClassIndex(93090);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f142316a, bVar.f142316a) && l.a(this.f142317b, bVar.f142317b);
    }

    public final int hashCode() {
        String str = this.f142316a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f142317b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "QueryUserPasswordSetStatusResponse(message=" + this.f142316a + ", data=" + this.f142317b + ")";
    }
}
