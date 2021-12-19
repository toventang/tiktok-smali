package com.ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.a;

public final class s implements a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f65553a;

    static {
        Covode.recordClassIndex(40337);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof s) && this.f65553a == ((s) obj).f65553a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f65553a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "AudioConfig(disable=" + this.f65553a + ")";
    }

    private /* synthetic */ s() {
        this(false);
    }

    public s(boolean z) {
        this.f65553a = z;
    }
}
