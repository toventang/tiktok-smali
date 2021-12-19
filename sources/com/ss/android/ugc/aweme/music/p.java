package com.ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f111561a;

    /* renamed from: b  reason: collision with root package name */
    public final q f111562b;

    /* renamed from: c  reason: collision with root package name */
    public final int f111563c;

    static {
        Covode.recordClassIndex(71691);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f111561a == pVar.f111561a && l.a(this.f111562b, pVar.f111562b) && this.f111563c == pVar.f111563c;
    }

    public final int hashCode() {
        boolean z = this.f111561a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        q qVar = this.f111562b;
        return ((i5 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.f111563c;
    }

    public final String toString() {
        return "PinEvent(isPin=" + this.f111561a + ", status=" + this.f111562b + ", capacity=" + this.f111563c + ")";
    }

    public /* synthetic */ p(boolean z, q qVar) {
        this(z, qVar, 3);
    }

    public p(boolean z, q qVar, int i2) {
        l.d(qVar, "");
        this.f111561a = z;
        this.f111562b = qVar;
        this.f111563c = i2;
    }
}
