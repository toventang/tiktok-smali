package com.ss.android.ugc.aweme.userservice.jedi.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f142463a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142464b;

    static {
        Covode.recordClassIndex(93174);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f142463a, dVar.f142463a) && l.a(this.f142464b, dVar.f142464b);
    }

    public final int hashCode() {
        String str = this.f142463a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142464b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RemoveFollowerReqParams(uid=" + this.f142463a + ", secUserId=" + this.f142464b + ")";
    }

    public d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f142463a = str;
        this.f142464b = str2;
    }
}
