package com.ss.android.ugc.aweme.recommend.viewmodel;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f120183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f120184b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120185c;

    static {
        Covode.recordClassIndex(78178);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f120183a, aVar.f120183a) && l.a(this.f120184b, aVar.f120184b) && l.a(this.f120185c, aVar.f120185c);
    }

    public final int hashCode() {
        String str = this.f120183a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f120184b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f120185c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "RecommendMobParams(enterFrom=" + this.f120183a + ", previousPage=" + this.f120184b + ", pageStatus=" + this.f120185c + ")";
    }

    public /* synthetic */ a() {
        this("", "", "");
    }

    public a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f120183a = str;
        this.f120184b = str2;
        this.f120185c = str3;
    }
}
