package com.ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "anchorId")

    /* renamed from: a  reason: collision with root package name */
    public String f108635a;

    static {
        Covode.recordClassIndex(69625);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f108635a, ((a) obj).f108635a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f108635a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Anchor(anchorId=" + this.f108635a + ")";
    }
}
