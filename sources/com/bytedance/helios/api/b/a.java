package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f30642a;

    /* renamed from: b  reason: collision with root package name */
    public long f30643b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30644c;

    static {
        Covode.recordClassIndex(17803);
    }

    public a() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30642a == aVar.f30642a && this.f30643b == aVar.f30643b && l.a(this.f30644c, aVar.f30644c);
    }

    public final int hashCode() {
        long j2 = this.f30643b;
        int i2 = ((this.f30642a * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f30644c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorExtra(anchorCheckCount=" + this.f30642a + ", lastAnchorCheckTime=" + this.f30643b + ", checkType=" + this.f30644c + ")";
    }

    public a(String str) {
        l.c(str, "");
        this.f30642a = 0;
        this.f30643b = 0;
        this.f30644c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i2) {
        this((i2 & 4) != 0 ? "" : str);
    }
}
