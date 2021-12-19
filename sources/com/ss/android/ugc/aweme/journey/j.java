package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class j {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f104864a;
    @c(a = "text")

    /* renamed from: b  reason: collision with root package name */
    public final String f104865b;

    static {
        Covode.recordClassIndex(67249);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f104864a, jVar.f104864a) && l.a(this.f104865b, jVar.f104865b);
    }

    public final int hashCode() {
        String str = this.f104864a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104865b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "JourneyContentLanguageExtra(title=" + this.f104864a + ", text=" + this.f104865b + ")";
    }
}
