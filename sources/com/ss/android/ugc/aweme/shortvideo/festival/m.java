package com.ss.android.ugc.aweme.shortvideo.festival;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f128508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f128509b;

    static {
        Covode.recordClassIndex(84259);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f128508a == mVar.f128508a && l.a(this.f128509b, mVar.f128509b);
    }

    public final int hashCode() {
        int i2 = this.f128508a * 31;
        String str = this.f128509b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "WaterFile(index=" + this.f128508a + ", path=" + this.f128509b + ")";
    }

    public m(int i2, String str) {
        l.d(str, "");
        this.f128508a = i2;
        this.f128509b = str;
    }
}
