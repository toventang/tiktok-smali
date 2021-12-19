package com.ss.android.ugc.tools.h.b.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f149329a;

    /* renamed from: b  reason: collision with root package name */
    public final int f149330b;

    /* renamed from: c  reason: collision with root package name */
    public final String f149331c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f149332d;

    /* renamed from: e  reason: collision with root package name */
    public final String f149333e;

    static {
        Covode.recordClassIndex(98339);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f149329a == kVar.f149329a && this.f149330b == kVar.f149330b && l.a(this.f149331c, kVar.f149331c) && this.f149332d == kVar.f149332d && l.a(this.f149333e, kVar.f149333e);
    }

    public final int hashCode() {
        int i2 = ((this.f149329a * 31) + this.f149330b) * 31;
        String str = this.f149331c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f149332d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        String str2 = this.f149333e;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "EpCategoryCursorData(cursor=" + this.f149329a + ", sortingPosting=" + this.f149330b + ", version=" + this.f149331c + ", hasMore=" + this.f149332d + ", category=" + this.f149333e + ")";
    }

    public k(int i2, int i3, String str, boolean z, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f149329a = i2;
        this.f149330b = i3;
        this.f149331c = str;
        this.f149332d = z;
        this.f149333e = str2;
    }
}
