package com.ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f92249a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f92250b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f92251c;

    static {
        Covode.recordClassIndex(58239);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f92249a, lVar.f92249a) && this.f92250b == lVar.f92250b && this.f92251c == lVar.f92251c;
    }

    public final int hashCode() {
        String str = this.f92249a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f92250b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f92251c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "VideoDisplayState(displayCount=" + this.f92249a + ", selected=" + this.f92250b + ", displayVisible=" + this.f92251c + ")";
    }

    public l(String str, boolean z, boolean z2) {
        this.f92249a = str;
        this.f92250b = z;
        this.f92251c = z2;
    }
}
