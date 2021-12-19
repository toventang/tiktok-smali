package com.bytedance.android.monitorV2.h.a;

import com.bytedance.covode.number.Covode;
import h.m.l;

public final class b implements Comparable<b> {

    /* renamed from: a  reason: collision with root package name */
    public String f23938a;

    /* renamed from: b  reason: collision with root package name */
    public l f23939b;

    static {
        Covode.recordClassIndex(14131);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.f.b.l.a(this.f23938a, bVar.f23938a) && h.f.b.l.a(this.f23939b, bVar.f23939b);
    }

    public final int hashCode() {
        String str = this.f23938a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        l lVar = this.f23939b;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return this.f23938a + ": [" + this.f23939b + ']';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        h.f.b.l.c(bVar2, "");
        return bVar2.f23939b.getPattern().length() - this.f23939b.getPattern().length();
    }

    public b(String str, l lVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(lVar, "");
        this.f23938a = str;
        this.f23939b = lVar;
    }
}
