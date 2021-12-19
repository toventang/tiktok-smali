package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f74891a;

    /* renamed from: b  reason: collision with root package name */
    public final String f74892b;

    static {
        Covode.recordClassIndex(46172);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f74891a == hVar.f74891a && l.a(this.f74892b, hVar.f74892b);
    }

    public final int hashCode() {
        int i2 = this.f74891a * 31;
        String str = this.f74892b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdHalfWebPageShowParams(delay=" + this.f74891a + ", eventType=" + this.f74892b + ")";
    }

    public h(int i2, String str) {
        this.f74891a = i2;
        this.f74892b = str;
    }
}
