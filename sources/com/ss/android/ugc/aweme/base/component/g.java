package com.ss.android.ugc.aweme.base.component;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f68067a;

    static {
        Covode.recordClassIndex(41926);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof g) && l.a(this.f68067a, ((g) obj).f68067a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f68067a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RetryEvent(publishId=" + this.f68067a + ")";
    }

    public g(String str) {
        l.d(str, "");
        this.f68067a = str;
    }
}
