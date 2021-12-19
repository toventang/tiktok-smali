package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class k {
    @c(a = "content_languages")

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f104866a;
    @c(a = "content_lang_dialog")

    /* renamed from: b  reason: collision with root package name */
    public final j f104867b;

    static {
        Covode.recordClassIndex(67250);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f104866a, kVar.f104866a) && l.a(this.f104867b, kVar.f104867b);
    }

    public final int hashCode() {
        List<i> list = this.f104866a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        j jVar = this.f104867b;
        if (jVar != null) {
            i2 = jVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "JourneyContentLanguageWrapper(content_languages=" + this.f104866a + ", content_lang_dialog=" + this.f104867b + ")";
    }
}
