package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

public final class z<F, S, T> {

    /* renamed from: a  reason: collision with root package name */
    public final F f128064a;

    /* renamed from: b  reason: collision with root package name */
    public final S f128065b;

    /* renamed from: c  reason: collision with root package name */
    public final T f128066c;

    static {
        Covode.recordClassIndex(83927);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        F f2 = this.f128064a;
        int i2 = 0;
        if (f2 == null) {
            hashCode = 0;
        } else {
            hashCode = f2.hashCode();
        }
        S s = this.f128065b;
        if (s == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s.hashCode();
        }
        int i3 = hashCode ^ hashCode2;
        T t = this.f128066c;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 ^ i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!a(zVar.f128064a, this.f128064a) || !a(zVar.f128065b, this.f128065b) || !a(zVar.f128066c, this.f128066c)) {
            return false;
        }
        return true;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static <A, B, C> z<A, B, C> a(A a2, B b2, C c2) {
        return new z<>(a2, b2, c2);
    }

    private z(F f2, S s, T t) {
        this.f128064a = f2;
        this.f128065b = s;
        this.f128066c = t;
    }
}
