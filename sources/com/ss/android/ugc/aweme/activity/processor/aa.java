package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.a;

public final class aa implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f65532a;

    static {
        Covode.recordClassIndex(40310);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aa) && this.f65532a == ((aa) obj).f65532a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f65532a;
    }

    public final String toString() {
        return "TransitionConfig(type=" + this.f65532a + ")";
    }

    public aa(int i2) {
        this.f65532a = i2;
    }
}
