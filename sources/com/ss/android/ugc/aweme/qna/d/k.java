package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class k {
    @c(a = "src_content")

    /* renamed from: a  reason: collision with root package name */
    public final String f119359a;

    static {
        Covode.recordClassIndex(77507);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof k) && l.a(this.f119359a, ((k) obj).f119359a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f119359a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TranslationContent(srcContent=" + this.f119359a + ")";
    }

    public k(String str) {
        l.d(str, "");
        this.f119359a = str;
    }
}
