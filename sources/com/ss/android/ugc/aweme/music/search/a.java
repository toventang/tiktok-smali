package com.ss.android.ugc.aweme.music.search;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f111653a;

    /* renamed from: b  reason: collision with root package name */
    public final String f111654b;

    /* renamed from: c  reason: collision with root package name */
    public final String f111655c;

    /* renamed from: d  reason: collision with root package name */
    public final int f111656d;

    /* renamed from: e  reason: collision with root package name */
    public final int f111657e = 20;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f111658f;

    static {
        Covode.recordClassIndex(71751);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f111653a == aVar.f111653a && l.a(this.f111654b, aVar.f111654b) && l.a(this.f111655c, aVar.f111655c) && this.f111656d == aVar.f111656d && this.f111657e == aVar.f111657e && this.f111658f == aVar.f111658f;
    }

    public final int hashCode() {
        int i2 = this.f111653a * 31;
        String str = this.f111654b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f111655c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (((((hashCode + i3) * 31) + this.f111656d) * 31) + this.f111657e) * 31;
        boolean z = this.f111658f;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "CursorData(requestUUID=" + this.f111653a + ", secUid=" + this.f111654b + ", keyword=" + this.f111655c + ", cursor=" + this.f111656d + ", count=" + this.f111657e + ", isFirst=" + this.f111658f + ")";
    }

    public a(int i2, String str, String str2, int i3, boolean z) {
        this.f111653a = i2;
        this.f111654b = str;
        this.f111655c = str2;
        this.f111656d = i3;
        this.f111658f = z;
    }
}
