package com.ss.android.ugc.aweme.discover.mixfeed.cs;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f81714a;

    /* renamed from: b  reason: collision with root package name */
    public final d f81715b;

    static {
        Covode.recordClassIndex(50763);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f81714a == eVar.f81714a && l.a(this.f81715b, eVar.f81715b);
    }

    public final int hashCode() {
        int i2 = this.f81714a * 31;
        d dVar = this.f81715b;
        return i2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClickSearchFetchState(awemeIndex=" + this.f81714a + ", stage=" + this.f81715b + ")";
    }

    public e(int i2, d dVar) {
        l.d(dVar, "");
        this.f81714a = i2;
        this.f81715b = dVar;
    }
}
