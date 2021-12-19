package com.ss.android.ugc.aweme.follow;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "index")

    /* renamed from: a  reason: collision with root package name */
    public final int f96201a;
    @c(a = "msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f96202b;

    static {
        Covode.recordClassIndex(60942);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96201a == aVar.f96201a && l.a(this.f96202b, aVar.f96202b);
    }

    public final int hashCode() {
        int i2 = this.f96201a * 31;
        String str = this.f96202b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LastViewData(index=" + this.f96201a + ", lastViewHint=" + this.f96202b + ")";
    }
}
