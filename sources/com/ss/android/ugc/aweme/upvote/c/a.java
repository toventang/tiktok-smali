package com.ss.android.ugc.aweme.upvote.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "src_content")

    /* renamed from: a  reason: collision with root package name */
    public final String f142028a;

    static {
        Covode.recordClassIndex(92820);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f142028a, ((a) obj).f142028a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f142028a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TranslationContent(srcContent=" + this.f142028a + ")";
    }

    public a(String str) {
        l.d(str, "");
        this.f142028a = str;
    }
}
