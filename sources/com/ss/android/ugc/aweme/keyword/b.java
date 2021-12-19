package com.ss.android.ugc.aweme.keyword;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f105233a;

    /* renamed from: b  reason: collision with root package name */
    public final String f105234b;

    static {
        Covode.recordClassIndex(67465);
    }

    public b() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f105233a, bVar.f105233a) && l.a(this.f105234b, bVar.f105234b);
    }

    public final int hashCode() {
        String str = this.f105233a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105234b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchKeywordBean(keyword=" + this.f105233a + ", correctWord=" + this.f105234b + ")";
    }

    public b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f105233a = str;
        this.f105234b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
