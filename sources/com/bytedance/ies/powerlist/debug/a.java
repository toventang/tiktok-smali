package com.bytedance.ies.powerlist.debug;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b<b, z> f34283a;

    static {
        Covode.recordClassIndex(20482);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f34283a, ((a) obj).f34283a);
        }
        return true;
    }

    public final int hashCode() {
        b<b, z> bVar = this.f34283a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FpsAbility(onMonitorFps=" + this.f34283a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.debug.b, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super b, z> bVar) {
        l.c(bVar, "");
        this.f34283a = bVar;
    }
}
