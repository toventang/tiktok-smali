package com.ss.android.ugc.aweme.im.sdk.common.controller.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.g.a;
import h.a.ag;
import h.v;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f102302a;

    static {
        Covode.recordClassIndex(65466);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && this.f102302a == ((d) obj).f102302a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f102302a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "FirstInitEventBody(isSuccess=" + this.f102302a + ")";
    }

    public d(boolean z) {
        super(ag.a(v.a("is_success", Boolean.valueOf(z))), null, null, 6);
        this.f102302a = z;
    }
}
