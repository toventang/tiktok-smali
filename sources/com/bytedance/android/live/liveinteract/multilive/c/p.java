package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final n f11772a;

    static {
        Covode.recordClassIndex(6418);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && l.a(this.f11772a, ((p) obj).f11772a);
        }
        return true;
    }

    public final int hashCode() {
        n nVar = this.f11772a;
        if (nVar != null) {
            return nVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiLiveSetting(layoutType=" + this.f11772a + ")";
    }

    public p(n nVar) {
        l.d(nVar, "");
        this.f11772a = nVar;
    }
}
