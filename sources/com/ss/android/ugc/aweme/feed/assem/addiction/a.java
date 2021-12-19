package com.ss.android.ugc.aweme.feed.assem.addiction;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f91988a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f91989b;

    /* renamed from: c  reason: collision with root package name */
    public final String f91990c;

    static {
        Covode.recordClassIndex(57919);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f91988a == aVar.f91988a && this.f91989b == aVar.f91989b && l.a(this.f91990c, aVar.f91990c);
    }

    public final int hashCode() {
        boolean z = this.f91988a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f91989b) {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str = this.f91990c;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoAntiAddicationData(priState=" + this.f91988a + ", relieveState=" + this.f91989b + ", miniteState=" + this.f91990c + ")";
    }

    public /* synthetic */ a() {
        this(false, false, "");
    }

    private a(boolean z, boolean z2, String str) {
        l.d(str, "");
        this.f91988a = z;
        this.f91989b = z2;
        this.f91990c = str;
    }

    public static /* synthetic */ a a(a aVar, boolean z, boolean z2, String str, int i2) {
        if ((i2 & 1) != 0) {
            z = aVar.f91988a;
        }
        if ((i2 & 2) != 0) {
            z2 = aVar.f91989b;
        }
        if ((i2 & 4) != 0) {
            str = aVar.f91990c;
        }
        l.d(str, "");
        return new a(z, z2, str);
    }
}
