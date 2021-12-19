package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = "options")

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f84335a;
    @c(a = "header")

    /* renamed from: b  reason: collision with root package name */
    public final g f84336b;
    @c(a = "session_key")

    /* renamed from: c  reason: collision with root package name */
    public final String f84337c;

    static {
        Covode.recordClassIndex(52581);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f84335a, eVar.f84335a) && l.a(this.f84336b, eVar.f84336b) && l.a(this.f84337c, eVar.f84337c);
    }

    public final int hashCode() {
        List<d> list = this.f84335a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        g gVar = this.f84336b;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f84337c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CandInputDataOptions(candInputOptions=" + this.f84335a + ", candHeader=" + this.f84336b + ", sessionKey=" + this.f84337c + ")";
    }
}
