package com.ss.android.ugc.aweme.following.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f96340a;

    /* renamed from: b  reason: collision with root package name */
    public final String f96341b;

    static {
        Covode.recordClassIndex(60995);
    }

    public f() {
        this(0, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f96340a == fVar.f96340a && l.a(this.f96341b, fVar.f96341b);
    }

    public final int hashCode() {
        int i2 = this.f96340a * 31;
        String str = this.f96341b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationTitle(type=" + this.f96340a + ", title=" + this.f96341b + ")";
    }

    public f(int i2, String str) {
        l.d(str, "");
        this.f96340a = i2;
        this.f96341b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, String str, int i3) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? "" : str);
    }
}
