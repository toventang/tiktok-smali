package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class h<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final b<DATA, z> f76429a;

    /* renamed from: b  reason: collision with root package name */
    public final b<Throwable, z> f76430b;

    static {
        Covode.recordClassIndex(47186);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f76429a, hVar.f76429a) && l.a(this.f76430b, hVar.f76430b);
    }

    public final int hashCode() {
        b<DATA, z> bVar = this.f76429a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        b<Throwable, z> bVar2 = this.f76430b;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EasyRxInterceptor(onSuccess=" + this.f76429a + ", onError=" + this.f76430b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super DATA, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(b<? super DATA, z> bVar, b<? super Throwable, z> bVar2) {
        l.d(bVar, "");
        this.f76429a = bVar;
        this.f76430b = bVar2;
    }
}
