package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class h {
    @c(a = "uid")

    /* renamed from: a  reason: collision with root package name */
    public final Long f119152a;
    @c(a = "user_blocked_results")

    /* renamed from: b  reason: collision with root package name */
    public final List<i> f119153b;

    static {
        Covode.recordClassIndex(77373);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f119152a, hVar.f119152a) && l.a(this.f119153b, hVar.f119153b);
    }

    public final int hashCode() {
        Long l2 = this.f119152a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        List<i> list = this.f119153b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserBlockData(uid=" + this.f119152a + ", userBlockedResults=" + this.f119153b + ")";
    }
}
