package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class m {
    @c(a = "skip_pages")

    /* renamed from: a  reason: collision with root package name */
    public final List<Integer> f104868a;

    static {
        Covode.recordClassIndex(67252);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && l.a(this.f104868a, ((m) obj).f104868a);
        }
        return true;
    }

    public final int hashCode() {
        List<Integer> list = this.f104868a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "JourneyFlow(skip_pages=" + this.f104868a + ")";
    }
}
