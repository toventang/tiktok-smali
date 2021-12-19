package com.ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "data")

    /* renamed from: a  reason: collision with root package name */
    public final c f65135a;
    @c(a = "message")

    /* renamed from: b  reason: collision with root package name */
    public final String f65136b;

    static {
        Covode.recordClassIndex(40041);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f65135a, bVar.f65135a) && l.a(this.f65136b, bVar.f65136b);
    }

    public final int hashCode() {
        c cVar = this.f65135a;
        int i2 = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        String str = this.f65136b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BoolData(data=" + this.f65135a + ", message=" + this.f65136b + ")";
    }
}
