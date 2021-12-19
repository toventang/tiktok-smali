package com.ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "cash_amount")

    /* renamed from: a  reason: collision with root package name */
    public final long f124686a;

    static {
        Covode.recordClassIndex(81932);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && this.f124686a == ((a) obj).f124686a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f124686a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "FissionWithdrawalNum(amount=" + this.f124686a + ")";
    }
}
