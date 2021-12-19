package com.ss.android.ugc.aweme.net.preload;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f112509a;

    /* renamed from: b  reason: collision with root package name */
    public final u<?> f112510b;

    /* renamed from: c  reason: collision with root package name */
    public long f112511c;

    static {
        Covode.recordClassIndex(72309);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f112509a, eVar.f112509a) && l.a(this.f112510b, eVar.f112510b) && this.f112511c == eVar.f112511c;
    }

    public final int hashCode() {
        f fVar = this.f112509a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        u<?> uVar = this.f112510b;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        long j2 = this.f112511c;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PreloadRecord(preloadRequestContext=" + this.f112509a + ", response=" + this.f112510b + ", lastModified=" + this.f112511c + ")";
    }

    public final long a() {
        return System.currentTimeMillis() - this.f112511c;
    }

    public /* synthetic */ e(f fVar, u uVar) {
        this(fVar, uVar, System.currentTimeMillis());
    }

    private e(f fVar, u<?> uVar, long j2) {
        l.d(fVar, "");
        l.d(uVar, "");
        this.f112509a = fVar;
        this.f112510b = uVar;
        this.f112511c = j2;
    }
}
