package com.ss.android.ugc.aweme.activity;

import com.bytedance.covode.number.Covode;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f65527a;

    static {
        Covode.recordClassIndex(40307);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f65527a == ((b) obj).f65527a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f65527a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "SkyLightShownEvent(shown=" + this.f65527a + ")";
    }

    public b(boolean z) {
        this.f65527a = z;
    }
}
