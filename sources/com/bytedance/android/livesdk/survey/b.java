package com.bytedance.android.livesdk.survey;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f21512a;

    /* renamed from: b  reason: collision with root package name */
    public final long f21513b;

    static {
        Covode.recordClassIndex(12659);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f21512a, bVar.f21512a) && this.f21513b == bVar.f21513b;
    }

    public final int hashCode() {
        String str = this.f21512a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.f21513b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "SurveyChooseClickData(questionId=" + this.f21512a + ", optionId=" + this.f21513b + ")";
    }

    public b(String str, long j2) {
        l.d(str, "");
        this.f21512a = str;
        this.f21513b = j2;
    }
}
