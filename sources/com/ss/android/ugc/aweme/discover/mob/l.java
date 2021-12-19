package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f81929a;

    /* renamed from: b  reason: collision with root package name */
    public final String f81930b;

    /* renamed from: c  reason: collision with root package name */
    public final String f81931c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f81932d;

    static {
        Covode.recordClassIndex(50859);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f81929a, lVar.f81929a) && h.f.b.l.a(this.f81930b, lVar.f81930b) && h.f.b.l.a(this.f81931c, lVar.f81931c) && this.f81932d == lVar.f81932d;
    }

    public final int hashCode() {
        String str = this.f81929a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81930b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81931c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f81932d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "SearchMusicParams(event=" + this.f81929a + ", enterFrom=" + this.f81930b + ", musicId=" + this.f81931c + ", fromSearchResult=" + this.f81932d + ")";
    }

    public l(String str, String str2, String str3, boolean z) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        this.f81929a = str;
        this.f81930b = str2;
        this.f81931c = str3;
        this.f81932d = z;
    }
}
