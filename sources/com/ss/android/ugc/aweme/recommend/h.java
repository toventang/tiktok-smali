package com.ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f120064a;

    /* renamed from: b  reason: collision with root package name */
    public final String f120065b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120066c;

    static {
        Covode.recordClassIndex(78045);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f120064a, hVar.f120064a) && l.a(this.f120065b, hVar.f120065b) && l.a(this.f120066c, hVar.f120066c);
    }

    public final int hashCode() {
        String str = this.f120064a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f120065b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f120066c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "RecommendMobParams(enterFrom=" + this.f120064a + ", previousPage=" + this.f120065b + ", pageStatus=" + this.f120066c + ")";
    }

    public /* synthetic */ h() {
        this("", "", "");
    }

    public h(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f120064a = str;
        this.f120065b = str2;
        this.f120066c = str3;
    }
}
