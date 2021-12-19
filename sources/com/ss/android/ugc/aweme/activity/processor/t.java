package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.a;

public final class t implements a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f65554a = true;

    static {
        Covode.recordClassIndex(40338);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof t) && this.f65554a == ((t) obj).f65554a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f65554a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "EventBusConfig(enable=" + this.f65554a + ")";
    }
}
