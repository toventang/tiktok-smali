package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f119362a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119363b;

    /* renamed from: c  reason: collision with root package name */
    public final String f119364c;

    /* renamed from: d  reason: collision with root package name */
    public final String f119365d;

    static {
        Covode.recordClassIndex(77509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f119362a == mVar.f119362a && l.a(this.f119363b, mVar.f119363b) && l.a(this.f119364c, mVar.f119364c) && l.a(this.f119365d, mVar.f119365d);
    }

    public final int hashCode() {
        boolean z = this.f119362a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f119363b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f119364c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f119365d;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "TranslationResult(translationSuccess=" + this.f119362a + ", questionId=" + this.f119363b + ", originalString=" + this.f119364c + ", translatedString=" + this.f119365d + ")";
    }

    public m(boolean z, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        this.f119362a = z;
        this.f119363b = str;
        this.f119364c = str2;
        this.f119365d = str3;
    }
}
