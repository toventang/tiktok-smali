package com.ss.android.ugc.aweme.mix.b;

import com.bytedance.covode.number.Covode;

public final class b implements com.ss.android.ugc.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f109808a = false;

    static {
        Covode.recordClassIndex(70321);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f109808a == ((b) obj).f109808a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f109808a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ChangePlayListEntryShowEvent(show=" + this.f109808a + ")";
    }
}
