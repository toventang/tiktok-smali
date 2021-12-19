package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f30663a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30664b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30665c;

    static {
        Covode.recordClassIndex(17814);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f30663a, jVar.f30663a) && this.f30664b == jVar.f30664b && this.f30665c == jVar.f30665c;
    }

    public final int hashCode() {
        String str = this.f30663a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f30664b) * 31) + this.f30665c;
    }

    public final String toString() {
        return "FrequencyLog(name=" + this.f30663a + ", callCount=" + this.f30664b + ", callThreshold=" + this.f30665c + ")";
    }

    public j(String str, int i2, int i3) {
        l.c(str, "");
        this.f30663a = str;
        this.f30664b = i2;
        this.f30665c = i3;
    }
}
