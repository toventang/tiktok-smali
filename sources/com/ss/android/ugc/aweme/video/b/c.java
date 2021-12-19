package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class c {
    @com.google.gson.a.c(a = "dynamic_option_keys")

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f143281a = null;

    static {
        Covode.recordClassIndex(93780);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f143281a, ((c) obj).f143281a);
        }
        return true;
    }

    public final int hashCode() {
        List<d> list = this.f143281a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DynamicOptionConfig(dynamicOptionModelList=" + this.f143281a + ")";
    }

    private c() {
    }
}
