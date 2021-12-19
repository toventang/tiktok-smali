package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f119667a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119668b;

    static {
        Covode.recordClassIndex(77737);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f119667a, cVar.f119667a) && l.a(this.f119668b, cVar.f119668b);
    }

    public final int hashCode() {
        String str = this.f119667a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119668b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NavigateQuestionDetail(questionId=" + this.f119667a + ", enterMethod=" + this.f119668b + ")";
    }

    public c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f119667a = str;
        this.f119668b = str2;
    }
}
