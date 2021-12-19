package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f119472a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f119473b;

    /* renamed from: c  reason: collision with root package name */
    public final int f119474c;

    static {
        Covode.recordClassIndex(77659);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f119472a, aVar.f119472a) && this.f119473b == aVar.f119473b && this.f119474c == aVar.f119474c;
    }

    public final int hashCode() {
        String str = this.f119472a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f119473b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return ((hashCode + i2) * 31) + this.f119474c;
    }

    public final String toString() {
        return "AnswerLaterMutableLiveData(questionId=" + this.f119472a + ", success=" + this.f119473b + ", state=" + this.f119474c + ")";
    }

    public a(String str, boolean z, int i2) {
        l.d(str, "");
        this.f119472a = str;
        this.f119473b = z;
        this.f119474c = i2;
    }
}
