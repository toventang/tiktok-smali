package com.ss.android.ugc.aweme.discover.lynx.spark.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.page.c;
import com.ss.android.ugc.aweme.discover.lynx.b.d;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f81569a;

    /* renamed from: b  reason: collision with root package name */
    public final c f81570b;

    /* renamed from: c  reason: collision with root package name */
    public d f81571c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f81572d;

    static {
        Covode.recordClassIndex(50692);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f81569a, bVar.f81569a) && l.a(this.f81570b, bVar.f81570b) && l.a(this.f81571c, bVar.f81571c) && this.f81572d == bVar.f81572d;
    }

    public final int hashCode() {
        String str = this.f81569a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.f81570b;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        d dVar = this.f81571c;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f81572d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "SparkCache(name=" + this.f81569a + ", sparkView=" + this.f81570b + ", preloadStatus=" + this.f81571c + ", prerender=" + this.f81572d + ")";
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        this.f81571c = dVar;
    }

    private b(String str, c cVar, d dVar) {
        l.d(str, "");
        l.d(cVar, "");
        l.d(dVar, "");
        this.f81569a = str;
        this.f81570b = cVar;
        this.f81571c = dVar;
        this.f81572d = false;
    }

    public /* synthetic */ b(String str, c cVar, d dVar, byte b2) {
        this(str, cVar, dVar);
    }
}
