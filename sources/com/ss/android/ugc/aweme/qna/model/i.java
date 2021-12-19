package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f119518a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f119519b;

    static {
        Covode.recordClassIndex(77668);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f119518a, iVar.f119518a) && this.f119519b == iVar.f119519b;
    }

    public final int hashCode() {
        String str = this.f119518a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f119519b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "QuestionIdNetworkResultData(questionId=" + this.f119518a + ", success=" + this.f119519b + ")";
    }
}
