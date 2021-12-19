package com.bytedance.assem.arch.extensions;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class s<A, B, C, D> {

    /* renamed from: a  reason: collision with root package name */
    public final A f25665a;

    /* renamed from: b  reason: collision with root package name */
    public final B f25666b;

    /* renamed from: c  reason: collision with root package name */
    public final C f25667c;

    /* renamed from: d  reason: collision with root package name */
    public final D f25668d;

    static {
        Covode.recordClassIndex(14932);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f25665a, sVar.f25665a) && l.a(this.f25666b, sVar.f25666b) && l.a(this.f25667c, sVar.f25667c) && l.a(this.f25668d, sVar.f25668d);
    }

    public final int hashCode() {
        A a2 = this.f25665a;
        int i2 = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        B b2 = this.f25666b;
        int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
        C c2 = this.f25667c;
        int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
        D d2 = this.f25668d;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "Tuple4(a=" + ((Object) this.f25665a) + ", b=" + ((Object) this.f25666b) + ", c=" + ((Object) this.f25667c) + ", d=" + ((Object) this.f25668d) + ")";
    }

    public s(A a2, B b2, C c2, D d2) {
        this.f25665a = a2;
        this.f25666b = b2;
        this.f25667c = c2;
        this.f25668d = d2;
    }
}
