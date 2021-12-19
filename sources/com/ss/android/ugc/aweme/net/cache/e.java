package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final u<?> f112263a;

    /* renamed from: b  reason: collision with root package name */
    public long f112264b;

    static {
        Covode.recordClassIndex(72143);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f112263a, eVar.f112263a) && this.f112264b == eVar.f112264b;
    }

    public final int hashCode() {
        u<?> uVar = this.f112263a;
        int hashCode = uVar != null ? uVar.hashCode() : 0;
        long j2 = this.f112264b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "CacheRecord(response=" + this.f112263a + ", lastModified=" + this.f112264b + ")";
    }

    public /* synthetic */ e(u uVar) {
        this(uVar, System.currentTimeMillis());
    }

    private e(u<?> uVar, long j2) {
        l.d(uVar, "");
        this.f112263a = uVar;
        this.f112264b = j2;
    }
}
