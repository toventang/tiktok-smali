package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final k f71758a;

    /* renamed from: b  reason: collision with root package name */
    public final i f71759b;

    static {
        Covode.recordClassIndex(44129);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f71758a, hVar.f71758a) && l.a(this.f71759b, hVar.f71759b);
    }

    public final int hashCode() {
        k kVar = this.f71758a;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        i iVar = this.f71759b;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PinEvent(status=" + this.f71758a + ", notice=" + this.f71759b + ")";
    }

    public h(k kVar, i iVar) {
        l.d(kVar, "");
        this.f71758a = kVar;
        this.f71759b = iVar;
    }
}
