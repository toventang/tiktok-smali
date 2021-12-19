package com.ss.android.ugc.aweme.qna.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "translation_info")

    /* renamed from: a  reason: collision with root package name */
    public final List<k> f119273a;
    @c(a = "trg_lang")

    /* renamed from: b  reason: collision with root package name */
    public final String f119274b;

    static {
        Covode.recordClassIndex(77475);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f119273a, aVar.f119273a) && l.a(this.f119274b, aVar.f119274b);
    }

    public final int hashCode() {
        List<k> list = this.f119273a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f119274b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiTranslationBody(translationInfos=" + this.f119273a + ", trgLang=" + this.f119274b + ")";
    }

    public a(List<k> list, String str) {
        l.d(list, "");
        l.d(str, "");
        this.f119273a = list;
        this.f119274b = str;
    }
}
