package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final a<z> f70684a;

    /* renamed from: b  reason: collision with root package name */
    public final b<s, z> f70685b;

    static {
        Covode.recordClassIndex(43581);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return l.a(this.f70684a, tVar.f70684a) && l.a(this.f70685b, tVar.f70685b);
    }

    public final int hashCode() {
        a<z> aVar = this.f70684a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b<s, z> bVar = this.f70685b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CloseChooseMusicEvent(closeAnimEndFun=" + this.f70684a + ", chooseMusicResultFun=" + this.f70685b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.choosemusic.model.s, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public t(a<z> aVar, b<? super s, z> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        this.f70684a = aVar;
        this.f70685b = bVar;
    }
}
