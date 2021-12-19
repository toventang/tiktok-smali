package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements com.bytedance.ies.foundation.base.f {

    /* renamed from: a  reason: collision with root package name */
    public final w f65536a;

    static {
        Covode.recordClassIndex(40318);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f65536a, ((f) obj).f65536a);
        }
        return true;
    }

    public final int hashCode() {
        w wVar = this.f65536a;
        if (wVar != null) {
            return wVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivityForResultConfig(listener=" + this.f65536a + ")";
    }

    public f(w wVar) {
        l.d(wVar, "");
        this.f65536a = wVar;
    }
}
