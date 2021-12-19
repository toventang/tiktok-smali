package com.ss.android.ugc.aweme.im.sdk.relations.data.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class d {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final int f102994a = 63;
    @c(a = "event")

    /* renamed from: b  reason: collision with root package name */
    public final String f102995b;

    static {
        Covode.recordClassIndex(66021);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f102994a == dVar.f102994a && l.a(this.f102995b, dVar.f102995b);
    }

    public final int hashCode() {
        int i2 = this.f102994a * 31;
        String str = this.f102995b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RelationTypeParameters(type=" + this.f102994a + ", event=" + this.f102995b + ")";
    }

    public d(String str) {
        l.d(str, "");
        this.f102995b = str;
    }
}
