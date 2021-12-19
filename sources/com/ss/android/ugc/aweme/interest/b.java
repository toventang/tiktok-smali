package com.ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f104762a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104763b;

    /* renamed from: c  reason: collision with root package name */
    public final int f104764c;

    static {
        Covode.recordClassIndex(67167);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104762a == bVar.f104762a && l.a(this.f104763b, bVar.f104763b) && this.f104764c == bVar.f104764c;
    }

    public final int hashCode() {
        int i2 = this.f104762a * 31;
        String str = this.f104763b;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f104764c;
    }

    public final String toString() {
        return "SelectedInterestInfo(categoryPosition=" + this.f104762a + ", interestId=" + this.f104763b + ", interestPosition=" + this.f104764c + ")";
    }

    public b(int i2, String str, int i3) {
        l.d(str, "");
        this.f104762a = i2;
        this.f104763b = str;
        this.f104764c = i3;
    }
}
