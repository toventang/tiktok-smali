package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class z implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f114485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114486b;

    static {
        Covode.recordClassIndex(73677);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return l.a(this.f114485a, zVar.f114485a) && l.a(this.f114486b, zVar.f114486b);
    }

    public final int hashCode() {
        String str = this.f114485a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f114486b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UnBlockUser(uid=" + this.f114485a + ", secId=" + this.f114486b + ")";
    }

    public z(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f114485a = str;
        this.f114486b = str2;
    }
}
