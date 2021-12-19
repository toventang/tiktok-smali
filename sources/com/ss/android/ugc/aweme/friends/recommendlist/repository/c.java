package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f96989a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f96990b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f96991c;

    static {
        Covode.recordClassIndex(61633);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f96989a, cVar.f96989a) && l.a(this.f96990b, cVar.f96990b) && l.a(this.f96991c, cVar.f96991c);
    }

    public final int hashCode() {
        String str = this.f96989a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f96990b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f96991c;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MutualListUserRequestParams(secUid=" + this.f96989a + ", cursor=" + this.f96990b + ", mutualType=" + this.f96991c + ")";
    }
}
