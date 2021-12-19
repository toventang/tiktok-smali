package com.ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;

public final class c {
    @com.google.gson.a.c(a = "result")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f65137a;

    static {
        Covode.recordClassIndex(40042);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.f65137a == ((c) obj).f65137a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f65137a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BoolResult(result=" + this.f65137a + ")";
    }
}
