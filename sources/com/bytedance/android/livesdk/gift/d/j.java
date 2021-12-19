package com.bytedance.android.livesdk.gift.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17856a = true;

    /* renamed from: b  reason: collision with root package name */
    public final String f17857b;

    static {
        Covode.recordClassIndex(9923);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17856a == jVar.f17856a && l.a(this.f17857b, jVar.f17857b);
    }

    public final int hashCode() {
        boolean z = this.f17856a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f17857b;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SendEnvelope(send=" + this.f17856a + ", source=" + this.f17857b + ")";
    }

    public j(String str) {
        l.d(str, "");
        this.f17857b = str;
    }
}
