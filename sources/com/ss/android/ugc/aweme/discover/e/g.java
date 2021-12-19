package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f80960a;

    static {
        Covode.recordClassIndex(50327);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f80960a, ((g) obj).f80960a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f80960a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "HideLoadingBallEvent(page=" + this.f80960a + ")";
    }

    public g(String str) {
        l.d(str, "");
        this.f80960a = str;
    }
}
