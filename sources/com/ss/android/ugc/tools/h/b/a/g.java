package com.ss.android.ugc.tools.h.b.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class g<KEY, RESULT, INFO> {

    /* renamed from: a  reason: collision with root package name */
    public final KEY f149254a;

    /* renamed from: b  reason: collision with root package name */
    public final RESULT f149255b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f149256c;

    /* renamed from: d  reason: collision with root package name */
    public final INFO f149257d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f149258e;

    /* renamed from: f  reason: collision with root package name */
    public final Exception f149259f;

    static {
        Covode.recordClassIndex(98296);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f149254a, gVar.f149254a) && l.a(this.f149255b, gVar.f149255b) && this.f149256c == gVar.f149256c && l.a(this.f149257d, gVar.f149257d) && l.a(this.f149258e, gVar.f149258e) && l.a(this.f149259f, gVar.f149259f);
    }

    public final int hashCode() {
        KEY key = this.f149254a;
        int i2 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * 31;
        RESULT result = this.f149255b;
        int hashCode2 = (hashCode + (result != null ? result.hashCode() : 0)) * 31;
        boolean z = this.f149256c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        INFO info = this.f149257d;
        int hashCode3 = (i6 + (info != null ? info.hashCode() : 0)) * 31;
        Long l2 = this.f149258e;
        int hashCode4 = (hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Exception exc = this.f149259f;
        if (exc != null) {
            i2 = exc.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ExecuteResult(key=" + ((Object) this.f149254a) + ", result=" + ((Object) this.f149255b) + ", cached=" + this.f149256c + ", info=" + ((Object) this.f149257d) + ", duration=" + this.f149258e + ", exception=" + this.f149259f + ")";
    }

    public g(KEY key, RESULT result, boolean z, INFO info, Long l2, Exception exc) {
        this.f149254a = key;
        this.f149255b = result;
        this.f149256c = z;
        this.f149257d = info;
        this.f149258e = l2;
        this.f149259f = exc;
    }
}
