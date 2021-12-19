package com.bytedance.ies.ugc.statisticlogger.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements com.bytedance.ies.foundation.base.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f35316a;

    static {
        Covode.recordClassIndex(21143);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f35316a, ((a) obj).f35316a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f35316a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivityBTMConfig(pageName=" + this.f35316a + ")";
    }
}
