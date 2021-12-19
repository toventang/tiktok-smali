package com.ss.android.ugc.aweme.compliance.business.commentfilter.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    @c(a = "words")

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f76873a;

    static {
        Covode.recordClassIndex(47516);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f76873a, ((a) obj).f76873a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f76873a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Words(words=" + this.f76873a + ")";
    }

    private /* synthetic */ a() {
        this(new ArrayList());
    }

    private a(List<String> list) {
        l.d(list, "");
        this.f76873a = list;
    }
}
