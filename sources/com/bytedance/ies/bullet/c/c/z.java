package com.bytedance.ies.bullet.c.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f32074a;

    static {
        Covode.recordClassIndex(18802);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof z) && l.a(this.f32074a, ((z) obj).f32074a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f32074a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SessionInfo(id=" + this.f32074a + ")";
    }

    public z(String str) {
        l.c(str, "");
        this.f32074a = str;
    }
}
