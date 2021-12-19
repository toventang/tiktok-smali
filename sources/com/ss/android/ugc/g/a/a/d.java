package com.ss.android.ugc.g.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f145589a;

    /* renamed from: b  reason: collision with root package name */
    public final String f145590b;

    static {
        Covode.recordClassIndex(95627);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f145589a, dVar.f145589a) && l.a(this.f145590b, dVar.f145590b);
    }

    public final int hashCode() {
        String str = this.f145589a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f145590b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LocalParam(topActivity=" + this.f145589a + ", topPage=" + this.f145590b + ")";
    }

    public d(String str, String str2) {
        this.f145589a = str;
        this.f145590b = str2;
    }
}
