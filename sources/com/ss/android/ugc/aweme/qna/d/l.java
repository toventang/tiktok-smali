package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f119360a;

    /* renamed from: b  reason: collision with root package name */
    public final a f119361b;

    static {
        Covode.recordClassIndex(77508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f119360a, lVar.f119360a) && h.f.b.l.a(this.f119361b, lVar.f119361b);
    }

    public final int hashCode() {
        String str = this.f119360a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.f119361b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TranslationRequest(questionId=" + this.f119360a + ", multiTranslationBody=" + this.f119361b + ")";
    }

    public l(String str, a aVar) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        this.f119360a = str;
        this.f119361b = aVar;
    }
}
