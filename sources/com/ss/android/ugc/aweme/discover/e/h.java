package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public d f80961a;

    static {
        Covode.recordClassIndex(50328);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && l.a(this.f80961a, ((h) obj).f80961a);
        }
        return true;
    }

    public final int hashCode() {
        d dVar = this.f80961a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "InnerSearchEvent(param=" + this.f80961a + ")";
    }

    public h(d dVar) {
        l.d(dVar, "");
        this.f80961a = dVar;
    }
}
