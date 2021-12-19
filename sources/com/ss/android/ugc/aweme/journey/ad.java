package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class ad {
    @c(a = "steps")

    /* renamed from: a  reason: collision with root package name */
    public final List<aa> f104819a;

    static {
        Covode.recordClassIndex(67229);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ad) && l.a(this.f104819a, ((ad) obj).f104819a);
        }
        return true;
    }

    public final int hashCode() {
        List<aa> list = this.f104819a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OrderedFlow(steps=" + this.f104819a + ")";
    }
}
