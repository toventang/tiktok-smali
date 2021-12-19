package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f119660a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119661b;

    static {
        Covode.recordClassIndex(77735);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f119660a, aVar.f119660a) && l.a(this.f119661b, aVar.f119661b);
    }

    public final int hashCode() {
        String str = this.f119660a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119661b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NavigateAwemeDetailData(awemeId=" + this.f119660a + ", content=" + this.f119661b + ")";
    }

    public a(String str, String str2) {
        this.f119660a = str;
        this.f119661b = str2;
    }
}
