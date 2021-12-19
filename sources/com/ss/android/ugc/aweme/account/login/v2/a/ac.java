package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ac {
    @c(a = "message")

    /* renamed from: a  reason: collision with root package name */
    public final String f64201a = null;
    @c(a = "data")

    /* renamed from: b  reason: collision with root package name */
    public final ab f64202b = null;

    static {
        Covode.recordClassIndex(39552);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return l.a(this.f64201a, acVar.f64201a) && l.a(this.f64202b, acVar.f64202b);
    }

    public final int hashCode() {
        String str = this.f64201a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ab abVar = this.f64202b;
        if (abVar != null) {
            i2 = abVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Request2svPushChallengeResponseWarp(message=" + this.f64201a + ", data=" + this.f64202b + ")";
    }

    private ac() {
    }
}
