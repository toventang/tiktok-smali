package com.ss.ugc.live.sdk.msg.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f154106a;

    /* renamed from: b  reason: collision with root package name */
    public final String f154107b;

    static {
        Covode.recordClassIndex(102792);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f154106a, bVar.f154106a) && l.a(this.f154107b, bVar.f154107b);
    }

    public final int hashCode() {
        String str = this.f154106a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f154107b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Header(key=" + this.f154106a + ", value=" + this.f154107b + ")";
    }

    public b(String str, String str2) {
        this.f154106a = str;
        this.f154107b = str2;
    }
}
