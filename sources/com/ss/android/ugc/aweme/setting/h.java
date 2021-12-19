package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class h {
    @c(a = "locale")

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f122199a = null;

    static {
        Covode.recordClassIndex(80113);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f122199a, ((h) obj).f122199a);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.f122199a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CreatorLocale(locale=" + this.f122199a + ")";
    }

    private h() {
    }
}
