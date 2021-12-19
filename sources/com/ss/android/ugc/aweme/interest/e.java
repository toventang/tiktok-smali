package com.ss.android.ugc.aweme.interest;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f104769a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104770b;

    /* renamed from: c  reason: collision with root package name */
    public final int f104771c;

    static {
        Covode.recordClassIndex(67171);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f104769a, eVar.f104769a) && l.a(this.f104770b, eVar.f104770b) && this.f104771c == eVar.f104771c;
    }

    public final int hashCode() {
        String str = this.f104769a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104770b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + this.f104771c;
    }

    public final String toString() {
        return "UploadData(categoryData=" + this.f104769a + ", selectedInterestData=" + this.f104770b + ", selectedInterestsCount=" + this.f104771c + ")";
    }

    private /* synthetic */ e() {
        this("", "", 0);
    }

    public e(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        this.f104769a = str;
        this.f104770b = str2;
        this.f104771c = i2;
    }
}
