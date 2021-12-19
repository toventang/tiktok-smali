package com.ss.android.ugc.aweme.sertting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    @c(a = "url_regex")

    /* renamed from: a  reason: collision with root package name */
    public final String f121824a;
    @c(a = "url_config")

    /* renamed from: b  reason: collision with root package name */
    public final List<PersonalizationModel> f121825b;

    static {
        Covode.recordClassIndex(79340);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f121824a, aVar.f121824a) && l.a(this.f121825b, aVar.f121825b);
    }

    public final int hashCode() {
        String str = this.f121824a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<PersonalizationModel> list = this.f121825b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DeeplinkPersonalizationConfig(urlRegex=" + this.f121824a + ", urlConfig=" + this.f121825b + ")";
    }

    private /* synthetic */ a() {
        this("", new ArrayList());
    }

    private a(String str, List<PersonalizationModel> list) {
        l.d(str, "");
        l.d(list, "");
        this.f121824a = str;
        this.f121825b = list;
    }
}
