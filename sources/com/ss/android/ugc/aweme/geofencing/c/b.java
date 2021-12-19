package com.ss.android.ugc.aweme.geofencing.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "translations")

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f99051a;

    static {
        Covode.recordClassIndex(62981);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f99051a, ((b) obj).f99051a);
        }
        return true;
    }

    public final int hashCode() {
        List<a> list = this.f99051a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Translations(translations=" + this.f99051a + ")";
    }
}
