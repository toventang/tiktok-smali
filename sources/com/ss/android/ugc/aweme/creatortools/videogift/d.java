package com.ss.android.ugc.aweme.creatortools.videogift;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class d {
    @c(a = "description")

    /* renamed from: a  reason: collision with root package name */
    public final String f78478a;
    @c(a = "key")

    /* renamed from: b  reason: collision with root package name */
    public final String f78479b;
    @c(a = "status")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f78480c;

    static {
        Covode.recordClassIndex(48740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f78478a, dVar.f78478a) && l.a(this.f78479b, dVar.f78479b) && l.a(this.f78480c, dVar.f78480c);
    }

    public final int hashCode() {
        String str = this.f78478a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78479b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f78480c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "Requirement(description=" + this.f78478a + ", key=" + this.f78479b + ", status=" + this.f78480c + ")";
    }
}
