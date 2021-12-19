package com.ss.android.ugc.aweme.following.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f96337a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f96338b;

    /* renamed from: c  reason: collision with root package name */
    public final String f96339c;

    static {
        Covode.recordClassIndex(60994);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f96337a == eVar.f96337a && this.f96338b == eVar.f96338b && l.a(this.f96339c, eVar.f96339c);
    }

    public final int hashCode() {
        int i2 = this.f96337a * 31;
        boolean z = this.f96338b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        String str = this.f96339c;
        return i6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationStatusItem(type=" + this.f96337a + ", isMySelf=" + this.f96338b + ", des=" + this.f96339c + ")";
    }

    public /* synthetic */ e(int i2, boolean z) {
        this(i2, z, "");
    }

    public e(int i2, boolean z, String str) {
        l.d(str, "");
        this.f96337a = i2;
        this.f96338b = z;
        this.f96339c = str;
    }
}
