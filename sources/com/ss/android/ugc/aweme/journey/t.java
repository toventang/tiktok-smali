package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class t {
    @c(a = "impr_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f105182a;

    static {
        Covode.recordClassIndex(67434);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof t) && l.a(this.f105182a, ((t) obj).f105182a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f105182a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LogPbBean(imprId=" + this.f105182a + ")";
    }
}
