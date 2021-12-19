package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class q {
    @c(a = "hotspot_items")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f81854a;
    @c(a = "hotspot")

    /* renamed from: b  reason: collision with root package name */
    public final r f81855b;
    @c(a = "ala_src")

    /* renamed from: c  reason: collision with root package name */
    public final String f81856c;
    @c(a = "doc_id")

    /* renamed from: d  reason: collision with root package name */
    public String f81857d;

    static {
        Covode.recordClassIndex(50827);
    }

    public final int hashCode() {
        r rVar = this.f81855b;
        if (rVar != null) {
            return rVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchSpot");
        return l.a(this.f81855b, ((q) obj).f81855b);
    }
}
