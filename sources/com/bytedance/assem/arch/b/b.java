package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f25422a;

    /* renamed from: b  reason: collision with root package name */
    public final v<? extends d> f25423b;

    static {
        Covode.recordClassIndex(14775);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f25422a, bVar.f25422a) && l.a(this.f25423b, bVar.f25423b);
    }

    public final int hashCode() {
        a aVar = this.f25422a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        v<? extends d> vVar = this.f25423b;
        if (vVar != null) {
            i2 = vVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FireReason(case=" + this.f25422a + ", host=" + this.f25423b + ")";
    }

    public b(a aVar, v<? extends d> vVar) {
        l.c(aVar, "");
        this.f25422a = aVar;
        this.f25423b = vVar;
    }
}
