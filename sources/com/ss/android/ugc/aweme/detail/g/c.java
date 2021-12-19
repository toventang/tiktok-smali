package com.ss.android.ugc.aweme.detail.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f79638a;

    static {
        Covode.recordClassIndex(49479);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f79638a, ((c) obj).f79638a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f79638a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DetailVideoFirstFrameEvent(aid=" + this.f79638a + ")";
    }

    public c(String str) {
        this.f79638a = str;
    }
}
