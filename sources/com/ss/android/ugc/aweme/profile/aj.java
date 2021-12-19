package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class aj implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f115959a;

    static {
        Covode.recordClassIndex(74787);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof aj) && this.f115959a == ((aj) obj).f115959a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f115959a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "SafeInfoNoticeEvent(hasPrior=" + this.f115959a + ")";
    }

    public aj(boolean z) {
        this.f115959a = z;
    }
}
