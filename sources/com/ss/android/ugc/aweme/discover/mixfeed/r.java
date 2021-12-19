package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Objects;

public final class r {
    @c(a = "event_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f81858a;
    @c(a = "sentence")

    /* renamed from: b  reason: collision with root package name */
    public String f81859b = "";
    @c(a = "hot_value")

    /* renamed from: c  reason: collision with root package name */
    public long f81860c;
    @c(a = "rank_number")

    /* renamed from: d  reason: collision with root package name */
    public String f81861d;
    @c(a = "icon")

    /* renamed from: e  reason: collision with root package name */
    public String f81862e;
    @c(a = "button_link")

    /* renamed from: f  reason: collision with root package name */
    public final String f81863f;
    @c(a = "button_title")

    /* renamed from: g  reason: collision with root package name */
    public final String f81864g;

    static {
        Covode.recordClassIndex(50828);
    }

    public final int hashCode() {
        return this.f81859b.hashCode();
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchSpotInfo");
        if (!l.a((Object) this.f81859b, (Object) ((r) obj).f81859b)) {
            return false;
        }
        return true;
    }
}
