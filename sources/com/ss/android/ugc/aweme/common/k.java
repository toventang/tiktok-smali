package com.ss.android.ugc.aweme.common;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class k<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public final m f76453a;

    /* renamed from: b  reason: collision with root package name */
    public final b<DATA, z> f76454b;

    /* renamed from: c  reason: collision with root package name */
    public final b<Throwable, z> f76455c;

    static {
        Covode.recordClassIndex(47204);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f76453a, kVar.f76453a) && l.a(this.f76454b, kVar.f76454b) && l.a(this.f76455c, kVar.f76455c);
    }

    public final int hashCode() {
        m mVar = this.f76453a;
        int i2 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        b<DATA, z> bVar = this.f76454b;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b<Throwable, z> bVar2 = this.f76455c;
        if (bVar2 != null) {
            i2 = bVar2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EasyRxSubscriber(lifecycleOwner=" + this.f76453a + ", onSuccess=" + this.f76454b + ", onError=" + this.f76455c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super DATA, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(m mVar, b<? super DATA, z> bVar, b<? super Throwable, z> bVar2) {
        l.d(mVar, "");
        l.d(bVar, "");
        this.f76453a = mVar;
        this.f76454b = bVar;
        this.f76455c = bVar2;
    }
}
