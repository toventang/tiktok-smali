package com.ss.android.ugc.aweme.crossplatform.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final long f78593a;

    static {
        Covode.recordClassIndex(48802);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f78593a == ((d) obj).f78593a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f78593a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "WebviewFinishEvent(duration=" + this.f78593a + ")";
    }

    public d(long j2) {
        this.f78593a = j2;
    }
}
