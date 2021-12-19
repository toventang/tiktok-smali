package com.ss.android.ugc.aweme.ac;

import com.bytedance.covode.number.Covode;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f62561a;

    static {
        Covode.recordClassIndex(38493);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && this.f62561a == ((b) obj).f62561a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f62561a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "LogoutContext(isChildrenModeUser=" + this.f62561a + ")";
    }

    public b(boolean z) {
        this.f62561a = z;
    }
}
