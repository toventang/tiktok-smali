package com.bytedance.lynx.hybrid.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f40859a;

    static {
        Covode.recordClassIndex(25056);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof n) && l.a(this.f40859a, ((n) obj).f40859a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f40859a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SessionInfo(id=" + this.f40859a + ")";
    }

    public n(String str) {
        l.c(str, "");
        this.f40859a = str;
    }
}
