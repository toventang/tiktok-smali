package com.ss.android.ugc.aweme.al;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f66366a;

    static {
        Covode.recordClassIndex(40782);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && this.f66366a == ((f) obj).f66366a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f66366a;
    }

    public final String toString() {
        return "UserLoginStateChangeEvent(type=" + this.f66366a + ")";
    }

    public f(int i2) {
        this.f66366a = i2;
    }
}
