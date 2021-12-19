package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class v {
    @c(a = "interest_list")

    /* renamed from: a  reason: collision with root package name */
    public final List<w> f105207a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f105208b;

    static {
        Covode.recordClassIndex(67443);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.f105207a, vVar.f105207a) && this.f105208b == vVar.f105208b;
    }

    public final int hashCode() {
        List<w> list = this.f105207a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f105208b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "NewUserInterestPageStruct(interest_list=" + this.f105207a + ", isDefault=" + this.f105208b + ")";
    }
}
